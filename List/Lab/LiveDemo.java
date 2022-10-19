package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //връща ни масив от стрингове, превръща ги към цяло число и ги събира в една колекция, която връща списък
        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //"10 20 30 40 50"
        //директно добавя елементи при създаването на списъка
        List<String> listStr = new ArrayList<>(Arrays.asList("one, two, three, four"));

        System.out.println(String.join("", listStr));
    }
}
