/**
 * Greeting Message.
 *
 * @author Nico Bour
 */
public class Greeting {
    
    /**
    * @param args - Command Line Arguments
    */
    public static void main(String[] args) {
    
        String name = "Nico Bour";
        String major = "Inetegrated Science and Technology";
        int classOf = 2022;
        double sleep = 4.20;
    
        System.out.print("Hi! My name is " + name + ", and I'm a " + major);
        System.out.print(" Major. I plan to graduate with the class of ");
        System.out.print(classOf + ", but I only get about ");
        System.out.println(sleep + " hours of sleep per night. Go Dukes!");    
    
    }
}