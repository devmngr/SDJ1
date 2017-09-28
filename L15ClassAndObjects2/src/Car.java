public class Car
{

   private String make;
   private String model;
   private String color;
   private String licenseNumber;
   private int year;

   public Car(String make, String model, String color, String licenseNumber,
         int year)
   {
      this.make = make;
      this.model = model;
      this.color = color;
      this.licenseNumber = licenseNumber;
      this.year = year;
   }

   public Car(String make, String model, String color, int year)
   {
      this.make = make;
      this.model = model;
      this.color = color;
      this.year = year;
      licenseNumber = "No license number!";
   }

   public String getMake()
   {
      return make;
   }

   public String getModel()
   {
      return model;
   }

   public String getColor()
   {
      return color;
   }

   public String getLicenseNumber()
   {
      return licenseNumber;
   }

   public int getYear()
   {
      return year;
   }

   public void setColor(String color)
   {
      this.color = color;
   }

   public void setLicenseNumber(String licenseNumber)
   {
      this.licenseNumber = licenseNumber;
   }

   public Car copy()
   {
      return new Car(make, model, color, licenseNumber, year);
   }

   public String toString()
   {
      return "Make: " + make + "\tModel: " + model + "\tColor " + color
            + "\tLicense number: " + licenseNumber + "\tYear: " + year;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Car))
      {
         return false;
      }
      Car other = (Car) obj;

      return make == other.make && model == other.model && color == other.color
            && licenseNumber == other.licenseNumber && year == other.year;
   }

}
