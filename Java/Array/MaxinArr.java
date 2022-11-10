public class MaxinArr {
    public static void main(String[] args) {
        int [] arr ={1,24,541,4,4,42,};
        int start =3,end=5;
        System.out.println(max(arr));
        System.out.println(maxinrange(arr,start,end));

    }

    static int maxinrange(int[] arr, int start, int end) {
        if (start>end){
            return -1;
        }
        if (arr.length==0){
            return -1;
        }
        int max=arr[start];
        for (int i=start+1; i<=end; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int max(int[] arr) {
        int max=arr[0];
        if(arr.length==0){
        return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }

//        for (int j : arr) {
//            if (j > max) {
//                max = j;
//            }
//        }
        return max;
    }
}
