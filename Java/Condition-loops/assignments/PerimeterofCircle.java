import java.util.Scanner;

public class PerimeterofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the radius of circle: ");
            int r = in.nextInt();
            System.out.println("Perimeter of circle is: " + 2 * r * Math.PI);

            System.out.print("Enter 0 to exit");
            int loop = in.nextInt();
            if (loop == 0) break;
        }
    }
}
