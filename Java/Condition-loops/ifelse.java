import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num>=10){
            System.out.println("Entered number is greater than equal to 10 so we will add 50 to it: ");
                    num+=50;
            System.out.print(num);
        }
        else System.out.print("Entered number is less than 10 so we will do nothing");

    }
}
