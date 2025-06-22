public class ExceptionHandlingEx3 {
    public static void main(String[] args) {
        int marks[] = {90, 84, 75, 96};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        //System.out.println(marks[4]);

        try{
            System.out.println(marks[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(); // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4 at ExceptionHandlingEx3.main(ExceptionHandlingEx3.java:11)
            System.out.println(e.getMessage()); //Index 4 out of bounds for length 4
        }
    }
}
