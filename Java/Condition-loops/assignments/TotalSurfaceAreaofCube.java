import java.util.Scanner;

public class TotalSurfaceAreaofCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter side: ");
            int a = in.nextInt();
            System.out.println("Total Surface Area Of cube is " + 6*(a*a));

            System.out.println("Enter 0 to exit");
            int loop=in.nextInt();
            if (loop==0) break;
        }
    }
}
