package BitwiseOperator;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr ={2,2,5,6,5,4,6};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr) {
        int unique = 0;
        for (int i : arr){
            //XOR of any number with itself give me 0, so the number remain will be the number in the array which didn't get converted into 0
            unique^=i;
        }
        return unique;
    }
}
