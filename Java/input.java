import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //new is a keyword in java use to make new objects, Scanner is a class for taking inputs, System.in is used to take input from keyboard.
        System.out.println(in.nextInt()); //use to display output , ln mean new line , nextInt mean next integer.
        in.nextLine();  //to consume \n (enter) used as nextInt() don't consume EOF and the next() with consume the Enter and will not take your input. like getchar() in c
        System.out.println(in.next()); //for string without space
        in.nextLine();
        System.out.print(in.nextLine());  //for strings
 }
}
