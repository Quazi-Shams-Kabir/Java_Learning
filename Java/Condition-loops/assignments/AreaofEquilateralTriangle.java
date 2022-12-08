import java.util.Scanner;

public class AreaofEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter length of side: ");
            int a = in.nextInt();
            System.out.printf("Area of parallelogram is %.2f\n",Math.sqrt(3)/4*(a*a));
        System.out.print("Enter 0 to exit");
        int loop=in.nextInt();
        if (loop==0) break;
        }
    }
}
