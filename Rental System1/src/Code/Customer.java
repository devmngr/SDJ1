package Code;

public class Customer
{
   private DateTime birthDate;
   private String firstName;
   private String lastName;
   private int phoneNumber;
   private int driverLicenseNumber;
   private String street;
   private String number;  ////changed from streetNumber
   private int postalCode;
   private String city;
   
   ///For Booking
   public Customer(String firstName, String lastName, DateTime birthDate, int phoneNumber, int driverLicenseNumber, String street, String number, int postalCode, String city)
   {
      this.firstName=firstName;
      this.lastName=lastName;
      this.birthDate=birthDate;
      this.phoneNumber=phoneNumber;
      this.driverLicenseNumber =driverLicenseNumber;
      this.street=street;
      this.number=number;
      this.postalCode=postalCode;
      this.city=city;
   }
   
   //For reservation
   public Customer(String firstName, String lastName,int phoneNumber)
   {
      this.firstName=firstName;
      this.lastName=lastName;
      this.phoneNumber=phoneNumber;
      this.birthDate= null;
      this.driverLicenseNumber=0;
      this.street=null;
      this.number=null;
      this.postalCode=0;
      this.city=null;
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
      if(birthDate == null)
      {
         return "\nCustomer\n" +"Name: " + firstName + " " + lastName + "\nPhone: " + phoneNumber;
      }
   else return   "\nCustomer\n" + "Name: " + firstName + " " + lastName + "\nBirthday: " + birthDate + "\nPhone: " + phoneNumber + "\nDriver License nr: " + driverLicenseNumber 
            + "\nAddress: " + street + " "  + number + ", " + postalCode + ", " + city;
   }
}
