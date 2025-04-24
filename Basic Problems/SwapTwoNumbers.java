public class SwapTwoNumbers {
  
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
    
        
        // 1st Approach: Using third variable
        /*int c;

        c = a; //c = 10
        a = b; //a = 20
        b = c; //b = 10
        */
        
        // 2nd Approach: Using Arithmetic Operator
        /* 
        a = a + b; //a = 10 + 20 = 30
        b = a - b; //b = 30 - 20 = 10
        a = a - b; //a = 30 - 10 = 20
        */
        
        // 3rd Approach: Using Bitwise Operator
        /* Bitwise XOR (^) 
            It returns bit by bit XOR of input values, i.e., if corresponding bits are different, it gives 1, else it shows 0. 

            Example:
            a = 5 = 0101 (In Binary)
            b = 7 = 0111 (In Binary)

            Bitwise XOR Operation of 5 and 7
              0101
            ^ 0111
            ________
              0010  = 2 (In decimal)  */

        /* 16 8 4 2 1 */


        int x = 5; //In Binary 5 = 0101
        int y = 7; //In Binary 7 = 0111

        x = x ^ y; //0101 ^ 0111 = 0010 = 2
        y = x ^ y; //0010 ^ 0111 = 0101 = 5
        x = x ^ y;//0010 ^ 0101 = 0111 = 7
        
        System.out.println("x = " +x);
        System.out.println("y = " +y);
        
    }
}