package BasicSyntax.Exercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboyardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        //крайна сума -> сбор от всички -> (headsetPrice * брой ед цена)

        //търсим броя на нешата
        int countHeadset = lostGames / 2;
        int countMouses = lostGames / 3;
        int countKeyboard = lostGames / 6;
        int countDisplay = lostGames / 12;

        double finalSum = (countHeadset * headsetPrice) + (countMouses * mousePrice) + (countKeyboard * keyboyardPrice) + (countDisplay * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", finalSum);
    }
}
