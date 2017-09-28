

public class StudentTest
{

   public static void main(String[] args)
   {
      Student studentOne = new Student("Alex", 'M', 123);
      Student studentTwo = new Student("Martha", 'F', 456789 );
      Student studentThree = new Student ("Inge", 'F');
      
      //Get method
      System.out.println("Student 1 get-method: " +  studentOne.getStudentNumber() 
            + "\t" + studentOne.getName() + "\t" + studentOne.getGender() + "\n");
      
      //String method
      System.out.println("String method print: " + "\n" + studentOne 
            + "\n" + studentTwo + "\n" +  studentThree);
      
      
      
      //Set..
      String name = "Morten";
      studentOne.setName(name);
      
      String name1 = "Monika";
      studentTwo.setName(name1);
      
      char gender = 'M';
      studentTwo.setGender(gender);
    
      int studentNumber = 9999;
      studentThree.setStudentNumber(studentNumber);
      
      
      System.out.println("\n" + "!!!Changed Data: \n" + studentOne);
      System.out.println(studentTwo);
      System.out.println(studentThree);
      
      

   }

}
