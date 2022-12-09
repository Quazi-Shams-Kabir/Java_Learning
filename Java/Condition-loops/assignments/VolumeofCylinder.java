import java.util.Scanner;

public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter height: ");
            int h = in.nextInt();
            System.out.println("Enter radius: ");
            int r = in.nextInt();
            System.out.println("Volume of cylinder is " + Math.PI*(r*r)*h);

            System.out.println("Enter 0 to exit");
            int loop=in.nextInt();
            if (loop==0) break;
        }
    }
}
