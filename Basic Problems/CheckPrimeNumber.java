/* WAP To Check given number is prime or not
 * Prime numbers are natural numbers that are divisible by only 1 and the number itself. In other words, prime numbers are positive integers greater than 1 with exactly two factors, 1 and the number itself. Some of the prime numbers include 2, 3, 5, 7, 11, 13, etc.
 */

class CheckPrimeNumber {
    public static void main(String[] args) {
        int num = 97;
        int count = 0;

        for(int i = 2; i<num; i++) {
            if(num%i==0) {
                count++;
            }
        }

        if(count>0) {
            System.out.println("Number is not prime number");
        }
        else {
            System.out.println("Number is Prime number");
        }

    }
}