public class Patterns {
    public static void main(String[] args) {
        int n=5;
        pattern17(n);
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
    static void pattern9(int n){
        for (int i = n; i >= 0 ; i--) {
            for (int k = 0; k <n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i+i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <i ; k++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for (int i = 0; i < n ; i++) {
            for (int k = 0; k <i ; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for (int i = 0; i <2*n ; i++) {
            if (i<n){
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" *  ");
            }
        }
            else {
                for (int m = 0; m < n - i-1 + n; m++) {
                    System.out.print("  ");
                }
                for (int l = 0; l <= i - n; l++) {
                    System.out.print(" *  ");
                }
            }
            System.out.println();
        }
    }
    static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern14(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for (int i=1; i<n;i++){
            for (int j = i; j <n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i)-1 ; k++) {
                if (k==1||k==(2*i)-1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=n; i>0;i--){
            for (int j = i; j <n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i)-1 ; k++) {
                if (k==1||k==(2*i)-1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void pattern16(int n) {
        int coef = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || i == 0)
                    coef = 1;
                else
                    coef = coef * (i - k + 1) / k;
                System.out.print(coef + " ");
            }
            System.out.println();
        }
    }   //need to check later
    static void pattern17(int n){
        for (int i = 1; i <=n ; i++) {
            for (int k = 0; k <n-i ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int l = 2; l <=i ; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i = n-1; i >0 ; i--) {
            for (int k = 0; k <n-i ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int l = 2; l <=i ; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
    static void pattern26(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <=n-i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
