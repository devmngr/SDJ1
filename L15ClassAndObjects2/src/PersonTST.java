
public class PersonTST
{

   public static void main(String[] args)
   {
      MyDate birth = new MyDate(11,2,1992);
      Person bogdan = new Person("Bogdan", "Mitrache", birth);
      
      System.out.println(bogdan.getAge());
      
      

   }

}
