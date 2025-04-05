// Input currency in rupees and output in USD

import java.util.Scanner;

public class ConvertRupeesToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rupees: ");
        float rupees = sc.nextInt();
        
        //On 04-04-2025 1 Dollar = 85.25 Rupees
        float dollar = rupees / 85.25f; //When representing a float data type in Java, we should append the letter f to the end of the data type; otherwise it will save as double. The default value of a float in Java is 0.0f.
        
        System.out.println("Dollar = " + dollar);
        
    }
}