/*num = 123
* rev = 321
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;
        int rev = 0;

        while(num > 0) //123 //12 //1
        {
            int rem = 0; //0 //3 //2

            rem = num % 10; //3 //2 //1
            rev = rev*10 + rem; //0*10 + 3 = 3 //3*10 + 2 = 32 //32*10 + 1 = 321
                                                                                                                                
            num = num/10; //123/10 = 12 //12/10 = 1 //1/10 = 0
        }

        System.out.println("Reversed number : " +rev);
    }
}
