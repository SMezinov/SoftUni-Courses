package ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quadrature = Integer.parseInt(scanner.nextLine());
        double grapesForQuadrats = Double.parseDouble(scanner.nextLine());
        int needetWine = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());

        double totalGrapes = (quadrature * grapesForQuadrats) * 0.4;
        double totalWine = totalGrapes / 2.5;
        double wineDif = Math.abs(totalWine - needetWine);

        if (totalWine >= needetWine){
            wineDif = Math.ceil(wineDif);
            double wineForPerson = Math.ceil(wineDif / workersCount);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.ceil(totalWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",wineDif,wineForPerson);
        } else {
            wineDif = Math.floor(wineDif);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",wineDif);

        }

    }
}
