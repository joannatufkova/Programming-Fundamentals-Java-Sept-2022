package BasicSyntax.Exercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //обща сума = сума за мечове + сума за роби + сума за колани
        //1. сума за мечове = бр. мечове(ученици + 10%) * ед.цена за меч
        //2. сума за роби = бр. роби(бр. ученици) * ед. цена
        //3. сума за колани = бр. колани(ученици - бр. безпл. колани) * ед. цена

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double sumLightsaber = Math.ceil(studentsCount + 0.10 * studentsCount) * priceLightsaber;
        double sumRobes = studentsCount * priceRobe;
        double sumBelts = (studentsCount - (studentsCount / 6)) * priceBelt;

        double totalSum = sumLightsaber + sumRobes + sumBelts; //крайна сума за плащане

        if(totalSum <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);
        } else {
            double needMoney = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.",needMoney);
        }
    }
}
