package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMiddleChar(text);
    }

    private static void printMiddleChar(String text){
        //нечетна дължина
       if(text.length() % 2 != 0) {
           int index = text.length() / 2;
            System.out.println(text.charAt(index));
        }
        //четна дължина -> 2 средни символа
        else {

            int firstMiddleIndex = text.length() / 2 - 1;
           int secondMiddleIndex = text.length() / 2;

           System.out.println(text.charAt(firstMiddleIndex) + "" + text.charAt(secondMiddleIndex));
        }
        }
    }


