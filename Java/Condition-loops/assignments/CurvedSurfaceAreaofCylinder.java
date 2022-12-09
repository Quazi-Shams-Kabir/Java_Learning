import java.util.Scanner;

public class CurvedSurfaceAreaofCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter height: ");
            int h = in.nextInt();
            System.out.println("Enter radius of base: ");
            int r = in.nextInt();
            System.out.println("Curved Surface Area Of cylinder is " + 2*(Math.PI*r*h));

            System.out.println("Enter 0 to exit");
            int loop=in.nextInt();
            if (loop==0) break;
        }
    }
}
