 
public class Course
{


      private String name;
      private int numberOfStudents;
      
      private boolean electiveCourse;
      
      
      public Course (String name, int numberOfStudents, boolean electiveCourse)
      {
         this.name = name;
         this.numberOfStudents = numberOfStudents;
         this.electiveCourse = electiveCourse;
      }
      
      public Course (String name, boolean electiveCourse)
      {
         this.name = name;
         this.electiveCourse = electiveCourse;
         numberOfStudents = 0;
         
      }
      
      
      public Course()
      {
         name = "Unknown";
         numberOfStudents = 0;
         electiveCourse = false;
         
      }
      
      
       public String getName()
       {
          return name;
       }
       
       public int getNumberOfStudents()
       {
          return numberOfStudents;
       }
       
       public boolean getElectiveCourse()
       {
          return electiveCourse;
       }


}
