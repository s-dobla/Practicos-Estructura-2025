public class Greating {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!Welcome to Java!");
        } else {
            System.out.println(" Please run the program with your name as an argument.");
        }
    }
}