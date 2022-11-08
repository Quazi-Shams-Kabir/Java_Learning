public class loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {   //you can use any loop whenever you want, but it'll be better if you us e for loop when you know exact how many times the loop will run
            System.out.println("hello1");
        }
        int i=0;
        while(i<5){    //same here but you can use while loop when you don't know how many times the loop will run
            System.out.println("hello2");
            i++;
        }
        do {
            System.out.println(i);
            i++;
        }while (i==4);   //notice here i = 5 but this lopp will still run coz do while will run at least once no matter what


    }
}
