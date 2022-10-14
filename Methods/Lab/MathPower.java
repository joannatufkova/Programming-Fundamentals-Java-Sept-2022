package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(power(number,power)));

    }

    public static double power(double num, double pow) {
        double result = 1;
        for(int i = 1; i<= pow; i++){
            result *= num;
        }
        return result;
    }
}
