package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Code.DateTime;
import Code.RentalFileAdapter;
import Code.Vehicle;
import Code.VehicleFileAdapter;
import Code.VehicleList;

public class HomePagePanel extends JPanel
{

   private VehicleFileAdapter vehicleAdapter;
   private carRentalGuiAdapter gui;
   private RentalFileAdapter rentalAdapter;

   private JLabel lbltype, lblPickup, lblPickuptime, lblDelivery,
         lblDeliverytime;
   private JScrollPane scrollPaneAvaivableCarlist;
   private JRadioButton radioFamily, radioVan, radioTruck, radioCamper;
   private JTextField txfTotalPrice, txfPricePerDay;
   private JLabel lblAvailable, lblDetails, lblTotalPrice, lblPricePerDay;
   private JTextArea areaVehicloInfo2;
   private JList jlistAvailableCarList;
   private JLabel lblTotalprice, lblprice;

   // not done Scroll Pane
   private JList<Vehicle> areaAvailableCarListPane;
   private ButtonGroup group;

   private Integer[] timeHours = { 01, 02, 03, 04, 05, 06, 07, 8, 9, 10, 11,
         12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 00 };

   private Integer[] timeMinutes = { 00, 30 };

   private JComboBox<Integer> pickUpHoursBox = new JComboBox<Integer>(timeHours);
   private JComboBox<Integer> pickUpMinutesBox = new JComboBox<Integer>(
         timeMinutes);

   private JComboBox<Integer> deliveryHoursBox = new JComboBox<Integer>(
         timeHours);
   private JComboBox<Integer> deliveryMinutesBox = new JComboBox<Integer>(
         timeMinutes);

