package BasicSyntax.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем броя на групата
        int group = Integer.parseInt(scanner.nextLine());
        //2. четем вида на групата
        String type = scanner.nextLine();
        //3. чете деня
        String day = scanner.nextLine();

        double price = 0.0;
        if(day.equals("Friday")){
            if(type.equals("Students")){
                price = 8.45*group;
                if(group>= 30){
                    price -= 0.15 * price;
                }
            } else if(type.equals("Business")){
                price = 10.90*group;
                if(group >= 100){
                    price -= 10*10.90;
                }
            } else if(type.equals("Regular")){
                price = 15*group;
                if(group >= 10 && group <= 20){
                    price -= 0.05 * price;
                }
            }
        } else if(day.equals("Saturday")){
            if(type.equals("Students")){
                price = 9.80*group;
                if(group>= 30){
                    price -= 0.15 * price;
                }
            } else if(type.equals("Business")){
                price = 15.60*group;
                if(group >= 100){
                    price -= 10*15.60;
                }
            } else if(type.equals("Regular")){
                price = 20*group;
                if(group >= 10 && group <= 20){
                    price -= 0.05 * price;
                }
            }
        } else if(day.equals("Sunday")){
            if(type.equals("Students")){
                price = 10.46*group;
                if(group>= 30){
                    price -= 0.15 * price;
                }
            } else if(type.equals("Business")){
                price = 16*group;
                if(group >= 100){
                    price -= 10*16;
                }
            } else if(type.equals("Regular")){
                price = 22.50*group;
                if(group >= 10 && group <= 20){
                    price -= 0.05 * price;
                }
            }
        }

            System.out.printf("Total price: %.2f", price);
    }
}
