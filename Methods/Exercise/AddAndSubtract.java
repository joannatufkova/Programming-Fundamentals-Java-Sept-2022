package Methods.Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(findResult(firstNum,secondNum,thirdNum));
    }

    private static int findResult(int first,int second, int third){
        return getSumOfFirstTwoNums(first,second) - third;
    }

    private static int getSumOfFirstTwoNums(int first, int second){
        return first + second;
    }
}
