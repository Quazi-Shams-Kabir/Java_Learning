import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 if you want to calculate with diagonal, 2 if you want with base and height: ");
            int choose = in.nextInt();
            if (choose==2){
                System.out.println("Enter the length of base: ");
                int b = in.nextInt();
                System.out.println("Enter the height: ");
                int h = in.nextInt();
                System.out.println("Area of rhombus is " + b * h);
            }
            else if(choose==1){
                System.out.println("Enter the length of diagonal 1: ");
                int d1 = in.nextInt();
                System.out.println("Enter the length of diagonal 2: ");
                int d2 = in.nextInt();
                System.out.println("Area of rhombus is "+(d1*d2)/2);
            }
            System.out.println("Enter 0 to exit");
            int loop=in.nextInt();
            if (loop==0) break;
        }
    }
}
