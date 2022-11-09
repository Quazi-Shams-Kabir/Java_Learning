import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int count=0;

        System.out.print("Enter the number: ");
        num = in.nextInt();

        if(num==0){
            count=1;
        }
else {
            while (num > 0) {
                num /= 10;
                count++;
            }
        }
        System.out.println(count);
    }
}
