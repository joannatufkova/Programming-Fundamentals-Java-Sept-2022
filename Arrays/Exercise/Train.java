package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] passengers = new int[countWagons]; //хората, които ще се качват

        for(int wagon = 0; wagon < countWagons; wagon++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            passengers[wagon] = countPeople;
        }
            int sum = 0;
            for (int number : passengers){
                System.out.print(number + " ");
                sum += number;
            }

        System.out.println();
        System.out.println(sum);
    }
}
