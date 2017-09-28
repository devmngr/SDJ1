import java.io.ObjectInputStream.GetField;


public class GradeListTest
{

   public static void main(String[] args)
   {
      GradeList one = new GradeList(5);
      
      
      System.out.println("Get nr of grades: " + one.getNumberOfGrades());
      
      one.setGrade(10, 1);
      System.out.println("Get grade: " + one.getGrade(1));
      one.setGrade(7, 2);
      one.setGrade(12, 3);
      System.out.println("Get grade: " + one.getGrade(2));
      System.out.println("Get grade: " + one.getGrade(3));
      System.out.println("Avarage: " + one.getAvarage());
      System.out.println("ToString: \n" + one);
      
      
      GradeList two = new GradeList(5);
      two.setGrade(10, 1);
      two.setGrade(7, 2);
      two.setGrade(12, 3);
      
      GradeList tree = new GradeList(8);
      GradeList four = new GradeList(5);
      
      System.out.println("1 and 2: " + one.eqals(two) );
      System.out.println("2 and 3: " + two.eqals(tree));
      System.out.println("3 and 4: " + tree.eqals(four));
      
      
      ///Grade List 2
      
      System.out.println("GradeList2 TEST");
      GradeList2  GradeLst1 = new GradeList2(5);
      System.out.println("nr of grades." + GradeLst1.getNumberOfGrades());
      System.out.println("Get grade 1: " + GradeLst1.getGrade(0));
      
      Grade g = new Grade("Maths" , 12);
      Grade g2 = new Grade ("Java", 7);
      
      
      GradeLst1.setGrade(g, 1);
      GradeLst1.setGrade(g2, 2);
      
      System.out.println("Grade List1: " + GradeLst1.getGrade(1));
      System.out.println("Grade List1: " + GradeLst1.getGrade(2));
      
      
      
   }

}
