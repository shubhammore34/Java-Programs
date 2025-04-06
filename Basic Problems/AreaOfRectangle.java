import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and weight of the rectangle: ");
        float l = sc.nextFloat();
        float w = sc.nextFloat();
        
        float area = l * w; 
        
        System.out.println("Area of Rectangle = " + area);
        
        
    }
}