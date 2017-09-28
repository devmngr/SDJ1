
import java.io.FileNotFoundException;
import java.io.IOException;


public class RentalFileAdapter
{
private MyFileIO mfio;
private String fileName;


public RentalFileAdapter(String fileName)
{
   this.mfio= new MyFileIO();
   this.fileName =fileName;
}

public RentalList getRentalList()
{
   RentalList rentals = null;

   try
   {
      rentals = (RentalList)mfio.readObjectFromFile(fileName);
   }
   catch (FileNotFoundException e)
   {
      System.out.println("File not found");
   }
   catch (IOException e)
   {
      System.out.println("IO Error reading file");
   }
   catch (ClassNotFoundException e)
   {
      System.out.println("Class Not Found");
   }
   return rentals;
}
}




