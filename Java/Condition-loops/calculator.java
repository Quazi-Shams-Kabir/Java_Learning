import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;

        while(true){    //infinite loop
            System.out.println("Enter which operation you want to perform: X to exit");
            char operator = in.next().trim().charAt(0);  //to ensure it's a single char only otherwise compiler will give error coz next() takes string

            if(operator == '+'||operator == '-'||operator == '*'||operator == '/'||operator == '%'){
                //taking input
                System.out.println("Enter operands");
                System.out.print("Enter First operand: ");
                int num1= in.nextInt();
                System.out.print("Enter Second operand: ");
                int num2= in.nextInt();

                //performs operation
                if (operator=='+'){
                    ans = num1+num2;
                }
                if (operator=='-'){
                    ans = num1-num2;
                }
                if (operator=='*'){
                    ans = num1*num2;
                }
                if (operator=='/'){
                    ans = num1/num2;
                }
                if (operator=='%') {
                    ans = num1 % num2;
                }
            System.out.println("Your ans: "+ans);
            }
            else if (operator=='x' || operator=='X')
                    break;
            else System.out.println("INVALID");


        }

    }
}
