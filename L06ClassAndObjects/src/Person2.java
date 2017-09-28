
public class Person2

{
   
   
   private String name;
   private String birthday;
   
   
   public   Person2(String name, String birthday)
   {
     this.name = name;
     this.birthday = birthday;
   }
   
   
   public void setName(String name)
   { 
      this.name = name;
   }
   

   
   public String getName()
   {
      return name;
   }
   
   
   public String getBirthday()
   {
      return birthday;
   }
   
   public String toString()
   {
      return "Name: " + name + "\nBirthday: " + birthday + "\n";
   }
   
}



