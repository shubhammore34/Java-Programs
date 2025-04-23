public class BitwiseOperator {
    public static void main(String[] args) {
        /*   1. Bitwise AND (&)
            This operator is a binary operator, denoted by ‘&.’ It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0. 

            Example:
            a = 5 = 0101 (In Binary)
            b = 7 = 0111 (In Binary)

            Bitwise AND Operation of 5 and 7
              0101
            & 0111
            ________
               0101  = 5 (In decimal) 
                    
        */

        int a = 5;
        int b = 2; 
        System.out.println(a & b); //0


        /* 2. Bitwise OR (|) 
        It returns bit by bit OR of input values, 
        i.e., if either of the bits is 1, it gives 1, else it shows 0. 

        Example:
        a = 5 = 0101 (In Binary)
        b = 7 = 0111 (In Binary)

        Bitwise OR Operation of 5 and 7
          0101
        | 0111
        ________
          0111  = 7 (In decimal)  

        */
        int c = 5;
        int d = 2;
        System.out.println(c | d); //5 | 2 = 0101 | 0010 = 0111 = 7

        /* 3. Bitwise XOR (^) 
            It returns bit by bit XOR of input values, i.e., if corresponding bits are different, it gives 1, else it shows 0. 

            Example:
            a = 5 = 0101 (In Binary)
            b = 7 = 0111 (In Binary)

            Bitwise XOR Operation of 5 and 7
              0101
            ^ 0111
            ________
              0010  = 2 (In decimal) 

        */
        
        System.out.println(a ^ b); 

      /* 4. Bitwise Right shift operator (>>) */
    
        System.out.println(a >> b);
      
      /* 5. Bitwise Left shift operator(<<) */
       
        System.out.println(a << b);
      
      /* 6. Bitwise Complement (~)
        This operator is a unary operator, denoted by ‘~.’ It returns the one’s complement representation of the input value, i.e., with all bits inverted, which means it makes every 0 to 1, and every 1 to 0. 

        Example:
        a = 5 = 0101 (In Binary)

        Bitwise Complement Operation of 5 in java (8 bits)

        ~ 00000101
        ________
          11111010  = -6 (In decimal) 


        Explanation: ~5 inverts bits to 11111111 11111111 11111111 11111010, which is -6 in two’s complement form. */
        System.out.println(~a);
    }
}