package List.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем входните данни: списък от Double стойности, защото ще манипулираме данните по някакъв начин
        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for(int position = 0; position < numbersList.size() - 1; position++){
            double currNum = numbersList.get(position);
            double nextNum = numbersList.get(position+1);

            if(currNum == nextNum){
                //събирам и намалям елементите в списъка
                numbersList.set(position, currNum + nextNum);
                numbersList.remove(position + 1);

                position = -1; // започваме да проверяваме отначало
            }
        }
        System.out.println(joinItemsByDelimitter(numbersList," "));

        System.out.println();
    }

    public static String joinItemsByDelimitter(List<Double> list, String delimiter){
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item : list) { //3.00
            //3
            String numDF = df.format(item) + delimiter;
            result += numDF;
        }
        return result;
    }
}
