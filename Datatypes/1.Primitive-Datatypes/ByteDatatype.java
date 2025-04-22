public class ByteDatatype {

    public static void main(String args[]) {
        /*  Size of byte datatype = 8bits  or  1byte
            Max Value byte datatype = 127
            Min Value byte datatype = -128
            Default Value byte datatype = 0 */

        byte a = 10;
        byte b = -100;
        
        byte c = 127;
        byte d = -128;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //byte e = 128;   // ByteDataType.java:23: error: incompatible types: possible lossy conversion from int to byte
        // byte f = -129;  // ByteDataType.java:24: error: incompatible types: possible lossy conversion from int to byte
    }
}