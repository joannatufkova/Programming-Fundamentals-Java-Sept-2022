package Methods.Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(count,input));
    }

    public static String repeatString(int count, String text) {
        String result = " ";
        for(int i = 1; i<=count; i++){
            result += text;
        }
        return result;
    }
}
