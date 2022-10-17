package Methods.Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if(!isValidLength(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!isValidContent(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!isValidCountDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }

        if(isValidLength(password) && isValidContent(password) && isValidCountDigits(password)){
            System.out.println("Password is valid");
        }

    }
    private static boolean isValidLength(String password){
        if(password.length() >= 6 && password.length() <= 10){
            return true;
        }
        return false;
    }

    private static boolean isValidContent(String password){
        for (char symb : password.toCharArray()) {
            if(!Character.isLetterOrDigit(symb)){
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCountDigits(String password){
        int count = 0;
        for (char symb : password.toCharArray()) {
            if(Character.isDigit(symb)){
                count++;
            }
        }
        return count >= 2;
    }
}
