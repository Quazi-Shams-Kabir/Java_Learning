import java.util.Scanner;

public class VolumeofPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter height: ");
            int h = in.nextInt();
            System.out.println("Enter length of base: ");
            int l = in.nextInt();
            System.out.println("Enter width of base: ");
            int w = in.nextInt();
            System.out.println("Volume of cone is " + (l*w*h)/3);

            System.out.println("Enter 0 to exit");
            int loop=in.nextInt();
            if (loop==0) break;
        }
    }
}
