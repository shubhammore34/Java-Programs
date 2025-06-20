import java.util.Scanner;
public class ExceptionHandlingEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor : ");
        int divisor = sc.nextInt();

        int result = dividend/divisor;

        System.out.println("Result : " +result);

        /* When divided by zero Eg : 1/0 
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionHandlingEx1.main(ExceptionHandlingEx1.java:10) */
    }
}
