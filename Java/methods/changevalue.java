import java.util.Arrays;
import java.util.Scanner;

public class changevalue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr={1,3,4,5,5,85};
        System.out.println("Old array: "+ Arrays.toString(arr));
        System.out.print("Enter the index no. you want to change: ");
        int index = in.nextInt();
        System.out.print("Enter the target value with which you want to change: ");
        int target = in.nextInt();
        changeInd(arr,index,target);
        System.out.println("New array: "+ Arrays.toString(arr));  //simple class to print array
    }

    static void changeInd(int[] arr, int index, int target) {
        arr[index]=target;
    }
}
