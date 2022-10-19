package List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while(!lineInput.equals("end")){
            String[] commandArr = lineInput.split(" "); // правим масив за командите, които ще използваме
            String command = commandArr[0]; //определяме позицията на командата

            switch(command){
                case "Add":
                    int addNum = Integer.parseInt(commandArr[1]);
                    numsList.add(addNum);
                    break;
                case "Remove":
                    int removeNum = Integer.parseInt(commandArr[1]);
                    numsList.remove(Integer.valueOf(removeNum)); //трием по референтен тип данни, целия елемент
                    break;
                case "RemoveAt":
                    int removeNumOfIndex = Integer.parseInt(commandArr[1]);
                    numsList.remove(removeNumOfIndex);
                    break;
                case "Insert":
                    int insertNum = Integer.parseInt(commandArr[1]);
                    int indexOfInsert = Integer.parseInt(commandArr[2]);
                    numsList.add(indexOfInsert,insertNum);
                    break;
            }

            lineInput = scanner.nextLine();
        }
        System.out.println(numsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
