import java.util.ArrayList;
import java.util.Scanner;

public class FactorsofaNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factors(n));
    }

    static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int fac=1;

        for (int i = 0; i <n/2 ; i++) {
            if (n%fac==0){
                ans.add(fac);
            }
            fac++;
        }

        ans.add(n);
        return ans;
    }
}
