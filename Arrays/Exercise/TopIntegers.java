package Arrays.Exercises;

import java.util.Scanner;
import java.util.Arrays;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни: масив от цели числа
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        //изходни данни: масив от цели числа
        for(int index = 0; index <= numbers.length - 1; index++){
            int currentEl = numbers[index];
            //винаги елемента на последния индекс ни е топ
            if(index == numbers.length - 1){
                System.out.println(currentEl + " ");
                break;
            }
            //oбхождаме всички индекси след моя
            //следващото число -> index + 1
            boolean isTop = false;
            for(int i = index + 1; i <= numbers.length - 1; i++){
                int nextNumber = numbers[i];
                if(currentEl > nextNumber){
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if(isTop){
                System.out.print(currentEl + " ");
            }
        }
    }
}
