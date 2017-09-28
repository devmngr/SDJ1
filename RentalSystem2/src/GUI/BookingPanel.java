package GUI;

import java.awt.Color;
import java.awt.TextField;
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
import Code.Vehicle;
import Code.VehicleFileAdapter;
import Code.VehicleList;

public class BookingPanel extends JPanel
{
   private MyButtonListener actionlistener;
   private carRentalGuiAdapter gui;
   private VehicleFileAdapter vehicleAdapter;
   private RentalFileAdapter rentalAdapter;
   private Customer customer;
   private Rental rental;
   private HomePagePanel homePagePanel;
   private RentalList rentalList;
   private VehicleList vehicles;
   // rental data
   private JLabel lblPickUp, lblPickUpDate, lblPickUpDate2, lblPickUpTime,
         lblPickUpTime2, lblDelivery, lblDeliveryDate, lblDeliveryDate2,
         lblDeliveryTime, lblDeliveryTime2, lblNumberOfDays, lbltotalDays,
         lblTotalPrice, lblPrice, lblPickUpLocation, lblDeliveryLocation;

   // vehicle data
   private JLabel lblVehicleDetais, lblType, lblModel, lblNumberPlates;

   private JTextField txfType, txfModel, txfNumberPlates, txfTotalDays,
         txfTotalPrice, txfPickUpLocation, txfDeliveryLocation;
   // customer Data

   private JLabel lblCustomerDetails, lblCustomer, lblFirstName, lblLastName,
         lblPhoneNr, lblLicenseNumber, lblStreet, lblNumber, lblPostalCode,
         lblCity;

   private JTextField txfFirstName, txfLastName, txfPhoneNr, txfLicenseNumber,
         txfStreet, txfNumber, txfPostalCode, txfCity;

   private JButton btnCancel, btnBook;

   public BookingPanel(VehicleFileAdapter adapter, carRentalGuiAdapter gui,
         RentalFileAdapter rentalAdapter, HomePagePanel home)

   {
      this.setLayout(null);
      this.vehicleAdapter = adapter;
      this.gui = gui;
      this.rentalAdapter = rentalAdapter;
      homePagePanel = home;
      actionlistener=new MyButtonListener();
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

      // Vehicle details

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

      // customer data

      lblCustomerDetails = new JLabel("Enter Customer detail");
      lblCustomerDetails.setBounds(540, 180, 150, 25);
      add(lblCustomerDetails);

      lblFirstName = new JLabel("First Name:");
      lblFirstName.setBounds(430, 210, 120, 25);
      add(lblFirstName);

      txfFirstName = new JTextField();
      txfFirstName.setBounds(650, 210, 150, 20);
      add(txfFirstName);

      lblLastName = new JLabel("Last Name:");
      lblLastName.setBounds(430, 230, 120, 25);
      add(lblLastName);

      txfLastName = new JTextField();
      txfLastName.setBounds(650, 230, 150, 20);
      add(txfLastName);

      lblPhoneNr = new JLabel("Phone number: ");
      lblPhoneNr.setBounds(430, 250, 120, 25);
      add(lblPhoneNr);

      txfPhoneNr = new JTextField();
      txfPhoneNr.setBounds(650, 250, 150, 20);
      add(txfPhoneNr);

      lblLicenseNumber = new JLabel("License number: ");
      lblLicenseNumber.setBounds(430, 270, 120, 25);
      add(lblLicenseNumber);

      txfLicenseNumber = new JTextField();
      txfLicenseNumber.setBounds(650, 270, 150, 20);
      add(txfLicenseNumber);

      lblStreet = new JLabel("Street: ");
      lblStreet.setBounds(430, 290, 120, 25);
      add(lblStreet);

      txfStreet = new JTextField();
      txfStreet.setBounds(650, 290, 150, 20);
      add(txfStreet);

      lblNumber = new JLabel("Number: ");
      lblNumber.setBounds(430, 310, 120, 25);
      add(lblNumber);

      txfNumber = new JTextField();
      txfNumber.setBounds(650, 310, 150, 20);
      add(txfNumber);

      lblPostalCode = new JLabel("Postal code: ");
      lblPostalCode.setBounds(430, 330, 120, 25);
      add(lblPostalCode);

      txfPostalCode = new JTextField();
      txfPostalCode.setBounds(650, 330, 150, 20);
      add(txfPostalCode);

      lblCity = new JLabel("City: ");
      lblCity.setBounds(430, 350, 120, 25);
      add(lblCity);

      txfCity = new JTextField();
      txfCity.setBounds(650, 350, 150, 20);
      add(txfCity);
      
      lblPickUpLocation = new JLabel("Pick Up Location: ");
      lblPickUpLocation.setBounds(430, 370, 120, 25);
      add(lblPickUpLocation);

      txfPickUpLocation = new JTextField();
      txfPickUpLocation.setBounds(650, 370, 150, 20);
      add(txfPickUpLocation);
      
      lblDeliveryLocation = new JLabel("Delivery Location: ");
      lblDeliveryLocation.setBounds(430, 390, 120, 25);
      add(lblDeliveryLocation);

      txfDeliveryLocation = new JTextField();
      txfDeliveryLocation.setBounds(650, 390, 150, 20);
      add(txfDeliveryLocation);

      // buttons

      btnCancel = new JButton("Cancel");
      btnCancel.setBounds(430, 440, 120, 25);
      btnCancel.addActionListener(actionlistener);
      add(btnCancel);

      btnBook = new JButton("Book");
      btnBook.addActionListener(actionlistener);
      btnBook.setBounds(650, 440, 120, 25);
      add(btnBook);

   }

