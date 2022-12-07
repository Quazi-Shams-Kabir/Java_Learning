import java.util.Scanner;

public class AreaofIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
                System.out.println("Enter the length of base: ");
                int b = in.nextInt();
                System.out.println("Enter the length of hypotenuse: ");
                int a = in.nextInt();
                float h = (float) Math.sqrt((a*a)-((b*b)/4.0));
                System.out.println("Height is: "+h);
                System.out.println("Area of Isosceles triangle is " +(b*h)/2);
                System.out.println("Enter 0 to exit");
                int loop=in.nextInt();
                if (loop==0) break;
        }
    }
}