package DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for(int i = 1; i <= number; i++){
            BigDecimal currNum = new BigDecimal(scanner.nextLine());

            sum = sum.add(currNum);
        }
        System.out.println(sum);
    }
}
