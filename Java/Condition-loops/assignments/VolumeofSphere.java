import java.util.Scanner;

public class VolumeofSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter radius: ");
            int r = in.nextInt();
            System.out.println("Volume of sphere is " + (Math.PI*(r*r*r))*4/3);

            System.out.println("Enter 0 to exit");
            int loop=in.nextInt();
            if (loop==0) break;
        }
    }
}
