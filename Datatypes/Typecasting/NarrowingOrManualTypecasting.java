public class NarrowingOrManualTypecasting {
    public static void main(String args[]) {
        int a = 98;
        float b = 10.5f;
        char c = 'a';
        double d = 105.34;
        
        byte m1 = (byte)a; //98
        byte m2 = (byte)c;  //97
        byte m3 = (byte)d;  //105
        
        int n1 = (int)b; //10
        int n2 = (int)d; //105
        int n3 = (int)10374L; //10374
        
        char o1 = (char)a; //b
        char o2 = (char)d; //i
        char o3 = (char)56; //8
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3 + "\n");
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3 + "\n");
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3 + "\n");
    }
}