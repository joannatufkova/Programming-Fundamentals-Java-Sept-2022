package List.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String product = scanner.nextLine();

            productList.add(product);
        }
        Collections.sort(productList);

        for(int pos = 0; pos < productList.size(); pos++){
            System.out.println(pos + 1 + "." + productList.get(pos));
        }
    }
}
