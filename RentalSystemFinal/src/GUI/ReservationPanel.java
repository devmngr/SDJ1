package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Code.Customer;
import Code.DateTime;
import Code.Rental;
import Code.RentalFileAdapter;
import Code.RentalList;
import Code.VehicleFileAdapter;
import Code.VehicleList;

/**
 * A user interface that allows to finish reservation and register as booking
 * rentals.
 * 
 * @author Tomas Cachojanas
 */
public class ReservationPanel extends JPanel
{
   private MyButtonListener actionlistener;
   private VehicleFileAdapter vehicleAdapter;
   private carRentalGuiAdapter gui;
   private RentalFileAdapter rentalAdapter;
   private Customer customer;
   private HomePagePanel homePagePanel;
   private Rental rental;
   private RentalList rentalList;
   private VehicleList vehicles;
   private JLabel lblPickUp, lblPickUpDate, lblPickUpDate2, lblPickUpTime,
         lblPickUpTime2, lblDelivery, lblDeliveryDate, lblDeliveryDate2,
         lblDeliveryTime, lblDeliveryTime2, lblNumberOfDays, lbltotalDays,
         lblTotalPrice, lblPrice;
   private JLabel lblVehicleDetais, lblType, lblModel, lblNumberPlates;
   private JTextField txfType, txfModel, txfNumberPlates, txfTotalDays,
         txfTotalPrice;
   private JLabel lblCustomerDetails, lblCustomer, lblFirstName, lblLastName,
         lblPhoneNr;
   private JTextField txfFirstName, txfLastname, txfPhoneNr;
   private JButton btnCancel, btnFinish;

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
   public ReservationPanel(VehicleFileAdapter adapter, carRentalGuiAdapter gui,
         RentalFileAdapter rentalAdapter, HomePagePanel home)
   {
      this.setLayout(null);
      this.vehicleAdapter = adapter;
      this.gui = gui;
      this.rentalAdapter = rentalAdapter;
      homePagePanel = home;
      actionlistener = new MyButtonListener();
      lblPickUp = new JLabel("Pick Up:");
      lblPickUp.setBounds(20, 20, 120, 25);
      add(lblPickUp);

      lblPickUpDate = new JLabel("Date:");
      lblPickUpDate.setBounds(20, 40, 120, 25);
      add(lblPickUpDate);

      lblPickUpDate2 = new JLabel("dd/mm/yyyy");
      lblPickUpDate2.setBounds(160, 40, 120, 25);
      add(lblPickUpDate2);

      lblPickUpTime = new JLabel("Time:");
      lblPickUpTime.setBounds(20, 60, 120, 25);
      add(lblPickUpTime);

      lblPickUpTime2 = new JLabel("hh//mm/ss");
      lblPickUpTime2.setBounds(160, 60, 120, 25);
      add(lblPickUpTime2);

      lblDelivery = new JLabel("Delivery: ");
      lblDelivery.setBounds(20, 100, 120, 25);
      add(lblDelivery);

      lblDeliveryDate = new JLabel("Date:");
      lblDeliveryDate.setBounds(20, 120, 120, 25);
      add(lblDeliveryDate);

      lblDeliveryDate2 = new JLabel("dd/mm/yyyy");
      lblDeliveryDate2.setBounds(160, 120, 120, 25);
      add(lblDeliveryDate2);

      lblDeliveryTime = new JLabel("Time:");
      lblDeliveryTime.setBounds(20, 140, 120, 25);
      add(lblDeliveryTime);

      lblDeliveryTime2 = new JLabel("hh//mm/ss");
      lblDeliveryTime2.setBounds(160, 140, 120, 25);
      add(lblDeliveryTime2);

      lblNumberOfDays = new JLabel("Total number of days:");
      lblNumberOfDays.setBounds(20, 180, 150, 25);
      add(lblNumberOfDays);

      txfTotalDays = new JTextField();
      txfTotalDays.setBounds(160, 180, 150, 25);
      txfTotalDays.setForeground(new Color(251, 41, 41));
      txfTotalDays.setEditable(false);
      add(txfTotalDays);

      lblTotalPrice = new JLabel("Total Price: ");
      lblTotalPrice.setBounds(20, 240, 150, 25);
      add(lblTotalPrice);

      txfTotalPrice = new JTextField();
      txfTotalPrice.setBounds(160, 240, 150, 25);
      txfTotalPrice.setForeground(new Color(251, 41, 41));
      txfTotalPrice.setEditable(false);
      add(txfTotalPrice);

      lblVehicleDetais = new JLabel("Vehicle details");
      lblVehicleDetais.setBounds(540, 20, 120, 25);
      add(lblVehicleDetais);

      lblType = new JLabel("Type:");
      lblType.setBounds(430, 40, 120, 25);
      add(lblType);

      txfType = new JTextField();
      txfType.setBounds(650, 40, 150, 20);
      txfType.setEditable(false);
      add(txfType);

      lblModel = new JLabel("Model:");
      lblModel.setBounds(430, 60, 120, 25);
      add(lblModel);

      txfModel = new JTextField();
      txfModel.setBounds(650, 60, 150, 20);
      txfModel.setEditable(false);
      add(txfModel);

      lblNumberPlates = new JLabel("Number plates:");
      lblNumberPlates.setBounds(430, 80, 120, 25);
      add(lblNumberPlates);

      txfNumberPlates = new JTextField();
      txfNumberPlates.setBounds(650, 80, 150, 20);
      txfNumberPlates.setEditable(false);
      add(txfNumberPlates);

      lblCustomerDetails = new JLabel("Enter Customer detail");
      lblCustomerDetails.setBounds(540, 180, 150, 25);
      add(lblCustomerDetails);

      lblFirstName = new JLabel("First name:");
      lblFirstName.setBounds(430, 210, 120, 25);
      add(lblFirstName);

      txfFirstName = new JTextField();
      txfFirstName.setBounds(650, 210, 150, 20);
      add(txfFirstName);

      lblLastName = new JLabel("Last name: ");
      lblLastName.setBounds(430, 230, 120, 25);
      add(lblLastName);

      txfLastname = new JTextField();
      txfLastname.setBounds(650, 230, 150, 20);
      add(txfLastname);

      lblPhoneNr = new JLabel("Phone number: ");
      lblPhoneNr.setBounds(430, 250, 120, 25);
      add(lblPhoneNr);

      txfPhoneNr = new JTextField();
      txfPhoneNr.setBounds(650, 250, 150, 20);
      add(txfPhoneNr);

      btnCancel = new JButton("Cancel");
      btnCancel.setBounds(430, 440, 120, 25);
      btnCancel.addActionListener(actionlistener);
      add(btnCancel);

      btnFinish = new JButton("Finish");
      btnFinish.setBounds(650, 440, 120, 25);
      btnFinish.addActionListener(actionlistener);
      add(btnFinish);

   }

