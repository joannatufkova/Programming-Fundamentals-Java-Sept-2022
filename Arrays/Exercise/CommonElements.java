package Arrays.Exercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни -> два входни масива
        //2. обхождаме всеки един елемент от втория масив
           //повтаряме: обхождам първия масив -> ел2 == ел1

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        //обхождане на масиви: for по index или foreach по елементи
        for (String elementSecondArray : secondArray) {
            //блок от код, който искаме да повторим за всеки един елемент
            for (String elementFirstArray : firstArray) {
                if(elementSecondArray.equals(elementFirstArray)){
                    System.out.print(elementSecondArray + " ");
                    break;
                }
            }
        }


    }
}
