import java.util.Scanner;

public class ReadFloatValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        float a = sc.nextFloat();

        /*   Size of float datatype = 32bits  or  4bytes
            Max Value float datatype = 3.4028235E38
            Min Value float datatype = 1.4E-45  */
        
        System.out.println("The number is: " + a);
    }
}