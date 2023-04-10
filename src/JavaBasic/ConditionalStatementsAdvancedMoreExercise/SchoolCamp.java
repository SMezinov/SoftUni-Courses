package ConditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String gender = scanner.nextLine();
        int schulerCount = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        switch (season) {
            case "Spring":
                if (gender.equals("boys") || gender.equals("girls")) {
                    price = 7.20;
                    sport = "Athletics";
                    if (gender.equals("boys")) {
                        sport = "Tennis";
                    }
                } else if (gender.equals("mixed")) {
                    price = 9.50;
                    sport = "Cycling";
                }
                break;
            case "Summer":
                if (gender.equals("boys") || gender.equals("girls")) {
                    price = 15;
                    sport = "Volleyball";
                    if (gender.equals("boys")) {
                        sport = "Football";
                    }
                } else if (gender.equals("mixed")) {
                    price = 20;
                    sport = "Swimming";
                }
                break;
            case "Winter":
                if (gender.equals("boys") || gender.equals("girls")) {
                    price = 9.60;
                    sport = "Gymnastics";
                    if (gender.equals("boys")) {
                        sport = "Judo";
                    }
                } else if (gender.equals("mixed")) {
                    price = 10;
                    sport = "Ski";
                }
                break;
        }
        double totalSum = (nights * price) * schulerCount;
        if (schulerCount >= 10 && schulerCount < 20) {
            totalSum = totalSum * 0.95;
        } else if (schulerCount >= 20 && schulerCount < 50) {
            totalSum = totalSum * 0.85;
        } else if (schulerCount >= 50){
            totalSum = totalSum * 0.5;
        }
        System.out.printf("%s %.2f lv.", sport, totalSum);

    }
}
