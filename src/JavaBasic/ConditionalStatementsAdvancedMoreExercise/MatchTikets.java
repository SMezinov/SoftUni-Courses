package ConditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class MatchTikets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String ticketsType = scanner.nextLine();
        int personCount = Integer.parseInt(scanner.nextLine());

        double transportPrice = 0;
        double ticketsPrice = 0;
        double totalSum = 0;

        if (personCount >= 1 && personCount < 5) {
            transportPrice = budget * 0.75;
        } else if (personCount >= 5 && personCount < 10) {
            transportPrice = budget * 0.6;
        } else if (personCount >= 10 && personCount < 25) {
            transportPrice = budget * 0.5;
        } else if (personCount >= 25 && personCount < 50) {
            transportPrice = budget * 0.4;
        } else if (personCount >= 50) {
            transportPrice = budget * 0.25;
        }

        switch (ticketsType) {
            case "VIP":
                ticketsPrice = 499.99;
                totalSum = budget - transportPrice - ticketsPrice * personCount;
                break;
            case "Normal":
                ticketsPrice = 249.99;
                totalSum = budget - transportPrice - ticketsPrice * personCount;
                break;
        }

        if(budget >= (ticketsPrice * personCount + transportPrice)){
            System.out.printf("Yes! You have %.2f leva left.",(budget- transportPrice - ticketsPrice * personCount ));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(budget- transportPrice - ticketsPrice * personCount));
        }
    }
}