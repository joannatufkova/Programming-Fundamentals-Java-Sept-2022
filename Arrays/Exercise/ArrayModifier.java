package Arrays.Exercises;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //повтарящо действие: въвеждане на команди
        //стоп: команда == енд
        //продължаваме: входни данни != енд
        String command =scanner.nextLine();
        while(!command.equals("end")){
            //валидна команда за изпълнение
            if(command.contains("swap")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                //взимаме елементите от първия и втория индекс
                int element1 = numbers[index1];
                int element2 = numbers[index2];
                //размяна:
                numbers[index1] = element2;
                numbers[index2] = element1;
            } else if(command.contains("multiply")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                //взимаме елементите от първия и втория индекс
                int element1 = numbers[index1];
                int element2 = numbers[index2];

                int product = element1 * element2;
                numbers[index1] = product;

            } else if(command.equals("decrease")){
                for(int index = 0; index <= numbers.length - 1; index++){
                    numbers[index]--;//намаляме елемента на текущия индекс с 1
                }
            }

            command = scanner.nextLine();
        }
        for(int index = 0; index <= numbers.length - 1; index++){
            int currNum = numbers[index]; //числото на тек позиция
            if(index != numbers.length-1){
                //не сме на последното число
            System.out.print(currNum + ", ");
            } else {
                //последното число
                System.out.print(currNum);
            }
        }
    }
}
