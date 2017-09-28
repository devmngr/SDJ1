
public class Employee
{
   private  String   name;
   private  int      idNumber;
   private  String   department;
   private  String   position;
   

  

   public void setName(String n)
   {
      name = n;
   }
   
   public void setIdNumber(int id)
   {
      idNumber = id;
   }
   
   public void setDepartment(String dep)
   {
      department = dep;
   }
   
   public void setPosition(String pos)
   {
      position = pos;
   }
   
   
   ///
   public String getDisplayData()
   {
      return name + "\t" + idNumber +"\t" + department + "\t" + position;
   }
   


}
