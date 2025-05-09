import java.util.Scanner;

public class ReadIntegerValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        /*  Size of int datatype = 32bits  or  4bytes
            Max Value int datatype = 2147483647
            Min Value int datatype = -2147483648 */
            
        System.out.println("The number is: " + a);
    }
}