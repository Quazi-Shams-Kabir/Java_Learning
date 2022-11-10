import java.util.Scanner;
import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int [][] arr = new int [2][];     //we have to mention row size here coz memory get allocated for that during compile time, 2D basically is a collection of array of same data type, that collection is Column, memory for that allocates during runtime, so we don't need to specify col no.
        //This basically gives us freedom to have variable col size in each array, if we do mention the size of col then it'll be a must rectangular array
        //but u have to initialize it here

        int [][] arr2 = new int [2][2];

        Scanner in = new Scanner(System.in);

        //input
        for (int i = 0; i < arr2.length; i++) {
            for (int j=0; j< arr2[i].length;j++){
                arr2[i][j] = in.nextInt();
            }
        }
        //output
        for (int i = 0; i < arr2.length; i++) {
            for (int j=0; j< arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
        }
        System.out.println();
        //using for each loop
        for(int[] a:arr2){
            for(int b:a){
                System.out.print(b+" ");
            }
        }
        System.out.println();
        //using toString it'll print matrix
        for(int[] a:arr2){
                System.out.println(Arrays.toString(a));
        }

    }
}
