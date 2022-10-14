package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        for(int symbol = 1; symbol <=n ; symbol++){
            char value = scanner.nextLine().charAt(0);
            int code = (int) value;
            totalSum += code;
        }
        System.out.printf("The sum equals: %d",totalSum);
    }
}
