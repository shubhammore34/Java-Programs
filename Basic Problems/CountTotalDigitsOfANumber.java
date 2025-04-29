/*int num = 234
 * total digits : 3
 */

 /*logic :
  * num = num/10 = 234/10 = 23
    num = num/10 = 23/10 = 2
    num = num/10 = 2/10 = 0
  */
public class CountTotalDigitsOfANumber {
    public static void main(String[] args) {
        int num = 234;
        int count = 0;

        while(num > 0) {
            num = num/10;
            count++;
        }

        System.out.println("TOTAL DIGITS : " + count);

    }
}
