public class Owner
{
   private String firstName, lastName;

   public Owner(String firstName, String lastname)
   {
      this.firstName = firstName;
      this.lastName = lastname;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public String toString()
   {
      return firstName + ", " + lastName;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Owner))
      {
         return false;
      }

      Owner other = (Owner) obj;

      return firstName.equals(other.firstName)
            && lastName.equals(other.lastName);
   }

}
