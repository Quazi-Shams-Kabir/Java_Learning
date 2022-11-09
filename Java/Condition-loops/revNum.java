import java.util.Scanner;

public class revNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int ans=0;

        System.out.print("Enter the number: ");
        num = in.nextInt();


            while (num > 0) {
                int rem = num % 10;
                ans = ans*10+rem;
                num /= 10;
            }

        System.out.print(ans);
    }
}
