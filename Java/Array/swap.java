import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr ={1,24,541,4,4,42,};
        swap(arr,2,5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr ,int start, int end){

            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
    }
}
