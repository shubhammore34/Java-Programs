import java.util.Scanner;

public class _09_SumOfFirstNEvenAndOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int i = 1;
        int evenSum = 0, oddSum = 0;
    
        while (i <= num) {
            if(i%2 == 0)
                evenSum += i;
            else
                oddSum += i;
                
            i++;
        }
        
        System.out.println("Sum of first " + num + " Even Sum = " + evenSum);
        System.out.println("Sum of first " + num + " Odd Sum = " + oddSum);
    }
}