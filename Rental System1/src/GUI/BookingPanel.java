package GUI;
import Code.*;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookingPanel extends JPanel
{

   // rental data
   private JLabel lblPickUp, lblPickUpDate, lblPickUpDate2, lblPickUpTime,
         lblPickUpTime2, lblDelivery, lblDeliveryDate, lblDeliveryDate2,
         lblDeliveryTime, lblDeliveryTime2, lblNumberOfDays, lbltotalDays,
         lblTotalPrice, lblPrice;

   // vehicle data
   private JLabel lblVehicleDetais, lblType, lblModel, lblNumberPlates;

   private JTextField txfType, txfModel, txfNumberPlates, txfTotalDays,
         txfTotalPrice;
   // customer Data

   private JLabel lblCustomerDetails, lblCustomer, lblFirstName, lblLastName,
         lblPhoneNr, lblLicenseNumber, lblStreet, lblNumber, lblPostalCode,
         lblCity;

   private JTextField txfFirstName, txfLastName, txfPhoneNr, txfLicenseNumber,
         txfStreet, txfNumber, txfPostalCode, txfCity;

   private JButton btnCancel, btnBook;

   public BookingPanel()
   {
      this.setLayout(null);

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

      // buttons

      btnCancel = new JButton("Cancel");
      btnCancel.setBounds(430, 440, 120, 25);
      add(btnCancel);

      btnBook = new JButton("Book");
      btnBook.setBounds(650, 440, 120, 25);
      add(btnBook);

   }
}