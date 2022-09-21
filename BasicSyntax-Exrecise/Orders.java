package BasicSyntax.Exercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        double priceCapsule = 0.0;
        int days = 0;
        double countCapsules = 0.0;
        double currentPrice = 0.0;
        double total = 0.0;

        for(int count = 1; count <= N; count++) {
             priceCapsule = Double.parseDouble(scanner.nextLine());
             days = Integer.parseInt(scanner.nextLine());
             countCapsules = Integer.parseInt(scanner.nextLine());
             currentPrice = (days * countCapsules) * priceCapsule;

            System.out.printf("The price for the coffee is: $%.2f%n", currentPrice);

             total+= currentPrice;
        }
        System.out.printf("Total: $%.2f",total);
    }
}
