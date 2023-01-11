package BitwiseOperator;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(oddEven(n));
    }
    static boolean oddEven(int n){
        //if we AND any number with 1 it'll give us that number only, and in binary only the LSD(the least significant digit) determines if the number is odd or even coz other than all places are multiple of 2
        return (n & 1) == 1;
    }
}
