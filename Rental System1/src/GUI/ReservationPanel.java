package GUI;
import Code.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ReservationPanel extends JPanel
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
   // customer data

   private JLabel lblCustomerDetails, lblCustomer, lblName, lblPhoneNr;
   private JTextField txfName, txfPhoneNr;
   private JButton btnCancel, btnFinish;

   public ReservationPanel()
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
      txfTotalDays.setEditable(false);
      add(txfTotalDays);

      lblTotalPrice = new JLabel("Total Price: ");
      lblTotalPrice.setBounds(20, 240, 150, 25);
      add(lblTotalPrice);

      txfTotalPrice = new JTextField();
      txfTotalPrice.setBounds(160, 240, 150, 25);
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

      // Customer Data

      lblCustomerDetails = new JLabel("Enter Customer detail");
      lblCustomerDetails.setBounds(540, 180, 150, 25);
      add(lblCustomerDetails);

      lblName = new JLabel("Name:");
      lblName.setBounds(430, 210, 120, 25);
      add(lblName);

      txfName = new JTextField();
      txfName.setBounds(650, 210, 150, 20);
      add(txfName);

      lblPhoneNr = new JLabel("Phone number: ");
      lblPhoneNr.setBounds(430, 230, 120, 25);
      add(lblPhoneNr);

      txfPhoneNr = new JTextField();
      txfPhoneNr.setBounds(650, 230, 150, 20);
      add(txfPhoneNr);

      btnCancel = new JButton("Cancel");
      btnCancel.setBounds(430, 440, 120, 25);
      add(btnCancel);

      btnFinish = new JButton("Finish");
      btnFinish.setBounds(650, 440, 120, 25);
      add(btnFinish);

   }
}