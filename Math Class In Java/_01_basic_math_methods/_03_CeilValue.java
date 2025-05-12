public class _03_CeilValue {
    public static void main(String[] args) {
      
        System.out.println(Math.ceil(5.1));   //6
        System.out.println(Math.ceil(5.5));   //6
        System.out.println(Math.ceil(5.9));   //6
        
        System.out.println(Math.ceil(-5.1));   //-5
        System.out.println(Math.ceil(-5.5));   //-5
        System.out.println(Math.ceil(-5.9));    //-5
        
        System.out.println(Math.ceil(-0.25));   //0
        System.out.println(Math.ceil(0.0));   //0
        System.out.println(Math.ceil(-1.0 / 0));   //-Infinity 
        
        System.out.println(Math.ceil(Double.MIN_VALUE));   
        System.out.println(Math.ceil(Double.MAX_VALUE));   
    }
}