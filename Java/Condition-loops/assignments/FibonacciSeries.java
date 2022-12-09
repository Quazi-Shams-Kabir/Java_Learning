import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number till where you want Fib series of: ");
        int n = in.nextInt();
        fibSeries(n);
    }
    static void fibSeries(int n) {
        int a=0;
        int b=1;
        for (int i=1;i<=n;i++){
            int temp=a;
            System.out.print(a+" ");
            a=a+b;
            b=temp;
        }
    }
}
