package Code;

public class CreateVehicles
{

   public static void main(String[] args)
   {

      // FamilyCars

      FamilyCar Passat = new FamilyCar("Vw", "Passat", 2016, 300, 45000, 5,
            2.0, "Diesel", 25, "manual", 5, true, true, 8, true, "black",
            "UV43865", 40000);

      FamilyCar PassatCC = new FamilyCar("Vw", "CC", 2016, 300, 25000, 5, 1.9,
            "Diesel", 21, "manual", 5, true, true, 8, true, "white", "UG78457",
            20000);

      FamilyCar Multivan = new FamilyCar("Vw", "Multivan", 2012, 300, 35000, 5,
            1.9, "Benzin", 20, "manual", 5, true, true, 8, true, "red",
            "GG77777", 20000);

      FamilyCar GolfIV = new FamilyCar("Vw", "GolfIV", 2013, 300, 22000, 5,
            1.6, "Benzin", 25, "automatic", 5, true, true, 8, false, "blue",
            "GB77878", 20000);

      FamilyCar GolfV = new FamilyCar("Vw", "V", 2009, 300, 31000, 5, 2.2,
            "Benzin", 20, "manual", 5, true, true, 8, true, "green", "AB87777",
            20000);

      FamilyCar GolfVI = new FamilyCar("Vw", "VI", 2013, 300, 34789, 5, 1.9,
            "Diesel", 21, "automatic", 5, true, false, 8, true, "white",
            "GG87677", 20000);

      FamilyCar HondaCivic = new FamilyCar("Honda", "Civic", 2007, 300, 65000,
            5, 1.4, "Benzin", 22, "manual", 5, true, true, 8, true, "black",
            "BB77777", 60000);

      FamilyCar ChevroletMalibu = new FamilyCar("Chevrolet", "Malibu", 2007,
            300, 47000, 5, 1.4, "Benzin", 24, "manual", 5, true, true, 8, true,
            "yellow", "BB78777", 40000);

      FamilyCar HyundaiSonata = new FamilyCar("Hyundai", "Sonata", 2016, 300,
            105000, 5, 1.4, "Diesel", 27, "manual", 5, true, true, 8, true,
            "blue", "AA77777", 100000);

      FamilyCar KiaOptima = new FamilyCar("Kia", "Optima", 2008, 300, 75000, 5,
            1.9, "Diesel", 17.8, "manual", 5, true, true, 8, true, "brown",
            "CA97777", 60000);

      FamilyCar HondaHrV = new FamilyCar("Honda", "HRV", 2015, 300, 85000, 5,
            1.6, "Benzin", 23.3, "automatic", 5, true, true, 8, true, "cyan",
            "GG77477", 80000);

      FamilyCar HondaCRV = new FamilyCar("Honda", "CRV", 2014, 300, 22222, 5,
            1.9, "Diesel", 24, "manual", 5, true, false, 8, true, "orange ",
            "BB77788", 20000);

      FamilyCar SubaruOutBack = new FamilyCar("Honda", "Civic", 2009, 300,
            33333, 5, 1.9, "Diesel", 20, "automatic", 5, false, true, 8, true,
            "red", "AA71477", 20000);

      FamilyCar NissanPathFInder = new FamilyCar("Honda", "Civic", 2007, 300,
            44444, 5, 1.9, "Diesel", 25, "manual", 5, true, true, 8, true,
            "yellow", "DE7779", 40000);

      FamilyCar DaciaDuster = new FamilyCar("Dacia", "Duster", 20014, 300,
            66666, 5, 1.5, "Benzin", 18, "manual", 5, true, true, 8, true,
            "red", "GR74377", 60000);

      FamilyCar ToyotaHighLander = new FamilyCar("Toyota", "HighLander", 2016,
            300, 88888, 5, 2.4, "Diesel", 20, "manual", 5, true, false, 8,
            true, "black", "UT67543", 80000);

      FamilyCar HondaPilot = new FamilyCar("Honda", "Pilot", 2015, 300, 99999,
            5, 1.9, "Diesel", 23, "automatic", 5, true, true, 8, true, "white",
            "AA75477", 80000);

      FamilyCar FordFocus = new FamilyCar("Ford", "Focus", 2007, 300, 108000,
            5, 1.8, "Diesel", 22, "manual", 5, true, true, 8, true, "orange",
            "AB7735", 100000);

      FamilyCar FordFiesta = new FamilyCar("Ford", "Fiesta", 2009, 300, 124700,
            5, 1.9, "Benzin", 19, "manual", 5, true, true, 8, false, "black ",
            "BB12377", 120000);

      FamilyCar FordMax = new FamilyCar("Ford", "Max", 2010, 300, 21500, 5,
            1.7, "Diesel", 25, "manual", 5, false, true, 10, true, "red",
            "JJ97777", 20000);

      FamilyCar FordBMax = new FamilyCar("Ford", "BMax", 2010, 300, 47000, 5,
            1.9, "Diesel", 22, "manual", 5, true, true, 8, true, "white",
            "BA78777", 40000);

      FamilyCar BMW525 = new FamilyCar("BMW", "525", 2011, 300, 66666, 5, 1.7,
            "Benzin", 25, "manual", 5, true, true, 8, true, "black", "GG25777",
            60000);

      FamilyCar BMW519 = new FamilyCar("BMW", "519", 2007, 300, 77777, 5, 1.9,
            "Diesel", 25, "automatic", 5, true, true, 8, true, "red",
            "LY76544", 60000);

      FamilyCar BMW528i = new FamilyCar("BMW", "518i", 2012, 300, 55478, 5,
            1.6, "Benzin", 25, "manual", 5, true, true, 8, true, "black",
            "CC73777", 40000);

      FamilyCar BMWX3 = new FamilyCar("BMW", "X3", 2012, 300, 27895, 5, 1.9,
            "Benzin", 22, "manual", 5, true, true, 8, true, "white", "KK77777",
            20000);

      FamilyCar BMWX5 = new FamilyCar("BMW", "X5", 2012, 300, 30000, 5, 1.7,
            "Diesel", 25, "manual", 5, true, true, 8, true, "orange",
            "LL77777", 20000);

      FamilyCar OpelAstra = new FamilyCar("Opel", "Astra", 2009, 300, 150000,
            5, 2.0, "Benzin", 23, "manual", 5, true, true, 8, true, "red",
            "BB77777", 140000);

      FamilyCar OpelAdam = new FamilyCar("Opel", "Adam", 2010, 300, 47898, 5,
            1.9, "Diesel", 25, "manual", 5, true, true, 8, true, "red",
            "HG24577", 40000);

      // Van Cars

      Van DaciaLodgy = new Van("Dacia", "Lodgy", 2015, 300, 22222, 7, 1.9,
            "Diesel", 21, "manual", 5, true, true, 7, true, "black", "YT54578",
            20000, 3500);

      Van FiatMultipla = new Van("Fiat", "Multipla", 2009, 300, 24000, 5, 1.7,
            "Benzin", 25, "manual", 5, true, true, 8, true, "red", "BB77777",
            20000, 3500);

      Van FiatIdea = new Van("Fiat", "Idea", 2012, 300, 25000, 5, 1.9,
            "Diesel", 20, "manual", 5, true, true, 7, true, "black", "AA77777",
            20000, 3500);

      Van FiatPanda = new Van("Fiat", "Panda", 2014, 300, 44000, 5, 2.0,
            "Benzin", 21, "automatic", 3, true, true, 5, true, "white",
            "CC77777", 40000, 3500);

      Van FordTransit = new Van("Ford", "Transit", 2007, 300, 124000, 5, 1.9,
            "Benzin", 27, "manual", 5, true, true, 6, true, "black ",
            "YY77777", 120000, 3500);

      Van FordEcoNovan = new Van("Ford", "EcoNovan", 2016, 300, 34000, 5, 1.6,
            "Diesel", 2, "manual", 5, true, true, 5, true, "orange", "TR77887",
            20000, 3500);

      Van FordTransitConect = new Van("Ford", "TransitConect", 20012, 300,
            74000, 5, 1.7, "Diesel ", 21, "manual", 5, true, true, 8, true,
            "green", "II12777", 60000, 3500);

      Van HondaMobilio = new Van("Honda", "Mobilio", 2008, 300, 224000, 5, 1.9,
            "Diesel", 22, "manual", 5, true, true, 6, true, "white", "PO77777",
            220000, 3500);

      Van ChevroletExpress = new Van("Chevrolet", "Express", 2005, 300, 124000,
            5, 1.6, "Benzin", 20, "manual", 5, true, true, 8, true, "red",
            "XX87534", 120000, 3500);

      Van ChryslerVoyager = new Van("Chrysler", "Voyager", 2012, 300, 148000,
            5, 1.6, "Benzin", 21, "manual", 5, true, true, 8, true, "brown",
            "AA73477", 140000, 3500);

      Van CitroenBerlingo = new Van("Citroen", "Berlingo", 2009, 300, 424000,
            5, 1.4, "Diesel", 23, "manual", 5, true, true, 8, true, "red",
            "PP45777", 420000, 3500);

      Van CitroenJumper = new Van("Fiat", "Multipla", 2009, 300, 324000, 5,
            1.9, "Benzin", 18, "manual", 5, true, true, 8, true, "yellow",
            "BB77777", 320000, 3500);

      // Moving Trucks

      MovingTruck GmcTopKick = new MovingTruck("GMC", "Topkick", 2005, 300,
            124000, 5, 2.5, "Diesel", 15, "manual", 5, true, true, 8, true,
            "white", "XY87534", 120000, "9,20m3");

      MovingTruck Iveco80E = new MovingTruck("Iveco", "80E", 2005, 300, 134000,
            5, 2.5, "Diesel", 16, "manual", 5, true, true, 8, true, "black",
            "AY17534", 120000, "9,20m3");

      MovingTruck FiatDucato = new MovingTruck("Fiat", "Ducato", 2005, 300,
            113000, 5, 2.5, "Diesel", 15, "manual", 5, true, true, 8, true,
            "white", "FY81234", 100000, "13m3");

      MovingTruck FiatDucatoLift = new MovingTruck("Fiat", "DucatoLift", 2005,
            300, 184000, 5, 2.5, "Diesel", 15, "manual", 5, true, true, 8,
            true, "blue", "TR63214", 180000, "18m3");
      // Autocamper

      AutoCamper KnausVanT = new AutoCamper("Knaus", "VanTI", 2005, 300,
            124000, 5, 2.5, "Diesel", 15, "manual", 5, true, true, 8, true,
            "white", "XY87534", 120000, 4);

      VehicleList vehicles = new VehicleList();

      vehicles.addVehicle(KnausVanT);
      vehicles.addVehicle(FiatDucatoLift);
      vehicles.addVehicle(FiatDucato);
      vehicles.addVehicle(Iveco80E);
      vehicles.addVehicle(GmcTopKick);

      vehicles.addVehicle(CitroenJumper);
      vehicles.addVehicle(CitroenBerlingo);
      vehicles.addVehicle(ChryslerVoyager);
      vehicles.addVehicle(ChevroletExpress);
      vehicles.addVehicle(HondaMobilio);

      vehicles.addVehicle(FordTransitConect);
      vehicles.addVehicle(FordEcoNovan);
      vehicles.addVehicle(FordTransit);
      vehicles.addVehicle(FiatPanda);
      vehicles.addVehicle(FiatIdea);

      vehicles.addVehicle(FiatMultipla);
      vehicles.addVehicle(DaciaLodgy);
      vehicles.addVehicle(OpelAdam);
      vehicles.addVehicle(OpelAstra);
      vehicles.addVehicle(BMWX5);

      vehicles.addVehicle(BMWX3);
      vehicles.addVehicle(BMW528i);
      vehicles.addVehicle(BMW519);
      vehicles.addVehicle(BMW525);
      vehicles.addVehicle(FordBMax);

      vehicles.addVehicle(FordMax);
      vehicles.addVehicle(FordFiesta);
      vehicles.addVehicle(FordFocus);
      vehicles.addVehicle(HondaPilot);
      vehicles.addVehicle(ToyotaHighLander);

      vehicles.addVehicle(DaciaDuster);
      vehicles.addVehicle(NissanPathFInder);
      vehicles.addVehicle(SubaruOutBack);
      vehicles.addVehicle(HondaCRV);
      vehicles.addVehicle(HondaHrV);

      vehicles.addVehicle(KiaOptima);
      vehicles.addVehicle(HyundaiSonata);
      vehicles.addVehicle(ChevroletMalibu);
      vehicles.addVehicle(HondaCivic);
      vehicles.addVehicle(GolfVI);

      vehicles.addVehicle(GolfV);
      vehicles.addVehicle(GolfIV);
      vehicles.addVehicle(Multivan);
      vehicles.addVehicle(PassatCC);
      vehicles.addVehicle(Passat);

      VehicleFileAdapter adapter = new VehicleFileAdapter("VehicleList.bin");

      
      System.out.println(vehicles);
   }

}
