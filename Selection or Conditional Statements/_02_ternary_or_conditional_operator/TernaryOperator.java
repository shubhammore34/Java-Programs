public class TernaryOperator {
    public static void main(String[] args) {

        // Ternary or Conditional Operator
        String ans1 = true ? "true" : "false";
        System.out.println(ans1);
        
        String ans2 = false ? "true" : "false";
        System.out.println(ans2);
        
        
      	int a = 3, b = 4;
      	int result = (a > b) ? a : b;
      	System.out.println("The greatest number is " + result);
    }
}