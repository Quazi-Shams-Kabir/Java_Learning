import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int count=0;
        int whichDigit=0;

        System.out.print("Enter the number: ");
        num = in.nextInt();
        System.out.print("Enter which digit you want to count in the num: ");
        whichDigit=in.nextInt();

        while (num>0){
            int rem=num%10;
            if (rem==whichDigit){
                count++;
            }
            num /=10;
        }
        System.out.println(count);

    }
}
