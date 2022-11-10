import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int [] arr ={1,24,541,4,4,42};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        for (int i = start; i < end; i++) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[]arr ,int start, int end){

        int temp = arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
    }

}
