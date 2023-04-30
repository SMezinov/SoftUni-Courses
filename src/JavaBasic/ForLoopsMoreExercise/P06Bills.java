package ForLoopsMoreExercise;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double water = 0;
        double internet = 0;
        double electricity = 0;
        for (int i = 1; i <= months ; i++) {
            electricity += Double.parseDouble(scanner.nextLine());
            water += 20;
            internet += 15;
        }

        double othersBills = water + internet + electricity + ((water + internet + electricity) * 0.2);
        double average = (water + internet + othersBills + electricity) / months;

        System.out.printf("Electricity: %.2f lv%n",electricity);
        System.out.printf("Water: %.2f lv%n",water);
        System.out.printf("Internet: %.2f lv%n",internet);
        System.out.printf("Other: %.2f lv%n",othersBills);
        System.out.printf("Average: %.2f lv",average);

    }
}
