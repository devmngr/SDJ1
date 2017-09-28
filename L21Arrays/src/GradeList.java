import java.util.ArrayList;


public class GradeList
{
 private ArrayList<Grade> grades = new ArrayList<Grade>();


   public GradeList(int numberOfGrades)
   {
      grades = new Grade[numberOfGrades];
  
   }

   public int getNumberOfGrades()
   {
      int count = 0;
      for (int i = 0; i < grades.size(); i++)
      {
         if (grades.get(i) != null)
         {
            count++;
         }
      }
      return count;

   }

   public Grade getGrade(int index)
   {
      return grades.get(index);
   }

   public void setGrade(Grade grade, int index)
   {
      grades[index] = grade;
   }

   public double getAvarage()
   {
      int total = 0;

      for (int i = 0; i < grades.size(); i++)
      {
         if (grades.get(i) != null)
         {
            total += grades.get(i).getGrade();
         }

      }
      return (double)total / getNumberOfGrades();
   }

   public String toString()
   {
      String returnStr = "";

      for (int i = 0; i < grades.size(); i++)
      {
         if (grades.get(i) == null)
         {
            returnStr += "Empty\n";
         }
         else
            returnStr += grades.get(i) + "\n";
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

      if (grades.size() != other.grades.size())
      {
         return false;
      }
      else
      {
         for (int i = 0; i < grades.size(); i++)
         {
            if (grades.get(i) == null && other.grades.get(i) != null)
            {
               return false;
            }
            else if (grades.get(i) != null)
            {
               if (!(grades.get(i) == (other.grades.get(i))))
               {
                  return false;
               }
            }

         }
         return true;
      }
   }
}


