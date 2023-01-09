package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {2,5,8,9,45,78};
        int target = 9;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
    //take the arguments which needed on the next recursive call
    static int binarySearch(int[] arr, int target,int start,int end){
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (target>arr[mid]){
            //remember to return the data type while calling the recursive method else it will not return at the end
            return binarySearch(arr,target,start+1,end);
        }
        return binarySearch(arr,target,start,end-1);
    }
}
