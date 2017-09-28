package GUI;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Code.DateTime;
import Code.RentalFileAdapter;
import Code.Vehicle;
import Code.VehicleFileAdapter;

public class carRentalGuiAdapter extends JFrame
{
   /**
    * A user interface that allows for displaying and modifying vehicles and
    * rentals information
    * 
    * @author Tomas Cachojanas
    */
   private VehicleFileAdapter vehicleAdapter;
   private RentalFileAdapter rentalAdapter;
   private double totalPrice;
   private JTabbedPane tabPane;
   private HomePagePanel homePagePanel;
   private BookingPanel bookingPanel;
   private ReservationPanel reservationPanel;
   private UnavailableVehiclePanel unavailableVehiclePanel;
   private BookRentalPanel bookRentalPanel;
   private Vehicle selectedVehicle;
   private MyTabListener tabListener;

   /**
    * No-argument constructor initializing the GUI components
    */
   public carRentalGuiAdapter()
   {

      super("Car rental GUI");

      vehicleAdapter = new VehicleFileAdapter("VehicleList.bin");
      rentalAdapter = new RentalFileAdapter("Rentals.bin");

      tabListener = new MyTabListener();

      homePagePanel = new HomePagePanel(vehicleAdapter, this, rentalAdapter);
      bookingPanel = new BookingPanel(vehicleAdapter, this, rentalAdapter,
            homePagePanel);
      reservationPanel = new ReservationPanel(vehicleAdapter, this,
            rentalAdapter, homePagePanel);
      bookRentalPanel = new BookRentalPanel(vehicleAdapter, this, rentalAdapter);
      unavailableVehiclePanel = new UnavailableVehiclePanel(vehicleAdapter,
            this, rentalAdapter);

      tabPane = new JTabbedPane();
      tabPane.addTab("Home Page", homePagePanel);
      tabPane.addTab("Book vehicle", bookingPanel);
      tabPane.addTab("Reserve vehicle", reservationPanel);
      tabPane.addTab("Search", bookRentalPanel);
      tabPane.addTab("Unavailable Vehicles", unavailableVehiclePanel);
      tabPane.addChangeListener(tabListener);

      add(tabPane);
      setSize(900, 600);
      setVisible(true);
      setResizable(false);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);

   }

   /**
    * return tab on selected index
    * 
    * @param index
    */
   public void changeTab(int index)
   {
      tabPane.setSelectedIndex(index);
   }

   /**
    * sets selected vehicle
    * 
    * @param vehicle
    */
   public void setSelectedVehicle(Vehicle vehicle)
   {
      selectedVehicle = vehicle;
   }

   /**
    * @return a selected vehicle
    */
   public Vehicle getSelectedVehicle()
   {
      return selectedVehicle;
   }

   /**
    * @param resets
    *           pickUpDateTime on bookingPanel and reservationPanel tabs
    * @param resets
    *           deliveryDateTime
    */
   public void resetBookingDates(DateTime pickUpDateTime,
         DateTime deliveryDateTime)
   {
      bookingPanel.displayDateTime(pickUpDateTime, deliveryDateTime);
      reservationPanel.displayDateTime(pickUpDateTime, deliveryDateTime);
   }

   /**
    * Replaces vehicle object on bookingPanel and reservationPanel tabs
    */
   public void setVehicleDetails()
   {
      bookingPanel.selectedVehicleDetails();
      reservationPanel.selectedVehicleDetails();
   }

   /**
    * @return a total price
    */
   public double getTotalPrice()
   {
      return totalPrice;
   }

   /**
    * Sets total price to object
    * 
    * @param totalPrice
    */
   public void setTotalPrice(double totalPrice)
   {
      this.totalPrice = totalPrice;
   }

   private class MyTabListener implements ChangeListener
   {

      @Override
      public void stateChanged(ChangeEvent e)
      {

      }
   }

   public static void main(String[] args)
   {
      carRentalGuiAdapter gui1 = new carRentalGuiAdapter();
   }
}
