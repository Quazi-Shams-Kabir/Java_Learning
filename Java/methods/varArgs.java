import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        int a = 45,  b =50;
        Varargs(1,1,1,2,54,1,4,1,4,41,74,1,7); //notice haven't initialized array's size
        Varargs(a,b,"hi","hello","wassup"); //you can also do that but the varArg should be at last, coz otherwise how the compiler will know when to stop taking input.
    }

    static void Varargs(int...i) {
        System.out.println(Arrays.toString(i));
    }
    static void Varargs(int a, int b, String...i) {
        System.out.println(a+" "+b+" "+Arrays.toString(i));
    }
}
