public class ExceptionHandlingEx5 {
    public static void main(String[] args) {
        int marks[] = new int[6];
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        marks[4] = 90/2;
        //marks[5] = 40/0;

        System.out.println(marks[0]); //50
        System.out.println(marks[1]); //60
        System.out.println(marks[2]); //70
        System.out.println(marks[3]); //80
        System.out.println(marks[4]); //45
        
        //marks[5] = 40/0;
        //System.out.println(marks[5]); //Exception in thread "main" java.lang.ArithmeticException: / by zero at ExceptionHandlingEx4.main(ExceptionHandlingEx4.java:9)

        try {
            marks[8] = 98/0;
            System.out.println(marks[8]);

            //marks[6] = 99/0;
        }
        //Multiple catch blocks for one try block is possible
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        
    }
}
