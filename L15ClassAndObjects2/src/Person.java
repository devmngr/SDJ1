public class Person
{
   private String name;
   private String address;
   private MyDate birthday;

   public Person(String name, String address, MyDate birthday)
   {
      this.name = name;
      this.address = address;
      this.birthday = birthday;
   }

   public Person(String name, MyDate birthday)
   {
      this.name = name;
      this.birthday = birthday;
   }

   public Person(MyDate birthday)
   {
      this.birthday = birthday;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getAddress()
   {
      return address;
   }

   public void setAddress(String address)
   {
      this.address = address;
   }

   public MyDate getBirthday()
   {
      return birthday;
   }

   public int getAge()
   {
      if (MyDate.today().getMonth() < birthday.getMonth())
      {
         return MyDate.today().getYear() - birthday.getYear() - 1;
      }
      else if (MyDate.today().getMonth() == birthday.getMonth())
      {
         if (MyDate.today().getDay() < birthday.getDay())
         {
            return MyDate.today().getYear() - birthday.getYear() - 1;
         }
         else
         {
            return MyDate.today().getYear() - birthday.getYear();
         }

      }
      else if (MyDate.today().getMonth() > birthday.getMonth())
      {
         return MyDate.today().getYear() - birthday.getYear();
      }

      else
         return 0;
   }

   public String toString()
   {
      return "Name: " + name + "/tAddress: " + address + "Birthday: "
            + birthday + "Age: " + getAge();
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Person))
      {
         return false;
      }
      Person other = (Person) obj;
      return name == other.name && address == other.address
            && birthday == other.birthday;
   }
}
