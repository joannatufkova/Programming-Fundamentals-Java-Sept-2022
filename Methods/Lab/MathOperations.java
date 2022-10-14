package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNum = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(mathOperations(firstNum,operator,secondNum)));

    }
    public static double mathOperations(double firstNum, String operator, double secondNum){
        double result = 0;
        switch (operator){
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            default:
                System.out.println("Please, enter a valid operation.");
                break;
        }
        return result;
    }
}
