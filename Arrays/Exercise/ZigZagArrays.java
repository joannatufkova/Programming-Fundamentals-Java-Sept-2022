package Arrays.Exercises;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine()); //брой редове с числа = размера на масива
        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];

        //четен ред (2,4,6,8,10, ... ) -> първото число отива във втория, второто в първия

        //нечетен ред (1,3,5,7,9,... ) -> първото число в първия масив, второто във втория

        for (int row = 1; row <= rows; row++){
          String[] numbers = scanner.nextLine().split(" ");
          String firstNum = numbers[0];
          String secondNum = numbers[1];

          if(row % 2 == 0){
              // firstNum -> secondArray,
              secondArray[row - 1] = firstNum;
              // secondNum -> firstArray
              firstArray[row - 1] = secondNum;
          } else {
              // firstNum -> firstArray,
              firstArray[row - 1] = firstNum;
              // secondNum -> secondArray
              secondArray[row - 1] = secondNum;
          }
        }
        //отпечатване на масив:
        //1. for по индекс
        //2. foreach по елементи
        //3. String.join() !!! само за масив от текстове !!!

        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));

    }
}
