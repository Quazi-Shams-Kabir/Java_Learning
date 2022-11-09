//print all the 3 digit armstrong num

public class armstrongnum {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)){
                System.out.println(i+" ");
            }
        }
    }

    static boolean armstrong(int num) {
        int temp=num;
        int add=0;

        while(num>0){
            int rem=num%10;
            add += rem*rem*rem;
            num /=10;
        }
        return add==temp;
    }
}
