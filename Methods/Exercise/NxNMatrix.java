package Methods.Exercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for(int rows = 1; rows <= n; rows++){
            for(int cols = 1; cols <= n; cols++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
