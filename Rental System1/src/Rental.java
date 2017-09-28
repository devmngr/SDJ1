
public class Rental
{
   private int bookingID;
   private String pickUpLocation;
   private String deliveryLocation;
   private double price;
   private Customer customer;
   private DateTime pickUpDateTime;
   private DateTime deliveryDateTime;
   private Vehicle vehicle;
   
   
   public Rental(Customer customer, DateTime pickUpDateTime, DateTime deliveryDateTime, Vehicle vehicle,
         String pickUpLocation,String deliveryLocation, double price)
   {
      this.bookingID=customer.getPhoneNumber();
      this.customer=customer;
      this.pickUpDateTime=pickUpDateTime;
      this.deliveryDateTime=deliveryDateTime;
      this.vehicle=vehicle;
      this.pickUpLocation=pickUpLocation;
      this.deliveryLocation=deliveryLocation;
      this.price=price;
      vehicle.book();
   }
   public Rental(Customer customer, DateTime pickUpDateTime, DateTime deliveryDateTime, Vehicle vehicle, double price)
   {
      this.bookingID=customer.getPhoneNumber();
      this.customer=customer;
      this.pickUpDateTime=pickUpDateTime;
      this.deliveryDateTime=deliveryDateTime;
      this.vehicle=vehicle;
      this.price=price; 
      vehicle.reserve();
      
   }
   
   public String toString()
   {
      return  "BookingID: " + bookingID + customer + "\nPick Up" + pickUpDateTime + "\nLocation: " + pickUpLocation + 
            "\nDelivery: " + deliveryDateTime + "\nLocation: "+ deliveryLocation + 
            vehicle + "\nTotal price: " +  price;
   }
}
