import java.util.Scanner;

public class ifelif {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner in = new Scanner (System.in);
        int age = in.nextInt();
        if (age>=13 && age<18){
            System.out.println("You can vote for teenage leader");
        }
        else if (age>=18){  //else if can be written as if only, we can write it like if (age>18)
            System.out.println("you can vote");
        }
        else System.out.println("You can't vote"); //if there is single line you don't need curly braces
        
    }
}
