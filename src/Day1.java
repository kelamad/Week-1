import hsa.*;
public class Day1 {
    
    public static void main(String[] args) {
        Console c=new Console();
        c.print("Hello from the console");
        int age;
        c.print("\nHow old are you? ");
        age=c.readInt();
        age++;
        c.print("\nNext year you will be: "+age);
    
    }
}
