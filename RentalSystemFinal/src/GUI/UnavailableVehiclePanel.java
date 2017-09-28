package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import Code.RentalFileAdapter;
import Code.VehicleFileAdapter;

/**
 * A user interface that allows to search for unvailable vehicles, check out a
 * rental, set the service to vehicle
 * 
 * @author Tomas Cachojanas
 */
public class UnavailableVehiclePanel extends JPanel
{
   private VehicleFileAdapter vehicleAdapter;
   private carRentalGuiAdapter gui;
   private RentalFileAdapter rentalAdapter;
   private MyButtonListener actionListener;
   private JScrollPane scrollPane;
   private JLabel lblType, lblModel, lblStatus, lblBookingIDCheckOut,
         lblCheckOut, lblCheckOutBooking, lblCheckOutKM, lblService,
         lblNumberPlates, lblServiceKM;
   private JTextField txfSearch, txfCheckOutID, txfCheckOutKilometers,
         txfServiceKM, txfNumberPlates;
   private JButton btnSearchID, btnUnavailable, btnCheckOut, btnSetSetvice;
   private JTextArea txaDetails;

   /**
    * Constructor initializing GUI components
    * 
    * @param adapter
    *           VehicleFileAdapter object used to retrieving and storing vehicle
    *           information
    * @param rentalAdapter
    *           RentalFileAdapter object use to retrieving and storint rental
    *           information
    */
   public UnavailableVehiclePanel(VehicleFileAdapter vehicleAdapter,
         carRentalGuiAdapter gui, RentalFileAdapter rentalAdapter)
   {
      this.setLayout(null);
      this.vehicleAdapter = vehicleAdapter;
      this.gui = gui;
      this.rentalAdapter = rentalAdapter;
      actionListener = new MyButtonListener();

      lblType = new JLabel("Type");
      lblType.setBounds(150, 60, 120, 25);
      add(lblType);

      lblModel = new JLabel("Model");
      lblModel.setBounds(320, 60, 120, 25);
      add(lblModel);

      lblStatus = new JLabel("Reg. Number");
      lblStatus.setBounds(480, 60, 120, 25);
      add(lblStatus);

      lblBookingIDCheckOut = new JLabel("Status");
      lblBookingIDCheckOut.setBounds(670, 60, 120, 25);
      add(lblBookingIDCheckOut);

      btnSearchID = new JButton("SearchID");
      btnSearchID.setBounds(510, 20, 120, 25);
      btnSearchID.addActionListener(actionListener);
      add(btnSearchID);

      txfSearch = new JTextField();
      txfSearch.setBounds(635, 20, 120, 25);
      add(txfSearch);

      btnUnavailable = new JButton("Display all unavailable vehicles");
      btnUnavailable.setBounds(180, 20, 220, 25);
      btnUnavailable.addActionListener(actionListener);
      add(btnUnavailable);

      txaDetails = new JTextArea();
      txaDetails.setEditable(false);
      scrollPane = new JScrollPane(txaDetails);
      scrollPane
            .setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      scrollPane.setBounds(50, 80, 790, 250);
      add(scrollPane);

      lblCheckOut = new JLabel("Check out a booking");
      lblCheckOut.setBounds(150, 340, 160, 25);
      add(lblCheckOut);

      lblCheckOutBooking = new JLabel("BookingID:");
      lblCheckOutBooking.setBounds(110, 380, 120, 25);
      add(lblCheckOutBooking);

      txfCheckOutID = new JTextField();
      txfCheckOutID.setBounds(220, 380, 120, 25);
      txfCheckOutID.addActionListener(actionListener);
      add(txfCheckOutID);

      btnCheckOut = new JButton("Check Out");
      btnCheckOut.addActionListener(actionListener);
      btnCheckOut.setBounds(150, 480, 120, 25);
      add(btnCheckOut);

      lblCheckOutKM = new JLabel("KM at check out:");
      lblCheckOutKM.setBounds(110, 420, 120, 25);
      add(lblCheckOutKM);

      txfCheckOutKilometers = new JTextField();
      txfCheckOutKilometers.setBounds(220, 420, 120, 25);
      txfCheckOutKilometers.addActionListener(actionListener);
      add(txfCheckOutKilometers);

      lblService = new JLabel("Vehicle Service");
      lblService.setBounds(590, 340, 160, 25);
      add(lblService);

      lblNumberPlates = new JLabel("Number Plates");
      lblNumberPlates.setBounds(550, 380, 120, 25);
      add(lblNumberPlates);

      lblServiceKM = new JLabel("KM at Service");
      lblServiceKM.setBounds(550, 420, 120, 25);
      add(lblServiceKM);

      txfNumberPlates = new JTextField();
      txfNumberPlates.setBounds(650, 380, 120, 25);
      txfNumberPlates.addActionListener(actionListener);
      add(txfNumberPlates);

      txfServiceKM = new JTextField();
      txfServiceKM.setBounds(650, 420, 120, 25);
      txfServiceKM.addActionListener(actionListener);
      add(txfServiceKM);

      btnSetSetvice = new JButton("Set service");
      btnSetSetvice.setBounds(590, 480, 120, 25);
      btnSetSetvice.addActionListener(actionListener);
      add(btnSetSetvice);
   }

   /**
    * Inner action listener class
    * 
    * @author TomasCachojanas(2454
    */
   private class MyButtonListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == btnSearchID)
         {
            int bookingID = Integer.parseInt(txfSearch.getText());

            txaDetails.setText(rentalAdapter.getRentalList()
                  .getRentalByBookingID(bookingID) + "");

            txfSearch.setText("");

         }
         else if (e.getSource() == btnUnavailable)
         {
            txaDetails.setText(vehicleAdapter.getUnavailableVehicles());

         }

         else if (e.getSource() == btnCheckOut)
         {
            int bookingID = Integer.parseInt(txfCheckOutID.getText());
            int kilometers = Integer.parseInt(txfCheckOutKilometers.getText());

            rentalAdapter.getRentalList().getRentalByBookingID(bookingID)
                  .getVehicle().setKilometers(kilometers);
            /*
             * rentalAdapter.getRentalList().getRentalByBookingID(bookingID)
             * .getVehicle().available();
             */
            vehicleAdapter.changeStatusAvailable(rentalAdapter.getRentalList()
                  .getRentalByBookingID(bookingID).getVehicle()
                  .getNumberPlates());
            rentalAdapter.deleteRentalByBookingID(bookingID);

            txfCheckOutID.setText("");
            txfCheckOutKilometers.setText("");
         }
         else if (e.getSource() == btnSetSetvice)
         {
            int serviceKM = Integer.parseInt(txfServiceKM.getText());

            vehicleAdapter.setService(txfNumberPlates.getText(), serviceKM);

            txfServiceKM.setText("");
            txfNumberPlates.setText("");
         }

      }
   }
}
