public class _08_PowerValue {
    public static void main(String[] args) {
      
        System.out.println(Math.pow(5, 3));   //5^3 = 125
        System.out.println(Math.pow(-5, 3));    //(-5)^3 = -125
        
        System.out.println(Math.pow(-5, 2));    //(-5)^2 = 25
        System.out.println(Math.pow(-5, 1));    //(-5)^1 = -5

        System.out.println(Math.pow(5, -3));    //(5)^-3 = 
        System.out.println(Math.pow(-5, -3));     //(-5)^-3 = 
        
        System.out.println(Math.pow(2.5, 4)); //(2.5)^4 =  39.0625
        System.out.println(Math.pow(9.0, -2));   //(9)^-2 =
        System.out.println(Math.pow(-765, 0.2));  //NaN 
    }
}