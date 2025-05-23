// program to find the sum of first n natural numbers
// positive integers such as 1,2,3,...n are known as natural numbers


import java.util.Scanner;

public class _06_SumOfFirstNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        
         // Approach - 1 => Time Complexity = O(n)
        /*
        for (int i=1; i<=num; i++) {
            sum += i;
        }
        */
        
        
        // Approach - 2 => Time Complexity = O(1)
        sum = (num*(num+1) / 2);
    
        System.out.println("Sum = " + sum);
    }
}