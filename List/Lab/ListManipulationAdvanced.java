package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while(!lineInput.equals("end")){
            String[] commandArray = lineInput.split(" ");

            switch (commandArray[0]){
                case "Contains":
                    int numContains = Integer.parseInt(commandArray[1]);
                    if(numsList.contains(numContains)){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if(commandArray[1].equals("even")){
                        for(int pos = 0; pos <= numsList.size() - 1; pos++){
                            if(numsList.get(pos) % 2 == 0){
                                System.out.print(numsList.get(pos) + " ");
                            }
                        }
                    } else if(commandArray[1].equals("odd")){
                        for(int pos = 0; pos <= numsList.size() - 1; pos++){
                            if(numsList.get(pos) % 2 != 0){
                                System.out.print(numsList.get(pos) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    if(commandArray[1].equals("sum")){
                        int sum = 0;
                        for (int item : numsList) {
                            sum += item;
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    int number = Integer.parseInt(commandArray[2]);

                    if(commandArray[1].equals("<")){
                        for (int item : numsList) {
                            if(item < number){
                                System.out.print(item + " ");
                            }
                        }
                    } else if(commandArray[1].equals(">")){
                        for (int item : numsList) {
                            if(item > number){
                                System.out.print(item + " ");
                            }
                        }
                    } else if(commandArray[1].equals("<=")){
                        for (int item : numsList) {
                            if(item <= number){
                                System.out.print(item + " ");
                            }
                        }
                    } else if(commandArray[1].equals(">=")){
                        for (int item : numsList) {
                            if(item >= number){
                                System.out.print(item + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
            }
            lineInput = scanner.nextLine();
        }

    }
}
