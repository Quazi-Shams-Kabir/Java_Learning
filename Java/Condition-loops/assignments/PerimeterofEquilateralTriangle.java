import java.util.Scanner;

public class PerimeterofEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter length of side: ");
            int a = in.nextInt();
            System.out.println("Perimeter of parallelogram is: "+3*a);
            System.out.println("Enter 0 to exit");
            int loop=in.nextInt();
            if (loop==0) break;
        }
    }
}
