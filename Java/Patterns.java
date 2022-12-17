public class Patterns {
    public static void main(String[] args) {
        int n=5;
        pattern8(n);
    }
    static void pattern1(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 0; i < 2*n-1 ; i++) {
            if (i<n){
            for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else{
            for (int k = 0; k < 2*n-i-1; k++) {
                System.out.print("* ");
            }
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 0; i < n ; i++) {
            for (int k = 0; k <i ; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int i = 1; i <= n ; i++) {
            for (int k = 0; k <n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i+i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
