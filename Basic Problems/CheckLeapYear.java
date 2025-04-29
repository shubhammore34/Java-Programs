import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        if(year%4==0) {
            System.out.println("Given year a is Leap Year");
        }
        else {
            System.out.println("Given year is not Leap Year");
        }
    }
}
