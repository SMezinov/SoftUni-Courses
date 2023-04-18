package WhileLoopsMoreExercise;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfBottles = Integer.parseInt(scanner.nextLine());
        String dishes = scanner.nextLine();

        int detergentMl = amountOfBottles * 750;
        int washingCount = 0;
        int potsCount = 0;
        int platesCount = 0;

        while (!dishes.equals("End")) {
            int amountOfDishes = Integer.parseInt(dishes);
            washingCount++;
            if (washingCount == 3) {
                washingCount = 0;
                detergentMl -= (amountOfDishes * 15);
                potsCount += amountOfDishes;
            } else {
                detergentMl -= (amountOfDishes * 5);
                platesCount += amountOfDishes;
            }
            if (detergentMl < 0) {
                break;
            }

            dishes = scanner.nextLine();
        }

        if (detergentMl >= 0){
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.",platesCount,potsCount,detergentMl);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!",Math.abs(detergentMl));
        }

    }
}
