public class _06_MaximumValue {
    public static void main(String[] args) {
      
        System.out.println(Math.max(20, 50));   //50
        System.out.println(Math.max(345L, 3458L)); //3458
        
        System.out.println(Math.max(-25.74f, -20.38f)); //-20.38
        System.out.println(Math.max(-25.67, 87.232)); //87.23
        
        System.out.println(Math.max(1, Math.max(5, -3))); //5
    }
}