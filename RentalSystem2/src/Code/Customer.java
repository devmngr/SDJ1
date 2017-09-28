package Code;

import java.io.Serializable;

public class Customer implements Serializable
{
   private String firstName;
   private String lastName;
   private int phoneNumber;
   private String driverLicenseNumber;
   private String street;
   private String number; // //changed from streetNumber
   private String postalCode;
   private String city;

   // /For Booking
   public Customer(String firstName, String lastName, int phoneNumber,
         String driverLicenseNumber, String street, String number,
         String postalCode, String city)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNumber = phoneNumber;
      this.driverLicenseNumber = driverLicenseNumber;
      this.street = street;
      this.number = number;
      this.postalCode = postalCode;
      this.city = city;
   }

   // For reservation
   public Customer(String firstName, String lastName, int phoneNumber)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNumber = phoneNumber;
      this.driverLicenseNumber = null;
      this.street = null;
      this.number = null;
      this.postalCode = null;
      this.city = null;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public int getPhoneNumber()
   {
      return phoneNumber;
   }

   public String getDriverLicenseNumber()
   {
      return driverLicenseNumber;
   }

   public String getStreet()
   {
      return street;
   }

   public String getNumber()
   {
      return number;
   }

   public String getPostalCode()
   {
      return postalCode;
   }

   public String getCity()
   {
      return city;
   }

   public String getCustomerDetailsReservation(Customer customer)
   {
      return "Name: " + firstName + lastName + phoneNumber;
   }

   public String getCustomerDetailsBooking(Customer customer)
   {
      return customer.toString();
   }

   public String toString()
   {
      return "\nCustomer\n" + "Name: " + firstName + " " + lastName
            + "\nPhone: " + phoneNumber + "\nDriver License nr: "
            + driverLicenseNumber + "\nAddress: " + street + " " + number
            + ", " + postalCode + ", " + city;
   }
}
