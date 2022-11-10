import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<Integer>();

        //some basic functions of array list
        arr.add(0);  //elements will be inside brackets and order will index num
        arr.add(46);
        arr.add(85);
        arr.add(4654);
        arr.add(4642);
        arr.add(4246);
        arr.add(4246);

        //different ways to print arraylist
        System.out.println(arr);
        System.out.println(arr.get(5));   //to get element at index 5, started from 0.
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();

        //input
        for (int i = 0; i < 5; i++) {
            arr.add(in.nextInt());
        }
        System.out.println(arr);  //it'll add 5 more element

in.nextLine(); //to eat up extra line from enter
        //multi arraylist
        ArrayList <ArrayList<String>> str = new ArrayList<>();

        //initialize the number of array list, like 2D array
        for (int i = 0; i < 3; i++) {     //create 3 new arraylist inside arraylist
            str.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                str.get(i).add(in.nextLine());
            }
        }
        System.out.println(str);

    }
}
