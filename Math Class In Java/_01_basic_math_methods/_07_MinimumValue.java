
public class _07_MinimumValue {
    public static void main(String[] args) {
      
        System.out.println(Math.min(20, 50));  //20 
        System.out.println(Math.min(345L, 3458L)); //345
        
        System.out.println(Math.min(-25.74f, -20.38f)); //-25.74
        System.out.println(Math.min(-25.67, 87.232));  //-25.67
        
        System.out.println(Math.min(1, Math.min(5, -3))); //1,-3 => -3
    }
}