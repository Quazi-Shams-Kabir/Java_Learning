import java.util.Scanner;

public class fiboAtIndex {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //default values
        int a=0;
        int b=1;

        System.out.print("Enter the index of which you want fibo num of: ");
        int index=in.nextInt();

        int i=1;
          while (i < index) {
                int temp = a;
                a = a + b;
                b = temp;
                i++;
            }

        //output
        System.out.println(a);
    }
}
