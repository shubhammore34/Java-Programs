public class FloatDatatype {
        
    public static void main(String args[]) {
       /*   Size of float datatype = 32bits  or  4bytes
            Max Value float datatype = 3.4028235E38
            Min Value float datatype = 1.4E-45  */
        
        // float a = 10.5;     // FloatDataType.java:8: error: incompatible types: possible lossy conversion from double to float
        // float b = -10.5;    // FloatDataType.java:9: error: incompatible types: possible lossy conversion from double to float
       
        float c = 20.8f;
        float d = -20F;
        float s = 22l;
        float u = 2244444444444444444l;
        
        float e = 9223372036854775807l;
        float f = -9223372036854775808l;
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("s = " + s);
        System.out.println("u = " + u);
        
    }
}