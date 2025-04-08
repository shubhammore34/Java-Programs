import java.util.Scanner;
public class SumOf_n_NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sum_of_n_natural_numbers = ((n)*(n+1))/2;
        System.out.println("Sum of n natural numbers are : " + sum_of_n_natural_numbers);
        
    }
}
