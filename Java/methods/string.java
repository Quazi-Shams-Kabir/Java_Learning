import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println(greetings(name));
    }

    static String greetings(String name) {
        String myString = "Hi!!! Welcome to my Repo " + name; //we can do something like this
        return myString;
    }
}
