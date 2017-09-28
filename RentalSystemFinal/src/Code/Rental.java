package Code;

import java.io.Serializable;

/**
 * A class containing a Rental object which implements Serializable
 * @author Bogdan Mitrache
 * @version 1.0
 */
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

   /**
    * Constructor initializing the Rental object for the booking of a vehicle.
    * @param customer the customer object of a Rental object
    * @param pickUpDateTime the pick up DateTime object of a Rental object
    * @param deliveryDateTime the delivery DateTime object of a Rental object
    * @param vehicle the Vehicle object of a Rental object
    * @param pickUpLocation the pick up location of a Rental object
    * @param deliveryLocation the delivery location of a Rental object
    * @param price the price of a rental
    */
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

   /**
    * Constructor initializing the Rental object for the reservation of a vehicle.
    * @param customer the customer object of a Rental object
    * @param pickUpDateTime the pick up DateTime object of a Rental object
    * @param deliveryDateTime the delivery DateTime object of a Rental object
    * @param vehicle the Vehicle object of a Rental object
    * @param price the price of a Rental object
    */
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

   /**
    * Gets the booking ID
    * @return the booking ID
    */
   public int getBookingID()
   {
      return bookingID;
   }

   /**
    * Gets the booking ID of a Rental object as a String 
    * @return the booking ID
    */
   public String getID()
   {
      String i = "";
      if (bookingID == 0)
      {
         return " Not valid bookingID!";
      }
      return i + bookingID;

   }

   /**
    * Gets the pick up DateTime object of a Rental object
    * @return the pick up date
    */
   public DateTime getPickUpDate()
   {
      return pickUpDateTime;
   }

   /**
    * Gets the delivery DateTime object of a Rental object
    * @return the delivery date
    */
   public DateTime getDeliveryDate()
   {
      return deliveryDateTime;
   }
   /**
    * Gets the Vehicle object of a Rental object
    * @return the vehicle
    */
   public Vehicle getVehicle()
   {
      return vehicle;
   }

   /**
    * Gets the Customer object of a Rental object
    * @return the customer
    */
   public Customer getCustomer()
   {
      return customer;
   }

   /**
    * Gets the price of a Rental object
    * @return the price
    */
   public double getPrice()
   {
      return price;
   }

   /**
    * Indicates whether some other Rental object is "equal to" this one.
    */
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
   /**
    * Returns a string representation of the Rental object.
    */
   public String toString()
   {
      return "BookingID: " + bookingID + customer + "\nPick Up: "
            + pickUpDateTime + "\nLocation: " + pickUpLocation + "\nDelivery: "
            + deliveryDateTime + "\nLocation: " + deliveryLocation + vehicle
            + "\nTotal price: " + price;
   }
}
