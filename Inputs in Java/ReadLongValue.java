import java.util.Scanner;

public class ReadLongValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long a = sc.nextLong();

        /*  Size of long datatype = 64bits  or  8bytes
            Max Value long datatype = 9223372036854775807
            Min Value long datatype = -9223372036854775808 */
        
        System.out.println("The number is: " + a);
    }
}