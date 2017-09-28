
public class Grade
{
   private String courseName;
   private int grade;
   
   
   public Grade(String courseName, int grade)
   {
      this.courseName = courseName;
      this.grade=grade;
   }
   public String getcourseName()
   {
      return courseName;
   }
   public int getGrade()
   {
      return grade;
      
   }
   public void setCourseName(String name)
   {
      name = courseName;
   }
   public void setGrade(int grade)
   {
      this.grade=grade;
   }
   

}
