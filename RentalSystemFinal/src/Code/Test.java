package Code;


public class Test
{

   public static void main(String[] args)
   {
      DateTime pick = new DateTime(23, 05, 2016, 15, 00, 00);
      DateTime drop = new DateTime(27, 06, 2016, 20, 00, 00);
      
      Customer customer1 = new Customer("Bogdan", "Mitrache", 29844097);
     /* Customer customer2 = new Customer("Peter", "Larsen", date1, 29844, 123456789, "Fjaeldevaenget", "46, 1 TH", 8210, "Arhus V");
      */
      
     Vehicle van = new Van("Van", "model", 2016, 100, 200000, 5, 2.0, "fuelType", 10, "transm", 5, true, true, 5, true, "blue", "AX44053", 199000, 179000);
     Vehicle van1 = new Van("VANNNNN", "model", 2016, 100, 200000, 5, 2.0, "fuelType", 10, "transm", 5, true, true, 5, true, "blue", "AX44053", 199000, 179000);
     Vehicle familycar = new FamilyCar("Family Car", "VW Passat", 2009, 500, 150000, 5, 2.0, "Disel", 22.5, "Manual", 5, true, true, 12, true, "Grey", "AX44053", 142000);
      
     Rental rent1 = new Rental(customer1, pick, drop, van, 100); ////reservation
     
     VehicleList vehiclelist = new VehicleList();
     vehiclelist.addVehicle(van1);
     vehiclelist.addVehicle(familycar);
     vehiclelist.addVehicle(van);

      
      RentalList rentallist = new RentalList();
      rentallist.addRental(rent1);

     
      VehicleFileAdapter adapterVehicles = new VehicleFileAdapter("VehicleList.bin");


      System.out.println(rent1);
      
      
      
      
      
      
    
   }

}
