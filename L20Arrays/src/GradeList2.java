public class GradeList2
{

   private Grade[] grades;

   public GradeList2(int numberOfGrades)
   {
      grades = new Grade[numberOfGrades];
  
   }

   public int getNumberOfGrades()
   {
      int count = 0;
      for (int i = 0; i < grades.length; i++)
      {
         if (grades[i] != null)
         {
            count++;
         }
      }
      return count;

   }

   public Grade getGrade(int index)
   {
      return grades[index];
   }

   public void setGrade(Grade grade, int index)
   {
      grades[index] = grade;
   }

   public double getAvarage()
   {
      int total = 0;

      for (int i = 0; i < grades.length; i++)
      {
         if (grades[i] != null)
         {
            total += grades[i].getGrade();
         }

      }
      return (double)total / getNumberOfGrades();
   }

   public String toString()
   {
      String returnStr = "";

      for (int i = 0; i < grades.length; i++)
      {
         if (grades[i] == null)
         {
            returnStr += "Empty\n";
         }
         else
            returnStr += grades[i] + "\n";
      }
      return returnStr;
   }

   public boolean eqals(Object obj)
   {
      if (!(obj instanceof GradeList2))
      {
         return false;
      }

      GradeList2 other = (GradeList2) obj;

      if (grades.length != other.grades.length)
      {
         return false;
      }
      else
      {
         for (int i = 0; i < grades.length; i++)
         {
            if (grades[i] == null && other.grades[i] != null)
            {
               return false;
            }
            else if (grades[i] != null)
            {
               if (!(grades[i] == (other.grades[i])))
               {
                  return false;
               }
            }

         }
         return true;
      }
   }
}
