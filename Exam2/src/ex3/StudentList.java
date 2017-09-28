package ex3;
import java.util.ArrayList;

public class StudentList
{
   private int size;
   private ArrayList<Student> list;

   public StudentList()
   {
      this.size = 0;
      list = new ArrayList<Student>();
   }

   public void addStudent(Student student)
   {
      list.add(student);
   }

   public Student getStudent(int index)
   {
      return list.get(index);
   }

   public void removeStudent(Student student)
   {
      list.remove(student);
   }

   public int getNumberOfStudents()
   {
      return list.size();
   }

   public int getNumberOfStudentsByEducation(Education education)
   {
      int count = 0;
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getEducation().equals(education))
         {
            count++;
         }
      }
      return count;
   }

   public Student[] getStudentsByEducation(Education education)
   {
      Student[] temp = null;
      int index = 0;
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getEducation().equals(education))
         {
            temp[index] = (Student) list.get(i);
            index++;
         }
      }
      return temp;
   }

   public int getNumberOfHighSchoolStudents()
   {
      int count = 0;
      for (int i = 0; i < list.size(); i++)
      {

         if (list.get(i).getEducation() instanceof School)
         {
            School school = (School) list.get(i).getEducation();
            if (school.getSchoolType().equals(School.HIGH_SCHOOL))
            {
               count++;
            }
         }
      }
      return count;

   }


}
