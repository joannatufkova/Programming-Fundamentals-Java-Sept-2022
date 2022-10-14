package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine()); //магическа сума, която въвеждаме от конзолата

        // взимам число от масива -> обхождаме всички числа след него
        for(int index = 0; index <= numbers.length - 1; index++){
            int currentNum = numbers[index];
            //цел: да обходя всички числа след моето число
            for(int inIndex = index + 1; inIndex <= numbers.length - 1; inIndex++){
                int inNumber = numbers[inIndex];

                if(currentNum + inNumber == magicSum){
                    System.out.println(currentNum + " " + inNumber);
                }
            }
        }
    }
}
