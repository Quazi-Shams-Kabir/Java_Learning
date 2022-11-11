import java.util.Scanner;

public class sumofinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true){
            int a = in.nextInt();
            if (a>0){
                sum=sum+a;
            }
            else{
                break;
            }
        }
        System.out.println(sum);
    }
}
