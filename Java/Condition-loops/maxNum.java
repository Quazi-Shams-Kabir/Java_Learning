import java.util.Scanner;

public class maxNum {   //not array, just basic implementation of condition
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a,b,c;
        System.out.println("Enter three values and check which one is is max");

        //input
        System.out.print("Enter first value: ");
        a = in.nextInt();
        System.out.print("Enter second value: ");
        b = in.nextInt();
        System.out.print("Enter third value: ");
        c = in.nextInt();

        int max=a;

        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }

        //or
       int max2=Math.max(c,Math.max(a,b));   //shortcut

        //output
        System.out.println(max);
        System.out.println(max2);
    }
}
