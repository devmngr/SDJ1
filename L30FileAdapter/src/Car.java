public class Car
{
   private String regNumber, make, model;
   private int year;
   private Owner owner;

   public Car(String regNumber, String make, String model, int year, Owner owner)
   {
      this.regNumber = regNumber;
      this.make = make;
      this.model = model;
      this.year = year;
      this.owner = owner;
   }

   public String getRegNumber()
   {
      return regNumber;
   }

   public String getMake()
   {
      return make;
   }

   public String getModel()
   {
      return model;
   }

   public int getYear()
   {
      return year;
   }

   public Owner getOwner()
   {
      return owner;
   }

   public String toString()
   {
      return regNumber + "," + make + "," + model + "," + year + "," + owner;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Car))
      {
         return false;
      }
      
      Car other = (Car)obj;
      return regNumber.equals(other.regNumber) && make.equals(other.make) 
            && model.equals(other.model) && year == other.year;
   }

}
