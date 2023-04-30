package ForLoopsMoreExercise;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loadsCount = Integer.parseInt(scanner.nextLine());

        int busWeight = 0;
        int kamionWeight = 0;
        int trainWeight = 0;
        int totalWeight = 0;

        for (int i = 1; i <= loadsCount; i++) {
            int loadWeight = Integer.parseInt(scanner.nextLine());

            totalWeight += loadWeight;

            if (loadWeight <= 3) {
                busWeight += loadWeight;
            } else if (loadWeight < 12) {
                kamionWeight += loadWeight;
            } else {
                trainWeight += loadWeight;
            }

        }

        double totalPrice = ((busWeight * 200 + kamionWeight * 175 + trainWeight * 120) * 1.0) / totalWeight;
        double percentBus = (busWeight * 1.0 / totalWeight) * 100;
        double percentKamion = (kamionWeight * 1.0 / totalWeight) * 100;
        double percentTrain = (trainWeight * 1.0 / totalWeight) * 100;

        System.out.printf("%.2f%n",totalPrice);
        System.out.printf("%.2f%%%n",percentBus);
        System.out.printf("%.2f%%%n",percentKamion);
        System.out.printf("%.2f%%",percentTrain);

    }
}
