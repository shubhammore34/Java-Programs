import java.util.Scanner;
public class ExceptionHandlingEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor : ");
        int divisor = sc.nextInt();
        
        try {
            int result = dividend/divisor;
            System.out.println("Result : " +result);  
        } 
        catch(ArithmeticException e) {
            System.out.println("Divisor can't be Zero"); 

            e.printStackTrace(); ///java.lang.ArithmeticException: / by zero at ExceptionHandlingEx2.mai(ExceptionHandlingEx2.java:11)

            System.out.println(e.getMessage()); // / by zero
        }
        
        /*catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Divisor can't be Zero");
        }
        */
        

        /* When divided by zero Eg : 1/0 
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionHandlingEx1.main(ExceptionHandlingEx1.java:10) */
    }
}
