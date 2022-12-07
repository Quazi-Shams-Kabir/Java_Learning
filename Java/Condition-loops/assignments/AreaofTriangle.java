import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 0 to exit, 1 to continue: ");
            int loop=in.nextInt();
            if (loop==1) {
                System.out.println("Enter the base: ");
                int b = in.nextInt();
                System.out.println("Enter the height: ");
                int h = in.nextInt();
                System.out.println("Area of triangle is " +(b * h)/2);
            }
            else break;
        }
    }
}
