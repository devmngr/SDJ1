package ex3;
import java.util.ArrayList;

public class ServiceBook
{
   private ArrayList<Service> services = new ArrayList<Service>();

   public ServiceBook()
   {
      services.add(null);
   }

   public void addService(Service service)
   {
      services.add(service);
   }

   public int getNumberOfServices()
   {
      int count = 0;
      for (int i = 0; i < services.size(); i++)
      {

         if (services.get(i) != null)
         {
            count++;
         }
      }
      return count;
   }

   public Service getService(int index)
   {
      return services.get(index);
   }

   public Service[] getAllServices()
   {
      Service[] serv = new Service[services.size()];
      for (int i = 0; i < services.size(); i++)
      {
         serv[i] = services.get(i);
      }
      return serv;

   }
   
   public String toString()
   {
      return "ServiceBook" + getAllServices();
   }

}
