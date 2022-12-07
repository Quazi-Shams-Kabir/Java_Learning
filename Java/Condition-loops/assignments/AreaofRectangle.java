import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 0 to exit, 1 to continue: ");
            int loop=in.nextInt();
            if (loop==1) {
                System.out.println("Enter the length of one side: ");
                int a = in.nextInt();
                System.out.println("Enter the length of the unparallel side: ");
                int b = in.nextInt();
                System.out.println("Area of rectangle is " + a * b);
            }
            else break;
        }
    }
}
