package Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();

        while (!num.equals("END")) {
            if (isPalindrome(num)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            num = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(String num) {
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}