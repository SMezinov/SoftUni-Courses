package ConditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int junior = Integer.parseInt(scanner.nextLine());
        int senior = Integer.parseInt(scanner.nextLine());
        String traceType = scanner.nextLine();

        double totalSum = 0;
        double taxJunior = 0;
        double taxSenior = 0;

        switch (traceType){
            case "trail":
                taxJunior = 5.50;
                taxSenior = 7;
                totalSum = (senior * taxSenior + junior * taxJunior) * 0.95;
                break;
            case "cross-country":
                taxJunior = 8;
                taxSenior = 9.50;
                if((junior + senior) >= 50){
                    taxJunior = 8 * 0.75;
                    taxSenior = 9.50 * 0.75;
                }
                totalSum = (senior * taxSenior + junior * taxJunior) * 0.95;
                break;
            case "downhill":
                taxJunior = 12.25;
                taxSenior = 13.75;
                totalSum = (senior * taxSenior + junior * taxJunior) * 0.95;
                break;
            case "road":
                taxJunior = 20;
                taxSenior = 21.50;
                totalSum = (senior * taxSenior + junior * taxJunior) * 0.95;
                break;
        }

        System.out.printf("%.2f",totalSum);
    }
}
