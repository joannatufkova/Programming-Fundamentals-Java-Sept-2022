package Methods.Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int number = 1; number <= n; number++){
            if(findSumDigits(number) && findOddDigits(number)){
                System.out.println(number);
            }
        }
    }

    public static boolean findSumDigits(int n){
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum += digit;

            n /= 10;
        }
        if(sum % 8 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean findOddDigits(int n){
        int countOdds = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit % 2 != 0){
                countOdds++;
            }
            n /= 10;
        }
        return countOdds >= 1;
    }


}
