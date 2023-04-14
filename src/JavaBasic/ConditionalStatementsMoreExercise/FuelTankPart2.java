package ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double literFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double priceGasoline = literFuel * 2.22;
        double priceDiesel = literFuel * 2.33;
        double priceGas = literFuel * 0.93;
        double totalPrice = 0;

        switch (fuelType) {
            case "Gasoline":
                if (clubCard.equals("Yes")) {
                    totalPrice = priceGasoline - literFuel * 0.18;
                } else if (clubCard.equals("No")) {
                    totalPrice = priceGasoline;
                }
                break;
            case "Diesel":
                if (clubCard.equals("Yes")) {
                    totalPrice = priceDiesel - literFuel * 0.12;
                } else if (clubCard.equals("No")) {
                    totalPrice = priceDiesel;
                }
                break;
            case "Gas":
                if (clubCard.equals("Yes")) {
                    totalPrice = priceGas - literFuel * 0.08;
                } else if (clubCard.equals("No")) {
                    totalPrice = priceGas;
                }
                break;
        }
        if (literFuel >= 20 && literFuel <= 25){
            totalPrice = totalPrice * 0.92;
        } else if (literFuel > 25){
            totalPrice = totalPrice * 0.9;
        }
        System.out.printf("%.2f lv.",totalPrice);

    }
}
