package BasicSyntax.Exercises;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни -> число за начало и число за край
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        //2. отпечатваме всички числа и ги добавяме към сумата
        int sum = 0;
        for(int i = num1; i<= num2; i++){
            System.out.print(i + " ");
            sum+=i;
        }

        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
