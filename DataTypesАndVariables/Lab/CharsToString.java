package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymb = scanner.nextLine().charAt(0);
        char secondSymb = scanner.nextLine().charAt(0);
        char thirdSymb = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c",firstSymb, secondSymb, thirdSymb);
    }
}
