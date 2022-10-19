package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList =
                Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeList = numbersList.size();
        for(int pos = 0; pos < sizeList / 2; pos++){
            int firstNum = numbersList.get(pos);
            int lastNum =  numbersList.get(numbersList.size() - 1);

            numbersList.set(pos,firstNum + lastNum);
            numbersList.remove(numbersList.size()-1);
        }

        for (int item :numbersList) {
            System.out.print(item + " ");
        }
    }
}
