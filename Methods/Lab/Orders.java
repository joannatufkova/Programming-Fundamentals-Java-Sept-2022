package Methods.Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
                calculateCoffee(product,count);
                break;
            case "water":
                calculateWater(product,count);
                break;
            case "coke":
                calculateCoke(product,count);
                break;
            case "snacks":
                calculateSnacks(product,count);
                break;
            default:
                System.out.println("Invalid product");
                break;
        }
    }

    public static void calculateCoffee(String product, int count) {
        double calculatePrice = count * 1.50;
        System.out.printf("%.2f", calculatePrice);
    }

    public static void calculateWater(String product, int count) {
        double calculatePrice = count * 1.00;
        System.out.printf("%.2f", calculatePrice);
    }

    public static void calculateCoke(String product, int count) {
        double calculatePrice = count * 1.40;
        System.out.printf("%.2f", calculatePrice);
    }

    public static void calculateSnacks(String product, int count) {
        double calculatePrice = count * 2.00;
        System.out.printf("%.2f", calculatePrice);
    }
}
