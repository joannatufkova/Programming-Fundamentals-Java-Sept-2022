package Arrays.Lab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int[] numArr = new int[inputArray.length];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = Integer.parseInt(inputArray[i]);
        }
        int evenSum = 0;
        for(int i = 0; i< numArr.length; i++){
            int currEl = numArr[i];
            if(currEl % 2 == 0){
                evenSum += currEl;
            }
        }
        System.out.println(evenSum);

    }
}
