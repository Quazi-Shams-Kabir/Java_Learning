public class revstring {
    public static void main(String[] args) {
        String name="shams";
        String new_name="";
        for (int i = 0; i < name.length(); i++) {
            char ch =name.charAt(i);
            new_name = ch+new_name;
        }
        System.out.println(new_name);
    }
}
