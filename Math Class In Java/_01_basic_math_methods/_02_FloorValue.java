public class _02_FloorValue {
    public static void main(String[] args) {
      
        System.out.println(Math.floor(5.1));  //5 
        System.out.println(Math.floor(5.5));  //5 
        System.out.println(Math.floor(5.9));  //5
        
        System.out.println(Math.floor(-5.1));   //-6
        System.out.println(Math.floor(-5.5));   //-6
        System.out.println(Math.floor(-5.9));    //-6
        
        System.out.println(Math.floor(-0.25));   //-1
        System.out.println(Math.floor(0.0));   //0
        System.out.println(Math.floor(-1.0 / 0));   //Infinity
        
        System.out.println(Math.floor(Double.MIN_VALUE));   //
        System.out.println(Math.floor(Double.MAX_VALUE));   
    }
}