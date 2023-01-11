package BitwiseOperator;

public class Findnthbit {
    public static void main(String[] args) {
        int n = 10;
        //the bit we want
        int i = 2;
        ans(n,i);
    }
    static void ans(int n,int i) {
        // we need a mask with 1 at the ith position and & it with the number, so the resultant number will be all 0 expect for the position itself, it will be the number itself ( 0 or 1)
        System.out.println((n & (1<<(i-1)))>>(i-1));
        //we need to again right shift the result otherwise it'll print in decimal, by right shifting again ith time, the actual ans will be at 0th index, and it'll not convert into decimal, coz it's 0 or 1
    }
}
