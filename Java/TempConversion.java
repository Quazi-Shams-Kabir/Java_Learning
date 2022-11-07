import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // no need of two scanner in java
        System.out.println("Choose your conversion mode: 1. C to F , 2. F to C");
        int conversion_mode = input.nextInt();

        if (conversion_mode==1){
            System.out.println("Converting C to F...");
        }
        else {
            System.out.println("Converting F to C...");
        }

        System.out.println("Enter temperature: ");
        float temp = input.nextInt();
        System.out.println("Your inserted temperature is "+temp);

        float ans = conversion(temp,conversion_mode);
        System.out.println(ans);
    }

    static float conversion(float temp, int conversionmode) {
        if (conversionmode==1){
            return  (temp * 9/5) + 32;
        }
        else return (temp-32)*5/9;

    }
}
