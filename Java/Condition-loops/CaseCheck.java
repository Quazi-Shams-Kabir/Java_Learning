import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch = in.next().trim().charAt(0); //will check first index of string you entered

        if (ch >='a' && ch <= 'z'){
            System.out.println("lower case");
        }
        else System.out.println("upper case");
    }
}
