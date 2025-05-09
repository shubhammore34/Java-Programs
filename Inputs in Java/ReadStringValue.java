import java.util.Scanner;

public class ReadStringValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Full Name: ");
        String a = sc.next();
        
        sc.nextLine();
        System.out.print("Enter Your Full Name: ");
        String b = sc.nextLine();
        
        System.out.println("Full Name by Next() = " + a);
        System.out.println("Full Name by NextLine() = " + b);
    }
}