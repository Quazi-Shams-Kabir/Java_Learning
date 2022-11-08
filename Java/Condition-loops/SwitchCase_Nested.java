import java.util.Scanner;

public class SwitchCase_Nested {
    public static void main(String[] args) {
        System.out.println("Enter your choice: 1. Details of Person 1, 2. Details of Person");
        Scanner in =new Scanner (System.in);

        String name1;
        String name2;
        int phone1;
        int phone2;

//        switch (in.nextInt()){
//            case 1 : {
//                in.nextLine(); //to eat up extra space
//                System.out.print("Mention what details of person 1 you want to fill: ");
//                String details = in.nextLine();
//                switch (details){      //example of nested switch
//                    case "name": {
//                        System.out.println("Write name of person 1:- ");
//                        name1 = in.nextLine();
//                        System.out.println("Name of person 1 : "+ name1);
//                    }
//                    break;
//                    case "phone":{
//                        System.out.println("Write phone no. of person 1:- ");
//                        phone1 = in.nextInt();
//                        in.nextLine();
//                        System.out.println("Phone no. of person 1 : "+ phone1);
//                    }
//
//                }
//
//        }
//        break; //or it'll go for case 2
//        case 2 : {
//                in.nextLine();
//                System.out.print("Mention what details of person 2 you want to fill: ");
//                String details = in.nextLine();
//                switch (details){      //example of nested switch
//                    case "name": {
//                        System.out.println("Write name of person 2:- ");
//                        name2 = in.nextLine();
//                        System.out.println("Name of person 2 : "+ name2);
//                    }
//                    break;
//                    case "phone":{
//                        System.out.println("Write phone no. of person 2:- ");
//                        phone2 = in.nextInt();
//                        in.nextLine();
//                        System.out.println("Phone no. of person 2 : "+ phone2);
//                    }
//
//                }
//        }
//
//
//        }

        //enhanced switch case, usually looks more clean, auto break, if you don't want breaks go for normal one
        switch (in.nextInt()) {
            case 1 -> {
                in.nextLine(); //to eat up extra space
                System.out.print("Mention what details of person 1 you want to fill: ");
                String details = in.nextLine();
                switch (details) {      //example of nested switch
                    case "name" -> {
                        System.out.println("Write name of person 1:- ");
                        name1 = in.nextLine();
                        System.out.println("Name of person 1 : " + name1);
                    }
                    case "phone" -> {
                        System.out.println("Write phone no. of person 1:- ");
                        phone1 = in.nextInt();
                        in.nextLine();
                        System.out.println("Phone no. of person 1 : " + phone1);
                    }
                }

            }
            case 2 -> {
                in.nextLine();
                System.out.print("Mention what details of person 2 you want to fill: ");
                String details = in.nextLine();
                switch (details) {      //example of nested switch
                    case "name" -> {
                        System.out.println("Write name of person 2:- ");
                        name2 = in.nextLine();
                        System.out.println("Name of person 2 : " + name2);
                    }
                    case "phone" -> {
                        System.out.println("Write phone no. of person 2:- ");
                        phone2 = in.nextInt();
                        in.nextLine();
                        System.out.println("Phone no. of person 2 : " + phone2);
                    }
                }
            }
        }


    }
}
