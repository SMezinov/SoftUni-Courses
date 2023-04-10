package ConditionalStatementsAdvancedMoreExercise;

import java.time.temporal.IsoFields;
import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometer = Double.parseDouble(scanner.nextLine());

        double priProKm = 0;

        if(kilometer <= 5000){
            switch (season){
                case "Spring":
                case "Autumn":
                    priProKm = 0.75;
                    break;
                case "Summer":
                    priProKm = 0.90;
                    break;
                case "Winter":
                    priProKm = 1.05;
                    break;
            }
        } else if(kilometer > 5000 && kilometer <= 10000){
            switch (season){
                case "Spring":
                case "Autumn":
                    priProKm = 0.95;
                    break;
                case "Summer":
                    priProKm = 1.10;
                    break;
                case "Winter":
                    priProKm = 1.25;
                    break;
            }
        } else if (kilometer > 10000 && kilometer <= 20000){
            priProKm = 1.45;
        }

        double totalSum = ((kilometer * priProKm) * 4) * 0.9;

        System.out.printf("%.2f",totalSum);

    }
}
