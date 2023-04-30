package ForLoopsMoreExercise;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gameCount = Integer.parseInt(scanner.nextLine());

        double result = 0;
        double zone1 = 0;
        double zone2 = 0;
        double zone3 = 0;
        double zone4 = 0;
        double zone5 = 0;
        double invalidNumber = 0;
        for (int i = 1; i <= gameCount; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers < 0 || numbers > 50) {
                result = result / 2;
                invalidNumber++;
            } else if (numbers < 10) {
                result += numbers * 0.2;
                zone1++;
            } else if (numbers < 20) {
                result += numbers * 0.3;
                zone2++;
            } else if (numbers < 30) {
                result += numbers * 0.4;
                zone3++;
            } else if (numbers < 40) {
                result += 50;
                zone4++;
            } else if (numbers <= 50) {
                result += 100;
                zone5++;
            }

        }

        double percentZone1 = (zone1 / gameCount) * 100;
        double percentZone2 = (zone2 / gameCount) * 100;
        double percentZone3 = (zone3 / gameCount) * 100;
        double percentZone4 = (zone4 / gameCount) * 100;
        double percentZone5 = (zone5 / gameCount) * 100;
        double percentInvalidZone = (invalidNumber / gameCount) * 100;

        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", percentZone1);
        System.out.printf("From 10 to 19: %.2f%%%n", percentZone2);
        System.out.printf("From 20 to 29: %.2f%%%n", percentZone3);
        System.out.printf("From 30 to 39: %.2f%%%n", percentZone4);
        System.out.printf("From 40 to 50: %.2f%%%n", percentZone5);
        System.out.printf("Invalid numbers: %.2f%%", percentInvalidZone);

    }
}
