public class _01_AbsoluteValue {
    public static void main(String[] args) {
      
        System.out.println(Math.abs(75));  //|75| = 75
        System.out.println(Math.abs(-75));  // |-75| = 75
        
        System.out.println(Math.abs(89L)); //|89| = 89
        System.out.println(Math.abs(-89L)); // |-89| = 89
        
        System.out.println(Math.abs(32.2f)); // |32.2| = 32.2
        System.out.println(Math.abs(-32.2f)); // |-32.2| = 32.2
        
        System.out.println(Math.abs(22.265)); 
        System.out.println(Math.abs(-22.265));
        
        System.out.println(Math.abs(Integer.MIN_VALUE));  //-2147483648
        System.out.println(Math.abs(Integer.MAX_VALUE));  //2147483647
        System.out.println(Math.abs(7.0 / 0));   
    }
}