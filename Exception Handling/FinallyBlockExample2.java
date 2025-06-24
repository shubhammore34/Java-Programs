/*Case 2: When the exception rises and handled by the catch block

In this case, the program throws an exception but handled by the catch block, and finally block executes after the catch block. */

public class FinallyBlockExample2 {
    public static void main(String[] args) {
        try {
            System.out.println("inside try block");

            // Throw an Arithmetic exception
            System.out.println(34 / 0);
        }

        // catch an Arithmetic exception
        catch (ArithmeticException e) {

            System.out.println(
                "catch : exception handled.");
        }

        // Always execute
        finally {  
          
          System.out.println("finally : i execute always.");
        }
    }
}
