import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        factorialOfnum(num);
    }

    static void factorialOfnum(int num) {
        int ans=1;
        if (num>2){
            for (int i = 0; i < num ; i++) {
            ans = ans*(num-i);
            }
        }
        System.out.println(ans);
    }
}
