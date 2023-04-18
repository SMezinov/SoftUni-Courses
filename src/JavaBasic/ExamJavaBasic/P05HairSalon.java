package ExamJavaBasic;

import java.util.Scanner;

public class P05HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayTarget = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double sum = 0;
        while (!input.equals("closed")) {
            String service = input;
            String typeOfService = scanner.nextLine();
            if (service.equals("haircut")) {
                switch (typeOfService) {
                    case "mens":
                        sum += 15;
                        break;
                    case "ladies":
                        sum += 20;
                        break;
                    case "kids":
                        sum += 10;
                        break;
                }
            } else if (service.equals("color")) {
                switch (typeOfService) {
                    case "touch up":
                        sum += 20;
                        break;
                    case "full color":
                        sum += 30;
                        break;
                }
            }
            if (sum >= dayTarget) {
                break;
            }
            input = scanner.nextLine();
        }
        if (sum >= dayTarget) {
            System.out.printf("You have reached your target for the day!%n");
        } else {
            System.out.printf("Target not reached! You need %.0flv. more.%n",Math.abs(sum - dayTarget));
        }
        System.out.printf("Earned money: %.0flv.",sum);
    }
}