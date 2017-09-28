public class GradeList
{

   private int grades[];

   public GradeList(int numberOfGrades)
   {
      grades = new int[numberOfGrades];

      for (int i = 0; i < grades.length; i++)
      {
         grades[i] = -1;
      }

   }

   public int getNumberOfGrades()
   {
      int count = 0;
      for (int i = 0; i < grades.length; i++)
      {
         if (grades[i] != -1)
         {
            count++;
         }
      }
      return count;

   }

   public int getGrade(int index)
   {
      return grades[index];
   }

   public void setGrade(int grade, int index)
   {
      grades[index] = grade;
   }

   public double getAvarage()
   {
      int total = 0;

      for (int i = 0; i < grades.length; i++)
      {
         if (grades[i] != -1)
         {
            total += grades[i];
         }

      }
      return (double)total / getNumberOfGrades();
   }

   public String toString()
   {
      String returnStr = "";

      for (int i = 0; i < grades.length; i++)
      {
         if (grades[i] == -1)
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
      if (!(obj instanceof GradeList))
      {
         return false;
      }

      GradeList other = (GradeList) obj;

      if (grades.length != other.grades.length)
      {
         return false;
      }
      else
      {
         for (int i = 0; i < grades.length; i++)
         {
            if (grades[i] == -1 && other.grades[i] != -1)
            {
               return false;
            }
            else if (grades[i] != -1)
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
