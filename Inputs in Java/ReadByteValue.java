import java.util.Scanner;

public class ReadByteValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        byte a = sc.nextByte();

        /*  Size of byte datatype = 8bits  or  1byte
            Max Value byte datatype = 127
            Min Value byte datatype = -128
            Default Value byte datatype = 0 */
        
        System.out.println("The number is: " + a);
    }
}