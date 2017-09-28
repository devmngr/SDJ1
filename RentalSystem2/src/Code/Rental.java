package Code;

import java.io.Serializable;
import java.time.DayOfWeek;

public class Rental implements Serializable
{
   private int bookingID;
   private String pickUpLocation;
   private String deliveryLocation;
   private double price;
   private Customer customer;
   private DateTime pickUpDateTime;
   private DateTime deliveryDateTime;
   private Vehicle vehicle;

   public Rental(Customer customer, DateTime pickUpDateTime,
         DateTime deliveryDateTime, Vehicle vehicle, String pickUpLocation,
         String deliveryLocation, double price)
   {
      this.bookingID = customer.getPhoneNumber();
      this.customer = customer;
      this.pickUpDateTime = pickUpDateTime;
      this.deliveryDateTime = deliveryDateTime;
      this.vehicle = vehicle;
      this.pickUpLocation = pickUpLocation;
      this.deliveryLocation = deliveryLocation;
      this.price = price;
      vehicle.book();
   }

   public Rental(Customer customer, DateTime pickUpDateTime,
         DateTime deliveryDateTime, Vehicle vehicle, double price)
   {
      this.bookingID = customer.getPhoneNumber();
      this.customer = customer;
      this.pickUpDateTime = pickUpDateTime;
      this.deliveryDateTime = deliveryDateTime;
      this.vehicle = vehicle;
      this.price = price;
      vehicle.reserve();

   }

   public Rental()
   {

   }

   public int getBookingID()
   {
      return bookingID;
   }

   public String getID()
   {
      String i = "";
      if(bookingID == 0)
      {
         return " Not valid bookingID!";
      }
      return i + bookingID;
      
   }

   public DateTime getPickUpDate()
   {
      return pickUpDateTime;
   }

   public DateTime getDeliveryDate()
   {
      return deliveryDateTime;
   }
   public Vehicle getVehicle()
   {
      return vehicle;
   }

   public Customer getCustomer()
   {
      return customer;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Rental))
      {
         return false;
      }

      Rental other = (Rental) obj;
    
         return bookingID == other.bookingID && customer.equals(other.customer)
         && pickUpDateTime.equals(other.pickUpDateTime)
         && deliveryDateTime.equals(other.deliveryDateTime)
         && vehicle.equals(other.vehicle)
         && pickUpLocation.equals(other.pickUpLocation)
         && deliveryLocation.equals(other.deliveryLocation)
         && price == other.price;
   }

   public String toString()
   {
      return "BookingID: " + bookingID + customer + "\nPick Up"
            + pickUpDateTime + "\nLocation: " + pickUpLocation + "\nDelivery: "
            + deliveryDateTime + "\nLocation: " + deliveryLocation + vehicle
            + "\nTotal price: " + price;
   }
}
