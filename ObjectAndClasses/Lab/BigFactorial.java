package ObjectAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigInteger prod = new BigInteger("1");
        for(int count = number; count >= 1; count--){
            prod = prod.multiply(BigInteger.valueOf(count));
        }
        System.out.println(prod);
    }
}
