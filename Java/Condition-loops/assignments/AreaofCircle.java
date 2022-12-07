import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        float PI = 3.14f;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 0 to exit, 1 to continue: ");
            int loop=in.nextInt();
            if (loop==1) {
                System.out.println("Enter the Radius: ");
                int r = in.nextInt();
                System.out.println("Area of circle is " + PI * (r * r));
            }
            else break;
        }
    }
}
