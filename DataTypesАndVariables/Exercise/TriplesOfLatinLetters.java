package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for(char symb1 = 'a'; symb1 < 'a' + n; symb1++){
        for(char symb2 = 'a'; symb2 < 'a' + n; symb2++){
        for(char symb3 = 'a'; symb3 < 'a' + n; symb3++){
            System.out.printf("%c%c%c%n",symb1, symb2, symb3);
        }
        }
        }
    }
}
