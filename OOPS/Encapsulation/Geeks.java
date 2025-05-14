// Java program demonstrating Encapsulation
class Programmer {
    private String name;

    // Getter and Setter for name
    public String getName() {
         return name; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }
}

public class Geeks {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("Geek"); 
        System.out.println("Name = " + p.getName());
    }
}