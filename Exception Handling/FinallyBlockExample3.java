/*Case 3: When exception rise and not handled by the catch block 

In this case, the program throws an exception but not handled by catch so finally block execute after the try block and after the execution of finally block program terminate abnormally, But finally block execute fine. */
public class FinallyBlockExample3 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");

            // Throw an Arithmetic exception
            System.out.println(34 / 0);
        }

        // Can not accept Arithmetic type exception
        // Only accept Null Pointer type Exception
        catch (NullPointerException e) {

            System.out.println("catch : exception not handled.");
        }

        // Always execute
        finally {

            System.out.println("finally : i will execute always.");
        }
        // This will not execute
        System.out.println("i want to run");
    }
}
