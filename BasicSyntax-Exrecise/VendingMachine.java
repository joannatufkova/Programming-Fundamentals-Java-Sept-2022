package BasicSyntax.Exercises;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumInserted = 0.0;

        while(!input.equals("Start")){
             double coin = Double.parseDouble(input);
             if(coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1.00 && coin != 2.00){
                 System.out.printf("Cannot accept %.2f%n",coin);
             } else {
                 sumInserted += coin;
             }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while(!input.equals("End")){
           switch (input){
               case "Nuts":
                   if(sumInserted >= 2){
                       sumInserted -= 2;
                       System.out.printf("Purchased %s%n",input);
                   } else {
                       System.out.println("Sorry, not enough money");
                   }
               break;
               case "Water":
                   if(sumInserted >= 0.7){
                       sumInserted -= 0.7;
                       System.out.printf("Purchased %s%n",input);
                   } else {
                       System.out.println("Sorry, not enough money");
                   }
                   break;
               case "Crisps":
                   if(sumInserted >= 1.5){
                       sumInserted -= 1.5;
                       System.out.printf("Purchased %s%n",input);
                   } else {
                       System.out.println("Sorry, not enough money");
                   }
                   break;
               case "Soda":
                   if(sumInserted >= 0.8){
                       sumInserted -= 0.8;
                       System.out.printf("Purchased %s%n",input);
                   } else {
                       System.out.println("Sorry, not enough money");
                   }
                   break;
               case "Coke":
                   if(sumInserted >= 1.0){
                       sumInserted -= 1.0;
                       System.out.printf("Purchased %s%n",input);
                   } else {
                       System.out.println("Sorry, not enough money");
                   }
                   break;
               default:
                   System.out.println("Invalid product");
           }
            input = scanner.nextLine();
        }

        if(sumInserted >= 0){
            System.out.printf("Change: %.2f",sumInserted);
        }
    }
}
