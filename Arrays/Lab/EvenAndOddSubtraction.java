package Arrays.Lab;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numArray = new int[input.length];

        for(int i = 0; i < numArray.length; i++){
            numArray[i] = Integer.parseInt(input[i]);
        }

        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i < numArray.length; i++){
            int currentEl = numArray[i];
            if (currentEl % 2 == 0){
                evenSum += currentEl;
            } else {
                oddSum += currentEl;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
