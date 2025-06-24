/*The finally block in java is used to put important codes such as clean up code e.g. closing the file or closing the connection. The finally block executes whether exception rise or not and whether exception handled or not. A finally contains all the crucial statements regardless of the exception occurs or not. */

/*
 There are 3 possible cases where finally block can be used:

Case 1: When an exception does not rise 

In this case, the program runs fine without throwing any exception and finally block execute after the try block.
 */


public class FinallyBlockExample1 {
    public static void main(String[] args) {
        try {
            System.out.println("inside try block");
          
            // Not throw any exception
            System.out.println(34 / 2);
        }
      
        // Not execute in this case
        catch (ArithmeticException e) {
          
            System.out.println("Arithmetic Exception");
          
        }
        // Always execute
        finally {
          
            System.out.println(
                "finally : i execute always.");
          
        }
    }
}
