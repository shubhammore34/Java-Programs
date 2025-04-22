public class IntDatatype {
        
    public static void main(String args[]) {
        /*  Size of int datatype = 32bits  or  4bytes
            Max Value int datatype = 2147483647
            Min Value int datatype = -2147483648 */
        int a = 10;
        int b = -10;
        
        int c = 2147483647;
        int d = -2147483648;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        // int e = 2147483648;    // IntDataType.java:19: error: integer number too large
        // int f = -2147483649;   // IntDataType.java:20: error: integer number too large
    }
}