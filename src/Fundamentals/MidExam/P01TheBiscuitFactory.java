package MidExam;

import java.util.Scanner;

public class P01TheBiscuitFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int workerCount = Integer.parseInt(scanner.nextLine());
        int competingFactoryProduction = Integer.parseInt(scanner.nextLine());

        int totalBiscuitsProduced = 0;

        for (int day = 1; day <= 30; day++) {
            int biscuitsProducedToday = biscuitsPerDay * workerCount;

            if (day % 3 == 0) {
                biscuitsProducedToday = (int) (biscuitsProducedToday * 0.75);
            }

            totalBiscuitsProduced += biscuitsProducedToday;
        }

        System.out.printf("You have produced %d biscuits for the past month.%n", totalBiscuitsProduced);

        double percentageDifference = ((double) totalBiscuitsProduced / competingFactoryProduction - 1) * 100;

        if (percentageDifference > 0) {
            System.out.printf("You produce %.2f percent more biscuits.%n", percentageDifference);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.%n", Math.abs(percentageDifference));
        }
    }
}
