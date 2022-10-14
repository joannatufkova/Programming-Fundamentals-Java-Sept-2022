package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни: брой кегове
        // за всеки кег повтаряме:
        // 1.прочитаме данните
        // 2.обем = π * r^2 * h
        // 3.проверка дали е най-големия кег: кега с най-големия обем

        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = " ";
        int countKegs = Integer.parseInt(scanner.nextLine());
        for(int keg = 1; keg <= countKegs; keg++){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius,2) * height;
            if(volume > maxVolume){
                maxVolume = volume;
                maxModelKeg = model;
            }
        }

        System.out.println(maxModelKeg);
    }
}
