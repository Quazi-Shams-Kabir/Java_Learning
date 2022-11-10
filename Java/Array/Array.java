import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int [5];
        arr[0]=45;
        arr[1]=84;
        System.out.println(Arrays.toString(arr));

        //or
        int[] arr2 = {1,2,54,858};
        System.out.println(Arrays.toString(arr2));

        //or taking input
        Scanner in = new Scanner(System.in);
        int[] arr3 = new int [5];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i]=in.nextInt();
        }

        //output using loop
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        //using for each loop
        for(int index:arr3){
            System.out.print(index+" ");
        }
        System.out.println();
        //array of object
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

        for(String x:str){
            System.out.println(x);
        }
    }
}
