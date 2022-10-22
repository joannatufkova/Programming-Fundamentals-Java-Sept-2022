package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxLen = 0;
        int len = 1;

        int startIndex = 0;
        int bestStartIndex = 0;

        for(int pos = 1; pos <= numbers.length - 1; pos++){
            if(numbers[pos] == numbers[pos - 1]){
                len++;
            } else {
                len = 1;
                startIndex = pos;
            }

            if(len > maxLen){
                maxLen = len;
                bestStartIndex = startIndex;
            }
        }
        for(int i = bestStartIndex; i < bestStartIndex + maxLen; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
