package ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());

        double turtleFoodKg = turtleFood / 1000;

        double neededFood = turtleFoodKg * days + catFood * days + dogFood * days;
        double foodDif = Math.abs(food - neededFood);

        if (neededFood <= food){
            System.out.printf("%.0f kilos of food left.",Math.floor(foodDif));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(foodDif));
        }

    }
}
