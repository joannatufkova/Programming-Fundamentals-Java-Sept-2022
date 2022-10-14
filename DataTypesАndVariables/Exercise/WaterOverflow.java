package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxCapacity = 255;
        int currentLiters = 0;
        int readLines = Integer.parseInt(scanner.nextLine());

        for(int line = 1; line <= readLines; line++){
            int liters = Integer.parseInt(scanner.nextLine());

            currentLiters += liters;
            if(currentLiters > maxCapacity){
                System.out.println("Insufficient capacity!");
                currentLiters -= liters; // изваждаме от текущите литри, защото нямаме капацитета да ги налеем вътре
            }
        }
        System.out.println(currentLiters);

    }
}
