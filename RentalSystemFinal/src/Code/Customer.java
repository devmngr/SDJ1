package Code;

import java.io.Serializable;
/**
 * A class containing a Customer object.
 * @author Bogdan Mitrache
 *@version 1.0
 */
public class Customer implements Serializable
{
   private String firstName;
   private String lastName;
   private int phoneNumber;
   private String driverLicenseNumber;
   private String street;
   private String number;
   private String postalCode;
   private String city;


   /**
    * Constructor initializing the Customer object for the booking of a vehicle.
    * @param firstName the first name of the customer.
    * @param lastName the last name of the customer.
    * @param phoneNumberthe phone number of the customer.
    * @param driverLicenseNumber the driver license number of the customer.
    * @param street the street on which the customer has residence.
    * @param number the number at which the customer has residence. Can include also letters, floor, apartment and side.
    * @param postalCode the postal code at which the customer has residence.
    * @param city the city in which the customer has residence.
    */
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

   /**
    * Constructor initializing the Customer object for the reservation of a vehicle.
    * @param firstName the first name of the customer.
    * @param lastName the last name of the customer.
    * @param phoneNumberthe phone number of the customer.
    */
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
/**
 * Gets the first name.
 * @return the first name of the customer object.
 */
   public String getFirstName()
   {
      return firstName;
   }
   /**
    * Gets the last name.
    * @return the last name of the customer object.
    */
   public String getLastName()
   {
      return lastName;
   }
   /**
    * Gets the phone number.
    * @return the phone number of the customer object.
    */
   public int getPhoneNumber()
   {
      return phoneNumber;
   }
   /**
    * Gets the driver license number.
    * @return the driver license number of the customer object.
    */
   public String getDriverLicenseNumber()
   {
      return driverLicenseNumber;
   }
   /**
    * Gets the street.
    * @return the street at which the customer has residence.
    */
   public String getStreet()
   {
      return street;
   }
   /**
    * Gets the number.
    * @return the  number at which the customer has residence.
    */
   public String getNumber()
   {
      return number;
   }
/**
 * Gets the postal code.
 * @return the postal code at which the customer has residence.
 */
   public String getPostalCode()
   {
      return postalCode;
   }
/**
 * Gets the city.
 * @return the city in which the customer has residence.
 */
   public String getCity()
   {
      return city;
   }
/**
 * Gets the details of a customer object that has a reservation.
 * @param customer the customer used to get the details from..
 * @return the customers first name, last name and phone number.
 */
   public String getCustomerDetailsReservation(Customer customer)
   {
      return "Name: " + firstName + lastName + phoneNumber;
   }
   /**
    * Returns a string representation of the Customer object.
    */
   public String toString()
   {
      return "\nCustomer\n" + "Name: " + firstName + " " + lastName
            + "\nPhone: " + phoneNumber + "\nDriver License nr: "
            + driverLicenseNumber + "\nAddress: " + street + " " + number
            + ", " + postalCode + ", " + city;
   }
}
