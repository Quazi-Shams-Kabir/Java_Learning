public class typecast {
    public static void main(String[] args) {
        int a =45;
        float b =4.4654f;

        //implicit typecast , automatically convert smaller data type to bigger data type, here float>int = float
        System.out.println(a+b);
        //explicit, you can also do vice versa like from bigger to smaller, but you have to explicitly mention the data type, and it should be suitable convert, here float to int.
        System.out.println((int)(a+b));

        //Auto type promotion:-
        //smaller data type during evaluation/calculation can exceed there range, but it should be in range during output,
        //or it'll give remainder(%) with its range, e.g. 257 % 256 = 1 for byte if it exceeds range

        int c = 257;
        byte d = (byte) (c);  //range = -128 to 127 = 256 elements (0 also) .
        System.out.println(d);

        //but
        byte e = 126;
        byte f = 120;
        byte g = 126;

        System.out.println(e*f/g);  //NOTE:- e*f = 15120

    }
}