   private Integer[] dateDay = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
         15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 };

   private Integer[] dateMonth = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

   private Integer[] dateYear = { 2016, 2017, 2018, 2019, 2020 };

   private JComboBox<Integer> pickUpDateDay = new JComboBox<Integer>(dateDay);
   private JComboBox<Integer> pickUpDateMonth = new JComboBox<Integer>(
         dateMonth);
   private JComboBox<Integer> pickUpDateYear = new JComboBox<Integer>(dateYear);

   private JComboBox<Integer> deliveryDateDay = new JComboBox<Integer>(dateDay);
   private JComboBox<Integer> deliveryDateMonth = new JComboBox<Integer>(
         dateMonth);
   private JComboBox<Integer> deliveryDateYear = new JComboBox<Integer>(
         dateYear);

   private JButton btnGet, btnBook, btnReserve;

   public HomePagePanel(VehicleFileAdapter adapter, carRentalGuiAdapter gui,
         RentalFileAdapter rentalAdapter)
   {
      this.setLayout(null);
      this.vehicleAdapter = adapter;
      this.gui = gui;
      this.rentalAdapter = rentalAdapter;

      // Date & Time Panel
      radioFamily = new JRadioButton("Family Car");
      radioFamily.setBounds(100, 20, 150, 30);
      radioVan = new JRadioButton("Van");
      radioVan.setBounds(100, 50, 150, 30);
      radioTruck = new JRadioButton("Truck");
      radioTruck.setBounds(100, 80, 150, 30);
      radioCamper = new JRadioButton("Auto Camper");
      radioCamper.setBounds(100, 110, 150, 30);
      group = new ButtonGroup();
      group.add(radioFamily);
      group.add(radioVan);
      group.add(radioTruck);
      group.add(radioCamper);
      add(radioFamily);
      add(radioVan);
      add(radioTruck);
      add(radioCamper);

      lblPickup = new JLabel("Pick up Date : ");
      lblPickup.setBounds(20, 180, 120, 25);
      add(lblPickup);

      pickUpDateDay = new JComboBox<Integer>(dateDay);
      pickUpDateDay.setBounds(110, 180, 40, 25);
      add(pickUpDateDay);

      pickUpDateMonth = new JComboBox<Integer>(dateMonth);
      pickUpDateMonth.setBounds(150, 180, 40, 25);
      add(pickUpDateMonth);

      pickUpDateYear = new JComboBox<Integer>(dateYear);
      pickUpDateYear.setBounds(190, 180, 80, 25);
      add(pickUpDateYear);

      lblPickuptime = new JLabel("Time: ");
      lblPickuptime.setBounds(20, 250, 120, 25);
      add(lblPickuptime);

      // Date and Time picker Calendar

      lblDelivery = new JLabel("Delivery Date : ");
      lblDelivery.setBounds(20, 320, 120, 25);
      add(lblDelivery);

      deliveryDateDay = new JComboBox<Integer>(dateDay);
      deliveryDateDay.setBounds(110, 320, 40, 25);
      add(deliveryDateDay);

      deliveryDateMonth = new JComboBox<Integer>(dateMonth);
      deliveryDateMonth.setBounds(150, 320, 40, 25);
      add(deliveryDateMonth);

      deliveryDateYear = new JComboBox<Integer>(dateYear);
      deliveryDateYear.setBounds(190, 320, 80, 25);
      add(deliveryDateYear);

      pickUpHoursBox = new JComboBox<Integer>(timeHours);
      pickUpHoursBox.setBounds(110, 250, 40, 25);
      add(pickUpHoursBox);

      pickUpMinutesBox = new JComboBox<Integer>(timeMinutes);
      pickUpMinutesBox.setBounds(150, 250, 40, 25);
      add(pickUpMinutesBox);

      // Date and Time picker Calendar

      lblDeliverytime = new JLabel("Time: ");
      lblDeliverytime.setBounds(20, 380, 120, 25);
      add(lblDeliverytime);

      deliveryHoursBox = new JComboBox<Integer>(timeHours);
      deliveryHoursBox.setBounds(110, 380, 40, 25);
      add(deliveryHoursBox);

      deliveryMinutesBox = new JComboBox<Integer>(timeMinutes);
      deliveryMinutesBox.setBounds(150, 380, 40, 25);
      add(deliveryMinutesBox);

      // Vehicles lists Panel

      lblAvailable = new JLabel("Available vehicles on choosen dates");
      lblAvailable.setBounds(300, 40, 420, 25);
      add(lblAvailable);

      lblDetails = new JLabel("Vehicle details");
      lblDetails.setBounds(670, 40, 420, 25);
      add(lblDetails);

      // make scroll pane

      lblPricePerDay = new JLabel("Price per day:");
      lblPricePerDay.setBounds(300, 5, 120, 25);
      add(lblPricePerDay);

      txfPricePerDay = new JTextField();
      txfPricePerDay.setBounds(400, 5, 120, 20);
      txfPricePerDay.setEditable(false);
      add(txfPricePerDay);

      lblTotalprice = new JLabel("Total price:");
      lblTotalprice.setBounds(600, 5, 120, 25);
      add(lblTotalprice);

      txfTotalPrice = new JTextField();
      txfTotalPrice.setBounds(700, 5, 120, 20);
      txfTotalPrice.setEditable(false);
      add(txfTotalPrice);

      areaVehicloInfo2 = new JTextArea();
      areaVehicloInfo2.setBounds(600, 70, 250, 340);
      areaVehicloInfo2.setEditable(false);
      add(areaVehicloInfo2);

      btnBook = new JButton("Book");
      btnBook.addActionListener(new MyButtonListener());
      btnBook.setBounds(430, 440, 120, 25);
      add(btnBook);

      btnReserve = new JButton("Reserve");
      btnReserve.addActionListener(new MyButtonListener());
      btnReserve.setBounds(650, 440, 120, 25);
      add(btnReserve);

      btnGet = new JButton("Get");
      btnGet.addActionListener(new MyButtonListener());
      btnGet.setBounds(110, 440, 120, 25);
      add(btnGet);

      // /////

      jlistAvailableCarList = new JList<Vehicle>();
      // jlistAvailableCarList.setBounds(350, 70, 140, 340);
      jlistAvailableCarList
            .addListSelectionListener(new SelectedVehicleAction());
      // add(jlistAvailableCarList);

      scrollPaneAvaivableCarlist = new JScrollPane(jlistAvailableCarList);
      scrollPaneAvaivableCarlist
            .setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      scrollPaneAvaivableCarlist.setBounds(330, 70, 180, 340);
      add(scrollPaneAvaivableCarlist);

      // ///
   }

   public DateTime getSelectedPickUpDates()
   {

      // pick up date & time
      int pickedDay = dateDay[pickUpDateDay.getSelectedIndex()];
      int pickedMonth = dateMonth[pickUpDateMonth.getSelectedIndex()];
      int pickedYear = dateYear[pickUpDateYear.getSelectedIndex()];
      int pickUpHour = timeHours[pickUpHoursBox.getSelectedIndex()];
      int pickUpMinutes = timeMinutes[pickUpMinutesBox.getSelectedIndex()];
      DateTime pickUpTime = new DateTime(pickedDay, pickedMonth, pickedYear,
            pickUpHour, pickUpMinutes, 0);

      return pickUpTime;
   }

   public DateTime getSelectedDeliveryDates()
   {

      // delivered date & time
      int deliveredDay = dateDay[deliveryDateDay.getSelectedIndex()];
      int deliveredMonth = dateMonth[deliveryDateMonth.getSelectedIndex()];
      int deliveredYear = dateYear[deliveryDateYear.getSelectedIndex()];
      int deliveryHour = timeHours[deliveryHoursBox.getSelectedIndex()];
      int deliveryMinutes = timeMinutes[deliveryMinutesBox.getSelectedIndex()];
      DateTime deliveryTime = new DateTime(deliveredDay, deliveredMonth,
            deliveredYear, deliveryHour, deliveryMinutes, 0);
      return deliveryTime;
   }

   private class SelectedVehicleAction implements ListSelectionListener
   {

      @Override
      public void valueChanged(ListSelectionEvent e)
      {
         if (e.getSource() == jlistAvailableCarList)
         {
            Vehicle v = (Vehicle) jlistAvailableCarList.getSelectedValue();

            areaVehicloInfo2.setText(v.getVehicleDetails());
            String str = v.getPricePerDay() + " kr";
            txfPricePerDay.setText(str);
         }
      }

   }

   private class MyButtonListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == btnGet)
         {

            if (radioFamily.isSelected())
            {
               DefaultListModel<Vehicle> lm = new DefaultListModel<Vehicle>();

               VehicleList all = vehicleAdapter.getAvailableVehicles()
                     .getAvailableVehicleModelsByType("Family Car");

               for (int i = 0; i < all.size(); i++)
               {
                  lm.addElement(all.getVehicle(i));
               }
               jlistAvailableCarList.setModel(lm);
               
               lblAvailable.setText(vehicleAdapter.getAvailableVehicles()
                     .getNumberOfAvailableVehiclesByType("Family Car")
                     + " Family Cars available on chosen dates");

               // };
               // jlistAvailableCarList.addListSelectionListener(action);
            }
            else if (radioVan.isSelected())
            {
               DefaultListModel<Vehicle> lm = new DefaultListModel<Vehicle>();

               VehicleList all = vehicleAdapter.getAvailableVehicles()
                     .getAvailableVehicleModelsByType("Van");

               for (int i = 0; i < all.size(); i++)
               {
                  lm.addElement(all.getVehicle(i));
               }
               jlistAvailableCarList.setModel(lm);
               lblAvailable.setText(vehicleAdapter.getAvailableVehicles()
                     .getNumberOfAvailableVehiclesByType("Van")
                     + " Vans available on chosen dates");
            }
            else if (radioTruck.isSelected())
            {
               DefaultListModel<Vehicle> lm = new DefaultListModel<Vehicle>();

               VehicleList all = vehicleAdapter.getAvailableVehicles()
                     .getAvailableVehicleModelsByType("Moving Truck");

               for (int i = 0; i < all.size(); i++)
               {
                  lm.addElement(all.getVehicle(i));
               }
               jlistAvailableCarList.setModel(lm);
               lblAvailable.setText(vehicleAdapter.getAvailableVehicles()
                     .getNumberOfAvailableVehiclesByType("Moving Truck")
                     + " Moving Trucks available on chosen dates");
            }
            else if (radioCamper.isSelected())
            {
               DefaultListModel<Vehicle> lm = new DefaultListModel<Vehicle>();

               VehicleList all = vehicleAdapter.getAvailableVehicles()
                     .getAvailableVehicleModelsByType("Auto Camper");

               for (int i = 0; i < all.size(); i++)
               {
                  lm.addElement(all.getVehicle(i));
               }
               jlistAvailableCarList.setModel(lm);
               lblAvailable.setText(vehicleAdapter.getAvailableVehicles()
                     .getNumberOfAvailableVehiclesByType("Auto Camper")
                     + " Auto Campers available on chosen dates");
            }

         }
         else if (e.getSource() == btnBook)
         {
            gui.setSelectedVehicle((Vehicle) jlistAvailableCarList
                  .getSelectedValue());
            gui.changeTab(1);

            gui.resetBookingDates(getSelectedPickUpDates(),
                  getSelectedDeliveryDates());
            gui.setVehicleDetails();

         }// /if it is not null display nothing
         else if (e.getSource() == btnReserve)
         {
            gui.setSelectedVehicle((Vehicle) jlistAvailableCarList
                  .getSelectedValue());
            gui.resetBookingDates(getSelectedPickUpDates(),
                  getSelectedDeliveryDates());
            gui.changeTab(2);
            gui.setVehicleDetails();
         }

      }
   }
}