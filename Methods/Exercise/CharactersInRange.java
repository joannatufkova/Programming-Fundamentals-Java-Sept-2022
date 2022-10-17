package Methods.Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymb = scanner.nextLine().charAt(0);
        char secondSymb = scanner.nextLine().charAt(0);

        printCharactersInRange(firstSymb,secondSymb);
    }

    public static void printCharactersInRange(char firstSymb, char secondSymb){
        if(firstSymb < secondSymb){
            for(char symb = (char)(firstSymb + 1); symb < secondSymb; symb++){
                System.out.print(symb + " ");
            }
        } else {
            for(char symb = (char) (secondSymb+1); symb < firstSymb; symb++){
                System.out.print(symb + " ");
            }
        }
    }

}
