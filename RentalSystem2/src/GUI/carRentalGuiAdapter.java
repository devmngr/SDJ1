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

   private VehicleFileAdapter vehicleAdapter;
   private RentalFileAdapter rentalAdapter;

   private JTabbedPane tabPane;

   private HomePagePanel homePagePanel;
   private BookingPanel bookingPanel;
   private ReservationPanel reservationPanel;
   private UnavailableVehiclePanel unavailableVehiclePanel;
   private BookRentalPanel bookRentalPanel;
   private Vehicle selectedVehicle;
   // private MyButtonListener buttonListener;
   private MyTabListener tabListener;

   public carRentalGuiAdapter()
   {

      super("Car rental GUI");

      vehicleAdapter = new VehicleFileAdapter("VehicleList.bin");
      rentalAdapter = new RentalFileAdapter("Rentals.bin");
      // buttonListener = new MyButtonListener;
      tabListener = new MyTabListener();

      homePagePanel = new HomePagePanel(vehicleAdapter, this,rentalAdapter);
      bookingPanel = new BookingPanel(vehicleAdapter, this,rentalAdapter, homePagePanel);
      reservationPanel = new ReservationPanel(vehicleAdapter,this,rentalAdapter,homePagePanel);
      bookRentalPanel = new BookRentalPanel(vehicleAdapter, this,rentalAdapter);
      unavailableVehiclePanel = new UnavailableVehiclePanel(vehicleAdapter,this,rentalAdapter);

      tabPane = new JTabbedPane();
      tabPane.addTab("Home Page", homePagePanel);
      tabPane.addTab("Book vehicle", bookingPanel);
      tabPane.addTab("Reserve vehicle", reservationPanel);
      tabPane.addTab("Search Reservation", bookRentalPanel);
      tabPane.addTab("Uunavailable Vehicles", unavailableVehiclePanel);
      tabPane.addChangeListener(tabListener);

      add(tabPane);
      setSize(900, 600);
      setVisible(true);
      setResizable(false);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);

   }

   public void changeTab(int index)
   {
      tabPane.setSelectedIndex(index);
   }

   public void setSelectedVehicle(Vehicle vehicle)
   {
      selectedVehicle = vehicle;
   }

   public Vehicle getSelectedVehicle()
   {
      return selectedVehicle;
   }

   public void resetBookingDates(DateTime pickUpDateTime,
         DateTime deliveryDateTime)
   {
      bookingPanel.displayDateTime(pickUpDateTime, deliveryDateTime);
      reservationPanel.displayDateTime(pickUpDateTime, deliveryDateTime);
   }
   public void setVehicleDetails()
   {
      bookingPanel.selectedVehicleDetails();
      reservationPanel.selectedVehicleDetails();
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