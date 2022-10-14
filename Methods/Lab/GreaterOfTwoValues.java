package Methods.Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        switch (type){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum,secondNum));
                break;
            case "char":
                char firstSymb = scanner.nextLine().charAt(0);
                char secondSymb = scanner.nextLine().charAt(0);

                System.out.println(getMax(firstSymb,secondSymb));
                break;

            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(getMax(firstText,secondText));
                break;
        }
    }

    public static int getMax(int firstNum, int secondNum){
        if(firstNum > secondNum){
            return firstNum;
        } else {
            return secondNum;
        }
    }

    public static char getMax(char firstSymb, char secondSymb){
        if(firstSymb > secondSymb){
            return firstSymb;
        } else {
            return secondSymb;
        }
    }

    public static String getMax(String firstText, String secondText){
        if(firstText.compareTo(secondText) > 0){
            return firstText;
        } else {
            return secondText;
        }
    }
}
