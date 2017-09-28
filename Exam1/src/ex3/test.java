package ex3;
import java.util.ArrayList;


public class test
{
   public static void main(String[] args)
   {
      ArrayList<Service> services = new ArrayList<Service>();
      
      
    ServiceBook book = new ServiceBook();
    Date date =new Date();
    Service service = new Service(100, date);  
    Date date1 =new Date();
    Service service1 = new Service(1000, date1); 
    Date date2 =new Date();
    Service service2 = new Service(20000, date2);
    services.add(service);
    services.add(service1);
    services.add(service2);
    book.addService(service2);
    book.addService(service1);
    book.addService(service);
    
    
    
    System.out.println(book);
   }
}
