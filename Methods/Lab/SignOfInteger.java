package Methods.Lab;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        signOfNum(num);

    }

    public static void signOfNum(int number) {
        if(number > 0 ){
            System.out.printf("The number %d is positive.", number);
        } else if(number < 0){
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
