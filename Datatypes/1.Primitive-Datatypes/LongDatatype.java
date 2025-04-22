public class LongDatatype {
        
    public static void main(String args[]) {
        /*  Size of long datatype = 64bits  or  8bytes
            Max Value long datatype = 9223372036854775807
            Min Value long datatype = -9223372036854775808 */
        
        long a = 10;
        long b = -10;
        long c = 20L; 
        long d = -20l;
        
        long e = 9223372036854775807l;
        long f = -9223372036854775808l;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
    
        // long g = 9223372036854775808;    // LongDataType.java:23: error: integer number too large
        // long h = -9223372036854775809;   // LongDataType.java:24: error: integer number too large
    }
}