package Methods.Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        if(operation.equals("subtract")){
            subtract(number1,number2);
        } else if(operation.equals("add")){
            add(number1,number2);
        } else if(operation.equals("multiply")){
            multiply(number1,number2);
        } else if(operation.equals("divide")){
            divide(number1,number2);
        } else {
            System.out.println("Please, enter a valid operation.");
        }

    }

    public static void subtract(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 - number2);
        } else {
            System.out.println(number2 - number1);
        }
    }

    public static void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    public static void multiply(int number1, int number2) {
        if(number1 == 0 || number2 == 0){
            System.out.println(0);
        } else {
            System.out.println(number1 * number2);
        }
    }

    public static void divide(int number1, int number2) {
        if(number1 == 0 || number2 == 0){
            System.out.println("Error");
            return;
        } else {
            System.out.println(number1 / number2);
        }
    }
}

