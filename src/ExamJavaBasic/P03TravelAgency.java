package src.ExamJavaBasic;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String location = scanner.nextLine();
        String extras = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (location) {
            case "Bansko":
            case "Borovets":
                switch (extras) {
                    case "noEquipment":
                        price = 80;
                        break;
                    case "withEquipment":
                        price = 100;
                        break;
                }
                if (extras.equals("noEquipment") && vip.equals("yes")) {
                    price = price * 0.95;
                } else if (extras.equals("withEquipment") && vip.equals("yes")) {
                    price = price * 0.9;
                }
                break;
            case "Varna":
            case "Burgas":
                switch (extras) {
                    case "noBreakfast":
                        price = 100;
                        break;
                    case "withBreakfast":
                        price = 130;
                        break;
                }
                if (extras.equals("noBreakfast") && vip.equals("yes")) {
                    price = price * 0.93;
                } else if (extras.equals("withBreakfast") && vip.equals("yes")) {
                    price = price * 0.88;
                }
                break;
        }
        double sum = 0;
        if (days > 7) {
            sum = price * (days - 1);
        } else {
            sum = days * price;
        }
        if (!(location.equals("Bansko") || location.equals("Borovets") || location.equals("Varna") || location.equals("Burgas"))) {
            System.out.println("Invalid input!");
        } else if (!(extras.equals("noEquipment") || extras.equals("withEquipment") || extras.equals("noBreakfast") || extras.equals("withBreakfast"))) {
            System.out.println("Invalid input!");
        } else if (days <= 0) {
            System.out.println("Days must be positive number!");
        } else if (!(vip.equals("no") || vip.equals("yes"))) {
            System.out.println("Invalid input!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", Math.abs(sum));
        }
    }
}

