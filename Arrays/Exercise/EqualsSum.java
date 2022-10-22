package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни: масив от цели числа
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean isFound = false;
        //true -> имаме съществуващ елемент
        //false -> нямаме такъв елемент
        for(int index = 0; index <= numbers.length - 1; index++){
            int currEl = numbers[index];
            int leftSum = 0;
            int rightSum = 0;

            //лява сума ->  всички индекси от 0 до моя (без него)
            for(int leftIndx = 0; leftIndx < index; leftIndx++){
                leftSum += numbers[leftIndx];
            }
            //дясна сума -> всички индекси СЛЕД моя до последния вкл
            for(int rightIndx = index + 1; rightIndx <= numbers.length - 1; rightIndx++){
                rightSum += numbers[rightIndx];
            }

            if(leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("no");
        }
    }
}
