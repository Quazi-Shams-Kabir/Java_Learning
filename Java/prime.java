import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want check whether Prime or not: ");
        int prime=in.nextInt();

        if (prime <= 1){
            System.out.println("Neither Prime nor Composite");
            return;
        }
        int check = 2;
        while (check * check <= prime) {
            if (prime % check == 0){
            System.out.println("Entered number is Composite");
                    break;
            }
            check += 1;
        }
        if (check*check>prime)
        System.out.println("Entered number is Prime");

    }
}
