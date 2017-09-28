package GUI;

import Code.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

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

public class HomePagePanel extends JPanel
{
   private MyButtonListener buttonListener;
   private ActionListener listListener;
   private VehicleFileAdapter adapter;
   private carRentalGuiAdapter gui; // //newwwwwwwwwwwwwwwwwwwwwwwww
   private JLabel lbltype, lblPickup, lblPickuptime, lblDelivery,
         lblDeliverytime;
   // private DatePicker dateArrival, dateDeparture;
   private JRadioButton radioFamily, radioVan, radioTruck, radioCamper;
   private JTextField txfVehicletype, txfTotalPrice;
   private JLabel lblAvailable, lblPrice, lblRestVehicleInfo;
   private JTextArea areaVehicloInfo;
   private JList areaAvailableCarList;
   private JLabel lblTotalprice, lblprice;

   // not done Scroll Pane
   private JScrollPane areaVehicloInfo1Pane;
   private JList<Vehicle> areaAvailableCarListPane;
   
   private ButtonGroup group;

   // private JDatePicker data;

   private String[] timeHours = { "01", "02", "03", "04", "05", "06", "07",
         "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18",
         "19", "20", "21", "22", "23", "24" };

   private String[] timeMinutes = { "00", "30" };

   private JComboBox<String> pickUpHoursBox = new JComboBox<String>(timeHours);
   private JComboBox<String> pickUpMinutesBox = new JComboBox<String>(
         timeMinutes);

   private String[] deliveryTimeHours = { "01", "02", "03", "04", "05", "06",
         "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17",
         "18", "19", "20", "21", "22", "23", "24" };

   private String[] deliveryTimeMinutes = { "00", "30" };

   private JComboBox<String> deliveryHoursBox = new JComboBox<String>(
         deliveryTimeHours);
   private JComboBox<String> deliveryMinutesBox = new JComboBox<String>(
         deliveryTimeMinutes);

   private String[] dateDay = { "1", "2", "3", "4", "5", "6", "7", "8", "9",
         "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
         "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

   private String[] dateMonth = { "1", "2", "3", "4", "5", "6", "7", "8", "9",
         "10", "11", "12" };

   private String[] dateYear = { "2016", "2017", "2018", "2019", "2020" };

   private JComboBox<String> pickUpDateDay = new JComboBox<String>(dateDay);
   private JComboBox<String> pickUpDateMonth = new JComboBox<String>(dateMonth);
   private JComboBox<String> pickUpDateYear = new JComboBox<String>(dateYear);

   private JComboBox<String> deliveryDateDay = new JComboBox<String>(dateDay);
   private JComboBox<String> deliveryDateMonth = new JComboBox<String>(dateDay);
   private JComboBox<String> deliveryDateYear = new JComboBox<String>(dateDay);

   private JButton btnGet, btnBook, btnReserve;

   public HomePagePanel(VehicleFileAdapter adapter, carRentalGuiAdapter gui)
   {
      this.setLayout(null);
      this.adapter = adapter;
      this.gui = gui;
      // Date & Time Panel

      lbltype = new JLabel("Type of Car:");
      lbltype.setBounds(20, 20, 120, 25);

      add(lbltype);

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

      lblPickup = new JLabel("Pick up: ");
      lblPickup.setBounds(20, 140, 120, 25);
      add(lblPickup);

      pickUpDateDay = new JComboBox<String>(dateDay);
      pickUpDateDay.setBounds(110, 140, 40, 25);
      add(pickUpDateDay);

      pickUpDateMonth = new JComboBox<String>(dateMonth);
      pickUpDateMonth.setBounds(150, 140, 40, 25);
      add(pickUpDateMonth);

      pickUpDateYear = new JComboBox<String>(dateYear);
      pickUpDateYear.setBounds(190, 140, 80, 25);
      add(pickUpDateYear);

      lblPickuptime = new JLabel("Time: ");
      lblPickuptime.setBounds(20, 250, 120, 25);
      add(lblPickuptime);

      // Date and Time picker Calendar

      lblDelivery = new JLabel("Delivery: ");
      lblDelivery.setBounds(20, 280, 120, 25);
      add(lblDelivery);

      deliveryDateDay = new JComboBox<String>(dateDay);
      deliveryDateDay.setBounds(110, 280, 40, 25);
      add(deliveryDateDay);

      deliveryDateMonth = new JComboBox<String>(dateMonth);
      deliveryDateMonth.setBounds(150, 280, 40, 25);
      add(deliveryDateMonth);

      deliveryDateYear = new JComboBox<String>(dateYear);
      deliveryDateYear.setBounds(190, 280, 80, 25);
      add(deliveryDateYear);

      pickUpHoursBox = new JComboBox<String>(timeHours);
      pickUpHoursBox.setBounds(110, 250, 40, 25);
      add(pickUpHoursBox);

      pickUpMinutesBox = new JComboBox<String>(timeMinutes);
      pickUpMinutesBox.setBounds(150, 250, 40, 25);
      add(pickUpMinutesBox);

      // Date and Time picker Calendar

      lblDeliverytime = new JLabel("Time: ");
      lblDeliverytime.setBounds(20, 400, 120, 25);
      add(lblDeliverytime);

      deliveryHoursBox = new JComboBox<String>(deliveryTimeHours);
      deliveryHoursBox.setBounds(110, 400, 40, 25);
      add(deliveryHoursBox);

      deliveryMinutesBox = new JComboBox<String>(deliveryTimeMinutes);
      deliveryMinutesBox.setBounds(150, 400, 40, 25);
      add(deliveryMinutesBox);

      // Vehicles lists Panel

      lblAvailable = new JLabel("Available vehicles at choosen dates: ");
      lblAvailable.setBounds(300, 40, 420, 25);
      add(lblAvailable);

      /*txfVehicletype = new JTextField();
      txfVehicletype.setBounds(450, 30, 120, 15);
      txfVehicletype.setEditable(false);
      add(txfVehicletype);*/

      areaAvailableCarList = new JList<Vehicle>();
      areaVehicloInfo.addComponentListener((ComponentListener) listListener);
      listListener = new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
           
            
            areaVehicloInfo.setText(gui.getSelectedVehicle()
                  .getVehicleDetails());
         
         }
      };
      areaAvailableCarList.setBounds(300, 70, 180, 340);
      add(areaAvailableCarList);

