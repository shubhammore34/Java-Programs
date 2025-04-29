/*num = 1221
 *palindrome number = 1221
 */
public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int num = 1221;
        int original_num = num;
        int rev = 0;
        int rem = 0; 

        while(num > 0) 
        {

            rem = num % 10; 
            rev = rev*10 + rem; 
                                                                                                                                
            num = num/10; 
        }

        if(original_num == rev) {
            System.out.println("given number is palindrome number");
        }
        else {
            System.out.println("given number is not palindrome number");
        }
    }
}


