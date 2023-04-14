package ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int magnolien = Integer.parseInt(scanner.nextLine());
    int zombiuli = Integer.parseInt(scanner.nextLine());
    int roses = Integer.parseInt(scanner.nextLine());
    int cactus = Integer.parseInt(scanner.nextLine());
    double giftPrice = Double.parseDouble(scanner.nextLine());

    double sum = (magnolien * 3.25 + zombiuli * 4 + roses * 3.5 + cactus * 8) * 0.95;
    double endSum = Math.abs(sum - giftPrice);

    if(sum >= giftPrice){
        System.out.printf("She is left with %.0f leva.",Math.floor(endSum));
    } else {
        System.out.printf("She will have to borrow %.0f leva.",Math.ceil(endSum));
    }

    }
}
