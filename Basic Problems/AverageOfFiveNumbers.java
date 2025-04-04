/*
Problem Description:
Given 5 numbers A, B, C, D, E as input. Print the average of these 5 numbers (correct up to 2 decimal places).

Problem Constraints:
1 <= A, B, C, D, E <= 104

Input Format:
There are five lines in the input.
Each line has an integer.

Output Format:
Print the average of the input numbers (correct up to 2 decimal places).

Example Input:
Input:-
2 2 51 27 73

Example Output:
Output:-
31.00
*/


import java.util.Scanner;
public class AverageOfFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        
        // float avg = (A + B + C + D + E) / 5.0f;
        float avg = (A + B + C + D + E) / 5;
        
        //System.out.printf("%.2f", avg);
        System.out.println("average : " + avg);
    }
}