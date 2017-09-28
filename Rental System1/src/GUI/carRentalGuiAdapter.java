package GUI;
import Code.*;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class carRentalGuiAdapter extends JFrame
{

    private VehicleFileAdapter adapter;

   private JTabbedPane tabPane;

   private HomePagePanel homePagePanel;
   private BookingPanel bookingPanel;
   private ReservationPanel reservationPanel;
   private RentalPanel rentalPanel;
   private UnavailableVehiclePanel unavailableVehiclePanel;
   private BookRentalPanel bookRentalPanel;
private Vehicle selectedVehicle;
   // private MyButtonListener buttonListener;
   private MyTabListener tabListener;

   public carRentalGuiAdapter()
   {
     
      super("Car rental GUI");
      
      adapter = new VehicleFileAdapter("D:/Workspace/Rental System/VehicleList.bin");

      // buttonListener = new MyButtonListener;
      tabListener = new MyTabListener();

      homePagePanel = new HomePagePanel(adapter, this);
      bookingPanel = new BookingPanel();
      reservationPanel = new ReservationPanel();
      rentalPanel = new RentalPanel();
      bookRentalPanel = new BookRentalPanel();
      unavailableVehiclePanel = new UnavailableVehiclePanel();

      tabPane = new JTabbedPane();
      tabPane.addTab("Home Page", homePagePanel);
      tabPane.addTab("Booking", bookingPanel);
      tabPane.addTab("Reservation", reservationPanel);
      tabPane.addTab("Book Rental", bookRentalPanel);
      tabPane.addTab("Reserve Rental", rentalPanel);
      tabPane.addTab("Uunavailable", unavailableVehiclePanel);
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
   public String getSelectedVehicleDetails()
   {
      return selectedVehicle.getVehicleDetails();
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