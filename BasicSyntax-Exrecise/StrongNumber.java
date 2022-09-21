package BasicSyntax.Exercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;

        int sum = 0;
        while(number > 0){
            int lastDigit = number % 10;
            //намирам факториела
            int fact = 1;
            for(int i = 1; i<=lastDigit; i++){
                fact *= i;
            }
            //сумирам факториела
            sum+=fact;
            number /= 10; //премахваме последната цифра
        }
        //проверка дали сумата от факт == въведеното число
        if(sum == startNumber){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
