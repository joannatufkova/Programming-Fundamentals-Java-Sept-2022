package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        //2. ((първо + второ) / трето ) * четвърто
        //3. печатаме резултата

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());

        int result = ((firstNumber + secondNumber) / thirdNumber) * fourthNumber;
        System.out.println(result);
    }
}
