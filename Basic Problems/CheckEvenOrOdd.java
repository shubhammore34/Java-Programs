import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        if(number%2==0) {
            System.out.println("Number is EVEN");
        }
        else {
            System.out.println("Number is ODD");
        }

    }
}
