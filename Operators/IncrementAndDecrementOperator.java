public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
        // 1. Pre Increment Operator (++x)
        int a = 5;
        System.out.println("a = " + ++a); //6
        
        // 2. Post Increment Operator (x++)
        int b = 5;
        System.out.println("b = " + b++); //5
        System.out.println("b = " + b++ ); //6
        
        // 3. Pre Decrement Operator (--x)
        int c = 5;
        System.out.println("c = " + --c); //4
        
        // 4. Post Decrement Operator (x--)
        int d = 5;
        System.out.println("d = " + d--); //5
        System.out.println("d = " + d--); //4

        
        int jay = 21;
        int veeru = jay++;
        System.out.println("veeru  = " + veeru); //21
        System.out.println("jay   = " + jay); //22


        int Hema = 21;
        int Rekha = ++Hema;
        System.out.println("Rekha  = " + Rekha); //22
        System.out.println("Hema  = " + Hema); //22

        int x = 10;
        int y = 5;
        System.out.println(x++ + ++y); //10 + 6 =  16
       


        int e = 5;
        int f = e--;
        System.out.println("e = " + e); //4
        System.out.println("f = " + f); //5

        
        int g = 5;
        int h = --g;
        System.out.println("g = " + g); //4
        System.out.println("h = " + h); //4
        
        int i = 5;
        int j = i++;
        System.out.println("i =  " + i); //6
        System.out.println("j =  " + j);  //5
        
        int k = 5;
        int l = ++k;
        System.out.println("k = " + k);   //6
        System.out.println("l = " + l);    //6
    }
}