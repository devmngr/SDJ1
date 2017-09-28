package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Code.*;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UnavailableVehiclePanel extends JPanel
{
   private VehicleFileAdapter vehicleAdapter;
   private carRentalGuiAdapter gui;
   private RentalFileAdapter rentalAdapter;
   private MyButtonListener actionlistener;
   private JLabel lblType, lblModel, lblStatus, lblBookingID, lblTimeLeft;
   private JTextField txfSearch;
   private JButton btnSearchID, btnUnavailable;

   private JTextArea txaDetails;

   // buttons

   public UnavailableVehiclePanel(VehicleFileAdapter vehicleAdapter, carRentalGuiAdapter gui, RentalFileAdapter rentalAdapter)
   {
      this.setLayout(null);
      this.vehicleAdapter=vehicleAdapter;
      this.gui=gui;
      this.rentalAdapter=rentalAdapter;
      actionlistener=new MyButtonListener();

      // Create Type label
      lblType = new JLabel("Type");
      lblType.setBounds(100, 60, 120, 25);
      add(lblType);
      // create Model label

      lblModel = new JLabel("Model");
      lblModel.setBounds(250, 60, 120, 25);
      add(lblModel);

      // status label
      lblStatus = new JLabel("Status");
      lblStatus.setBounds(400, 60, 120, 25);
      add(lblStatus);
      // Booking label
      lblBookingID = new JLabel("BookingID");
      lblBookingID.setBounds(550, 60, 120, 25);
      add(lblBookingID);

      lblTimeLeft = new JLabel("TimeLeft");
      lblTimeLeft.setBounds(700, 60, 120, 25);
      add(lblTimeLeft);

      btnSearchID = new JButton("SearchID");
      btnSearchID.setBounds(510, 20, 120, 25);
      btnSearchID.addActionListener(actionlistener);
      add(btnSearchID);

      txfSearch = new JTextField();
      txfSearch.setBounds(635, 20, 120, 25);
      add(txfSearch);
      
      btnUnavailable = new JButton("Display all unavailable vehicles");
      btnUnavailable.setBounds(180, 20, 220, 25);
      btnUnavailable.addActionListener(actionlistener);
      add(btnUnavailable);

      txaDetails = new JTextArea();
      txaDetails.setBounds(50, 80, 790, 400);
      add(txaDetails);
   }
   
   private class MyButtonListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == btnSearchID)
         {
            int bookingID = Integer.parseInt(txfSearch.getText());

            txaDetails.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getID());
            txfSearch.setText("");
           
         }
         else if(e.getSource() == btnUnavailable)
         {
            txaDetails.setText(vehicleAdapter.getUnavailableVehicles() + "Time remaining in days\n");
         }
}
   }
}