package MidExam;

import java.util.Scanner;
import java.text.DecimalFormat;

public class P01BurgerBus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCities = scanner.nextInt();
        double totalProfit = 0;

        DecimalFormat df = new DecimalFormat("#.00");

        if (numCities < 1 || numCities > 15) {
            return;
        } else {
            for (int i = 1; i <= numCities; i++) {
                String cityName = scanner.next();
                double income = scanner.nextDouble();
                double expenses = scanner.nextDouble();
                double profit = income - expenses;

                if (i % 3 == 0 && i % 5 != 0) {
                    profit -= expenses * 0.5;
                }
                if (i % 5 == 0) {
                    profit -= income * 0.1;
                }
                totalProfit += profit;

                System.out.println("In " + cityName + ", Burger Bus earned " + df.format(profit) + " leva.");
            }

            System.out.println("Burger Bus total profit: " + df.format(totalProfit) + " leva.");
        }
    }
}

