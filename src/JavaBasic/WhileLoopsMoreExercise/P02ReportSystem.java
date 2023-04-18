package WhileLoopsMoreExercise;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededSum = Integer.parseInt(scanner.nextLine());
        String item = scanner.nextLine();


        int itemCount = 0;
        int averageCS = 0;
        int averageCC = 0;
        int clientCashCount = 0;
        int clientCCCount = 0;
        while (!item.equals("End")) {
            int itemPrice = Integer.parseInt(item);
            itemCount++;
            if (itemCount % 2 == 0) {
                if (itemPrice >= 10) {
                    neededSum -= itemPrice;
                    averageCC += itemPrice;
                    clientCCCount++;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (itemPrice <= 100) {
                    neededSum -= itemPrice;
                    averageCS += itemPrice;
                    clientCashCount++;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            }
            if (neededSum <= 0) {
                break;
            }

            item = scanner.nextLine();
        }

        double averageCash = (averageCS * 1.0) / clientCashCount;
        double averageKart = (averageCC * 1.0) / clientCCCount;

        if (neededSum <= 0) {
            System.out.printf("Average CS: %.2f%nAverage CC: %.2f", averageCash, averageKart);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
