import java.util.Scanner;

public class PerimeterofParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the length of one side: ");
            int a = in.nextInt();
            System.out.println("Enter the length of the unparallel side: ");
            int b = in.nextInt();
            System.out.println("Perimeter of rectangle is " + 2*(a + b));

            System.out.println("Enter 0 to exit");
            int loop=in.nextInt();
            if (loop==0) break;
        }
    }
}