   /**
    * @param displays
    *           pickUpDateTime object
    * @param displays
    *           deliveryDateTime object
    */
   public void displayDateTime(DateTime pickUpDateTime,
         DateTime deliveryDateTime)
   {
      String date = pickUpDateTime.getDay() + "/" + pickUpDateTime.getMonth()
            + "/" + pickUpDateTime.getYear();
      lblPickUpDate2.setText(date);

      String date2 = deliveryDateTime.getDay() + "/"
            + deliveryDateTime.getMonth() + "/" + deliveryDateTime.getYear();
      lblDeliveryDate2.setText(date2);

      String time = pickUpDateTime.getHour() + ":" + pickUpDateTime.getMinute();
      lblPickUpTime2.setText(time);

      String time2 = deliveryDateTime.getHour() + ":"
            + deliveryDateTime.getMinute();
      lblDeliveryTime2.setText(time2);

      txfTotalDays.setText(pickUpDateTime
            .differenceBetweenDates(deliveryDateTime) + "");

      txfTotalPrice.setText(gui.getTotalPrice() + " DKK");
   }

   /**
    * Sets selected vehicle Details on txfType, txfModel and txfNumberPlates
    * fields
    */
   public void selectedVehicleDetails()
   {
      txfType.setText(gui.getSelectedVehicle().getType());
      txfModel.setText(gui.getSelectedVehicle().getModel());
      txfNumberPlates.setText(gui.getSelectedVehicle().getNumberPlates());
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
         if (e.getSource() == btnFinish)
         {
            int phoneNumber = Integer.parseInt(txfPhoneNr.getText());

            customer = new Customer(txfFirstName.getText(),
                  txfLastname.getText(), phoneNumber);
            rental = new Rental(customer,
                  homePagePanel.getSelectedPickUpDates(),
                  homePagePanel.getSelectedDeliveryDates(),
                  gui.getSelectedVehicle(), gui.getTotalPrice());
            rentalList = rentalAdapter.getRentalList();
            rentalList.addRental(rental);
            vehicleAdapter.changeStatusReserved(gui.getSelectedVehicle()
                  .getNumberPlates());

            txfType.setText("");
            txfModel.setText("");
            txfNumberPlates.setText("");

            txfFirstName.setText("");
            txfLastname.setText("");
            txfPhoneNr.setText("");

            gui.changeTab(0);
         }
         else if (e.getSource() == btnCancel)
         {
            txfTotalDays.setText("");
            txfTotalPrice.setText("");

            txfType.setText("");
            txfModel.setText("");
            txfNumberPlates.setText("");

            txfFirstName.setText("");
            txfLastname.setText("");
            txfPhoneNr.setText("");
            gui.changeTab(0);
         }
      }
   }
}
