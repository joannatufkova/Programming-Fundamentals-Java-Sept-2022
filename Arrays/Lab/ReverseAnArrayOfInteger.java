package Arrays.Lab;

import java.util.Scanner;

public class ReverseAnArrayOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arrayNumbers = new int[n];
        for(int i = 0; i < n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());

            arrayNumbers[i] = currentNum;
        }

        for(int i = arrayNumbers.length - 1; i >= 0; i--){
            System.out.printf("%d ", arrayNumbers[i]);
        }
    }
}
