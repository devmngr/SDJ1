
public class IllegalGradeException extends RuntimeException
{
   public IllegalGradeException()
   {
      super("Invalid Grade");
   }
   
   public IllegalGradeException(String message)
   {
      super("Invalid Grade" + message);
   }
}
