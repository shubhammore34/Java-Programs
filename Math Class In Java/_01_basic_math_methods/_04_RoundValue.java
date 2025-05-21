public class _04_RoundValue {
    public static void main(String[] args) {
      
        System.out.println(Math.round(5.1)); //5
        System.out.println(Math.round(5.5)); //6 
        System.out.println(Math.round(5.9)); //6
        
        System.out.println(Math.round(-5.1));  //-5
        System.out.println(Math.round(-5.5));  //-5
        System.out.println(Math.round(-5.9));  //-6 
        
        System.out.println(Math.round(-0.25));   //0
        System.out.println(Math.round(0.0));   //0
      
        
        System.out.println(Math.round(Double.MIN_VALUE));   
        System.out.println(Math.round(Double.MAX_VALUE));   
    }
}