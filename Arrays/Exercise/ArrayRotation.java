package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни -> масив от числа
        //                -> брой ротации
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))//"51 47 32 61 21".split(" ") -> ["51", "47", "32", "61", "21"]
                .mapToInt(Integer::parseInt)                      //[51, 47, 32, 61, 21]
                .toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        for(int rotaion = 1; rotaion <= rotations; rotaion++){
            int firstElement = numbers[0];//взимаме първия елемент
            //преместваме всички елементи наляво
            //обхождаме всички елементи без последния, защото знаем какво имаме на последна позиция
            for(int index = 0; index < numbers.length - 1; index++){
                numbers[index] = numbers[index + 1];
            }
            numbers[numbers.length-1] = firstElement;//слагаме на последна позиция, първия елемент
        }
        for(int number : numbers){
            System.out.print(number + " ");
        }
    }
}