      // make scroll pane

      // areaAvailableCarListPane = new JScrollPane(areaAvailableCarList);
      // areaAvailableCarListPane.setViewportView(areaAvailableCarList);
      // areaAvailableCarListPane
      // .setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      // areaAvailableCarListPane.setVisible(true);
      // add(areaAvailableCarListPane, BorderLayout.CENTER);

      lblTotalprice = new JLabel("Total price:");
      lblTotalprice.setBounds(600, 10, 120, 25);
      add(lblTotalprice);

      txfTotalPrice = new JTextField();
      txfTotalPrice.setBounds(700, 10, 120, 25);
      txfTotalPrice.setEditable(false);
      add(txfTotalPrice);

      lblRestVehicleInfo = new JLabel("Selected vehicle information");
      lblRestVehicleInfo.setBounds(650, 40, 180 ,25);
      add(lblRestVehicleInfo);

      areaVehicloInfo = new JTextArea();
      areaVehicloInfo.setBounds(600, 70, 250, 340);
      areaVehicloInfo.setEditable(false);
      add(areaVehicloInfo);

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

               VehicleList all = adapter.getAllVehicles()
                     .getAvailableVehicleModelsByType("Family Car")
                     .getVehicleModels();

               for (int i = 0; i < all.size(); i++)
               {
                  lm.addElement(all.getVehicle(i));
               }
               areaAvailableCarList.setModel(lm);
            }
            else if (radioVan.isSelected())
            {
               DefaultListModel<Vehicle> lm = new DefaultListModel<Vehicle>();

               VehicleList all = adapter.getAllVehicles()
                     .getAvailableVehicleModelsByType("Van").getVehicleModels();

               for (int i = 0; i < all.size(); i++)
               {
                  lm.addElement(all.getVehicle(i));
               }
               areaAvailableCarList.setModel(lm);
            }
            else if (radioTruck.isSelected())
            {
               DefaultListModel<Vehicle> lm = new DefaultListModel<Vehicle>();

               VehicleList all = adapter.getAllVehicles()
                     .getAvailableVehicleModelsByType("Moving Truck")
                     .getVehicleModels();

               for (int i = 0; i < all.size(); i++)
               {
                  lm.addElement(all.getVehicle(i));
               }
               areaAvailableCarList.setModel(lm);
            }
            else if (radioCamper.isSelected())
            {
               DefaultListModel<Vehicle> lm = new DefaultListModel<Vehicle>();

               VehicleList all = adapter.getAllVehicles()
                     .getAvailableVehicleModelsByType("Auto Camper")
                     .getVehicleModels();

               for (int i = 0; i < all.size(); i++)
               {
                  lm.addElement(all.getVehicle(i));
               }
               areaAvailableCarList.setModel(lm);
            }

         }
         
         else if (e.getSource() == btnBook)
         {
            gui.setSelectedVehicle((Vehicle) areaAvailableCarList
                  .getSelectedValue());
            gui.changeTab(1);
         }// /if it is null display nothing

        /* else if (e.getSource()==btnReserve)
         {
            gui.setSelectedVehicle((Vehicle) areaAvailableCarList
                  .getSelectedValue());
           
         }*/
      }
   }
}