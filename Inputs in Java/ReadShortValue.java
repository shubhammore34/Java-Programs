import java.util.Scanner;

public class ReadShortValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        short a = sc.nextShort();

        /*  Size of short datatype = 16bits  or  2bytes
            Max Value short datatype = 32767
            Min Value short datatype = -32768 */
        
        System.out.println("The number is: " + a);
    }
}