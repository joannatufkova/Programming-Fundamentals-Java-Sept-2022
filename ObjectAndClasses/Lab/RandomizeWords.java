package ObjectAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String[] words = word.split("\\s+");

        Random rndGenerator = new Random();
        for(int count = 1; count < words.length; count++){
            int indexX = rndGenerator.nextInt(words.length);
            int indexY = rndGenerator.nextInt(words.length);

            String oldWordX = words[indexX];
            words[indexX] = words[indexY];
            words[indexY] = oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(),words));
    }
}
