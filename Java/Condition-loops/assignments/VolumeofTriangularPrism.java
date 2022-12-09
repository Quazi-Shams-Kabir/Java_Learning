import java.util.Scanner;

public class VolumeofTriangularPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter height of triangle side: ");
            int a = in.nextInt();
            System.out.println("Enter the length of base of triangle side: ");
            int b = in.nextInt();
            System.out.println("Enter the height of prism: ");
            int h = in.nextInt();
            System.out.println("Volume of triangular prism is " + (a*b*h)/2);

            System.out.println("Enter 0 to exit");
            int loop=in.nextInt();
            if (loop==0) break;
        }
    }
}
