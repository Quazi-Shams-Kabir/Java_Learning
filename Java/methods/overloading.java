public class overloading {  //you can make different methods with same name but condition is they must have different parameters
    public static void main(String[] args) {
        String name="hello";
        int a = 100;
        greet(name);
        greet(a);
    }

    static void greet(String name) {
        System.out.println(name);
    }
    static void greet(int x) {
        System.out.println(x);
    }
}
