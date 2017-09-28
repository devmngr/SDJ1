package q2;
public abstract class Employee
{
   private Date birthday;
   private String name;

   public Employee(String name, Date birthday)
   {
      this.name = name;
      this.birthday = birthday.copy();
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public Date getBirthday()
   {
      return birthday.copy();
   }

   public String toString()
   {
      return "Name " + name + "\tBirthday " + birthday + "\t";
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Employee))
      {
         return false;
      }

      Employee other = (Employee) obj;
      return name.equals(other.name) && birthday == other.birthday;
   }

   public abstract double earningsPerWeek();
}