   public void displayBookingVehicleDetails()
   {
      txfType.setText(gui.getSelectedVehicle().getType());
   }

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

   }

   public void selectedVehicleDetails()
   {
      txfType.setText(gui.getSelectedVehicle().getType());
      txfModel.setText(gui.getSelectedVehicle().getModel());
      txfNumberPlates.setText(gui.getSelectedVehicle().getNumberPlates());
   }

   private class MyButtonListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == btnBook)
         {
            
            int phonenumber = Integer.parseInt(txfPhoneNr.getText());
            customer = new Customer(txfFirstName.getText(),
                  txfLastName.getText(), phonenumber,
                  txfLicenseNumber.getText(), txfStreet.getText(),
                  txfNumber.getText(), txfPostalCode.getText(),
                  txfCity.getText());
            
           
            rental = new Rental(customer,homePagePanel.getSelectedPickUpDates() , homePagePanel.getSelectedDeliveryDates(), gui.getSelectedVehicle(), txfPickUpLocation.getText(), txfDeliveryLocation.getText(), 9999999);
            
            rentalList = rentalAdapter.getRentalList();
            
            rentalList.addRental(rental);
            
            rentalAdapter.saveRentals(rentalList);
            vehicleAdapter.changeStatusBooked(gui.getSelectedVehicle().getNumberPlates());
            
            
            txfType.setText("");
            txfModel.setText("");
            txfNumberPlates.setText("");
            
            txfFirstName.setText("");
            txfLastName.setText("");
            txfPhoneNr.setText("");
            txfLicenseNumber.setText("");
            txfStreet.setText("");
            txfNumber.setText("");
            txfPostalCode.setText("");
            txfCity.setText("");
            txfPickUpLocation.setText("");
            txfDeliveryLocation.setText("");
            gui.changeTab(0);
         }
         else if(e.getSource() == btnCancel)
         {
            txfType.setText("");
            txfModel.setText("");
            txfNumberPlates.setText("");
            
            txfFirstName.setText("");
            txfLastName.setText("");
            txfPhoneNr.setText("");
            txfLicenseNumber.setText("");
            txfStreet.setText("");
            txfNumber.setText("");
            txfPostalCode.setText("");
            txfCity.setText("");
            txfPickUpLocation.setText("");
            txfDeliveryLocation.setText("");
            txfTotalDays.setText("");
            txfTotalPrice.setText("");
            gui.changeTab(0);
         }
      }
   }
}