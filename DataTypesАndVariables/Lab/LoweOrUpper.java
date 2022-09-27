package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class LoweOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        //1-ви вариант
        if(Character.isUpperCase(symbol)){
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }

//        2-ри вариант
//        if(symbol >= 'A' && symbol <= 'Z'){
//            System.out.println("upper-case");
//        } else {
//            System.out.println("lower-case");
//        }
    }
}
