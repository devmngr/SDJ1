public class Student
{
   private String name;
   private int grade;

   public Student(String name, int grade)
   {
      this.name = name;

      if (grade != -3 || grade != 0 || grade != 2 || grade != 4 || grade != 7
            || grade != 10 || grade != 12)
      {
         try
         {
         throw new IllegalGradeException();
         }
         catch(IllegalGradeException e)
         {
            System.out.println(e.getMessage());
         }
        
      }
      this.grade = grade;
      

   }

   public String getName()
   {
      return name;
   }

   public int getGrade()
   {
      return grade;
   }

   public void setGrade(int grade)
   {
      if (grade != -3 || grade != 0 || grade != 2 || grade != 4 || grade != 7
            || grade != 10 || grade != 12)
      {
         try
         {
            this.grade = grade;
         }
         catch(IllegalGradeException e)
         {
            System.out.println(e.getMessage());
         }
        
      }
      

   }

   public String toString()
   {
      return "Student: " + name + "\nGrade: " + grade + "\n";
   }
}
