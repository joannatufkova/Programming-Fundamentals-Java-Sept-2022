package BasicSyntax.Exercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. username -> входни данни
        //2. password -> username-a наобратно
        //3.въвеждане на парола
        String username = scanner.nextLine(); // "Acer"
        String password = ""; // парола
        //всяка позиция в текста -> последната(д-на - 1) към първата(0)
        for(int position = username.length() - 1; position >= 0; position--){
            char currSymbol = username.charAt(position);
            password += currSymbol;
        }
        //знаем каква ни е паролата

        //променлива, в която ще държим паролата, която се въвежда
        String enteredPassword = scanner.nextLine();
        int countFailedTry = 0;
        //стоп: enteredPassword == password
        //прод. : enteredPassword != password
        while(!enteredPassword.equals(password)){
            //грешно въведена парола
            countFailedTry++;
            if(countFailedTry == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        //вярна парола -> enteredPassword == password
        if(enteredPassword.equals(password)){
            System.out.printf("User %s logged in.", username);
        }

    }
}
