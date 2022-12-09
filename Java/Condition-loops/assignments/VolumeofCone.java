import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter height: ");
            int h = in.nextInt();
            System.out.println("Enter radius of base: ");
            int r = in.nextInt();
            System.out.println("Volume of cone is " + (Math.PI*(r*r)*h)/3);

            System.out.println("Enter 0 to exit");
            int loop=in.nextInt();
            if (loop==0) break;
        }
    }
}
