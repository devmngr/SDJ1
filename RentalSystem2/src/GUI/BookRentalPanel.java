package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Code.*;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookRentalPanel extends JPanel

{
   private MyButtonListener actionlistener;
   private VehicleFileAdapter vehicleAdapter;
   private carRentalGuiAdapter gui;
   private RentalFileAdapter rentalAdapter;
   // Booking Rental panel

   // Rental data
   private JLabel lblRentalInfo, lblBookingId, lblCarType, lblCarModel,
         lblVehiclerNumberPlates;
   private JTextField txfBookingId, txfVehicleType, txfVehicleModel,
         txfVehicleNumberPlates;
   // Customer data
   private JLabel lblCustomer, lblFirstName, lblLastName, lblPhoneNr, lblLicenseNumber,
         lblStreet, lblNumber, lblPostalCode, lblCity;
   private JTextField txfFirstName,txfLastName, txfPhoneNr, txfLicenseNumber, txfStreet,
         txfNumber, txfPostalCode, txfCity, txfSearch;
   private JButton btnSearch, btnBook;

   // period data
   private JLabel lblPeriodOfTime, lblPickUp, lblPickUpDate, lblPickUpTime,
         lblDelivery, lblDeliveryDate, lblDeliveryTime;
   private JTextField txfPickUpDate, txfPickUpTime, txfDeliveryDate,
         txfDeliveryTime;
   // price and book
   private JLabel lblNumberOfDays, lblTotalPrice;
   private JTextField txfTotalDays, txfTotalPrice;

   public BookRentalPanel(VehicleFileAdapter adapter, carRentalGuiAdapter gui, RentalFileAdapter rentalAdapter)
   {
      this.setLayout(null);
      this.vehicleAdapter=adapter;
      this.gui = gui;
      this.rentalAdapter=rentalAdapter;
      actionlistener = new MyButtonListener();

      lblRentalInfo = new JLabel("Rental information");
      lblRentalInfo.setBounds(130, 20, 120, 25);
      add(lblRentalInfo);

      lblBookingId = new JLabel("Booking ID:");
      lblBookingId.setBounds(20, 50, 120, 25);
      add(lblBookingId);

      txfBookingId = new JTextField();
      txfBookingId.setBounds(220, 50, 150, 20);
      txfBookingId.setEditable(false);
      add(txfBookingId);

      lblCarType = new JLabel("Vehicle type:");
      lblCarType.setBounds(20, 80, 120, 25);
      add(lblCarType);

      txfVehicleType = new JTextField();
      txfVehicleType.setBounds(220, 80, 150, 20);
      txfVehicleType.setEditable(false);
      add(txfVehicleType);

      lblCarModel = new JLabel("Vehicle Model:");
      lblCarModel.setBounds(20, 110, 120, 25);
      add(lblCarModel);

      txfVehicleModel = new JTextField();
      txfVehicleModel.setBounds(220, 110, 150, 20);
      txfVehicleModel.setEditable(false);
      add(txfVehicleModel);

      lblVehiclerNumberPlates = new JLabel("Vehicle number plates:");
      lblVehiclerNumberPlates.setBounds(20, 140, 140, 25);
      add(lblVehiclerNumberPlates);

      txfVehicleNumberPlates = new JTextField();
      txfVehicleNumberPlates.setBounds(220, 140, 150, 20);
      txfVehicleNumberPlates.setEditable(false);
      add(txfVehicleNumberPlates);
      
   // search bar

      btnSearch = new JButton("SearchID");
      btnSearch.setBounds(510, 20, 120, 25);
      btnSearch.addActionListener(actionlistener);
      add(btnSearch);

      txfSearch = new JTextField();
      txfSearch.setBounds(635, 20, 120, 25);
      add(txfSearch);

      // Customer data

      lblCustomer = new JLabel("Customer");
      lblCustomer.setBounds(130, 220, 140, 25);
      add(lblCustomer);

      lblFirstName = new JLabel("First name:");
      lblFirstName.setBounds(20, 250, 140, 25);
      add(lblFirstName);

      txfFirstName = new JTextField();
      txfFirstName.setBounds(220, 250, 150, 20);
      txfFirstName.setEditable(false);
      add(txfFirstName);
      
      lblLastName = new JLabel("Last Name:");
      lblLastName.setBounds(20, 280, 140, 25);
      add(lblLastName);

      txfLastName = new JTextField();
      txfLastName.setBounds(220, 280, 150, 20);
      txfLastName.setEditable(false);
      add(txfLastName);

      lblPhoneNr = new JLabel("Phone number:");
      lblPhoneNr.setBounds(20, 310, 140, 25);
      add(lblPhoneNr);

      txfPhoneNr = new JTextField();
      txfPhoneNr.setBounds(220, 310, 150, 20);
      txfPhoneNr.setEditable(false);
      add(txfPhoneNr);

      lblLicenseNumber = new JLabel("Driver license number:");
      lblLicenseNumber.setBounds(20, 340, 140, 25);
      add(lblLicenseNumber);

      txfLicenseNumber = new JTextField();
      txfLicenseNumber.setBounds(220, 340, 150, 20);
      txfLicenseNumber.setEditable(false);
      add(txfLicenseNumber);

      lblStreet = new JLabel("Street:");
      lblStreet.setBounds(20, 370, 140, 25);
      add(lblStreet);

      txfStreet = new JTextField();
      txfStreet.setBounds(220, 370, 150, 20);
      txfStreet.setEditable(false);
      add(txfStreet);

      lblNumber = new JLabel("Number:");
      lblNumber.setBounds(20, 400, 140, 25);
      add(lblNumber);

      txfNumber = new JTextField();
      txfNumber.setBounds(220, 400, 150, 20);
      txfNumber.setEditable(false);
      add(txfNumber);

      lblPostalCode = new JLabel("Postal code:");
      lblPostalCode.setBounds(20, 430, 140, 25);
      add(lblPostalCode);

      txfPostalCode = new JTextField();
      txfPostalCode.setBounds(220, 430, 150, 20);
      txfPostalCode.setEditable(false);
      add(txfPostalCode);

      lblCity = new JLabel("City:");
      lblCity.setBounds(20, 460, 140, 25);
      add(lblCity);

      txfCity = new JTextField();
      txfCity.setBounds(220, 460, 150, 20);
      txfCity.setEditable(false);
      add(txfCity);

      // Display Time

      lblPeriodOfTime = new JLabel("Period of renting");
      lblPeriodOfTime.setBounds(580, 60, 120, 20);
      add(lblPeriodOfTime);

      lblPickUp = new JLabel("Pick up:");
      lblPickUp.setBounds(510, 80, 120, 20);
      add(lblPickUp);

      lblPickUpDate = new JLabel("Date:");
      lblPickUpDate.setBounds(510, 110, 120, 20);
      add(lblPickUpDate);

      txfPickUpDate = new JTextField();
      txfPickUpDate.setBounds(635, 110, 120, 20);
      txfPickUpDate.setEditable(false);
      add(txfPickUpDate);

      lblPickUpTime = new JLabel("Time:");
      lblPickUpTime.setBounds(510, 140, 120, 20);
      add(lblPickUpTime);

      txfPickUpTime = new JTextField();
      txfPickUpTime.setBounds(635, 140, 120, 20);
      txfPickUpTime.setEditable(false);
      add(txfPickUpTime);

      // lblPickUp

      lblDelivery = new JLabel("Delivery:");
      lblDelivery.setBounds(510, 160, 120, 20);
      add(lblDelivery);

      lblDeliveryDate = new JLabel("Date:");
      lblDeliveryDate.setBounds(510, 190, 120, 20);
      add(lblDeliveryDate);

      txfDeliveryDate = new JTextField();
      txfDeliveryDate.setBounds(635, 190, 120, 20);
      txfDeliveryDate.setEditable(false);
      add(txfDeliveryDate);

      lblDeliveryTime = new JLabel("Time:");
      lblDeliveryTime.setBounds(510, 220, 120, 20);
      add(lblDeliveryTime);

      txfDeliveryTime = new JTextField();
      txfDeliveryTime.setBounds(635, 220, 120, 20);
      txfDeliveryTime.setEditable(false);
      add(txfDeliveryTime);

      // nnumber of days

      lblNumberOfDays = new JLabel("Number of days:");
      lblNumberOfDays.setBounds(510, 260, 120, 20);
      add(lblNumberOfDays);

      txfTotalDays = new JTextField();
      txfTotalDays.setBounds(635, 260, 120, 20);
      txfTotalDays.setEditable(false);
      add(txfTotalDays);

      lblTotalPrice = new JLabel("Total Price:");
      lblTotalPrice.setBounds(510, 290, 120, 20);
      add(lblTotalPrice);

      txfTotalPrice = new JTextField();
      txfTotalPrice.setBounds(635, 290, 120, 20);
      txfTotalPrice.setEditable(false);
      add(txfTotalPrice);

   // button to finish reservation
      btnBook = new JButton("Book");
      btnBook.setBounds(650, 440, 120, 25);
      btnBook.addActionListener(actionlistener);
      add(btnBook);
   }
   private class MyButtonListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == btnSearch)
         {
            int bookingID = Integer.parseInt(txfSearch.getText());
            
            txfBookingId.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getID());
            txfVehicleType.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getVehicle().getType());
            txfVehicleModel.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getVehicle().getModel());
            txfVehicleNumberPlates.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getVehicle().getNumberPlates());
            
            txfFirstName.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getCustomer().getFirstName());
            txfLastName.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getCustomer().getLastName());
           
            String phone = rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getCustomer().getPhoneNumber() + "";
            txfPhoneNr.setText(phone);
            
            txfLicenseNumber.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getCustomer().getDriverLicenseNumber());
            txfStreet.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getCustomer().getStreet());
            txfNumber.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getCustomer().getNumber());
            txfPostalCode.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getCustomer().getPostalCode());
            txfCity.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getCustomer().getCity());
            
            
            txfPickUpDate.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getPickUpDate().getDate());
            txfPickUpTime.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getPickUpDate().getTime());
            txfDeliveryDate.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getDeliveryDate().getDate());
            txfDeliveryTime.setText(rentalAdapter.getRentalList().getRentalByBookingID(bookingID).getDeliveryDate().getTime());
            
            txfTotalDays.setText("");
            txfTotalPrice.setText("");
            
            
            
            
            
            
            txfSearch.setText("");
         }
       
}
   }
}