import java.util.Scanner;

public class _10_FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        
        if(num < 0) {
            System.out.println("Factorial of negative number is not defined 😜");
        }

        else if(num==1) {
            System.out.println(num + "! = " + num);
        }
        
        else {
            int i = 2, fact = 1;
            
            do {
                fact *= i;
                i++;
            } while(i <= num);
        
            System.out.println(num + "! = " + fact);
        }
        
    }
}