import java.util.Scanner;

public class trimString {
    public static void main(String[] args) {
        System.out.print("Enter any string: ");
        Scanner in = new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        System.out.print("First char of the string is: "+ ch);
    }
}
