package MidExam;

import java.util.Scanner;

public class P02TaxCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            String[] vehicles = input.split(">>");

            double totalTaxCollected = 0;

            for (int i = 0; i < vehicles.length ; i++) {
                String vehicleInfoString = vehicles[i];
                String[] vehicleInfo = vehicleInfoString.split(" ");

                String carType = vehicleInfo[0];
                int yearsInUse = Integer.parseInt(vehicleInfo[1]);
                int kilometersTraveled = Integer.parseInt(vehicleInfo[2]);

                double initialTax = 0;
                double tax = 0;

                switch (carType) {
                    case "family":
                        initialTax = 50;
                        tax = calculateFamilyCarTax(initialTax, yearsInUse, kilometersTraveled);
                        break;
                    case "heavyDuty":
                        initialTax = 80;
                        tax = calculateHeavyDutyCarTax(initialTax, yearsInUse, kilometersTraveled);
                        break;
                    case "sports":
                        initialTax = 100;
                        tax = calculateSportsCarTax(initialTax, yearsInUse, kilometersTraveled);
                        break;
                    default:
                        System.out.println("Invalid car type.");
                        continue;
                }

                totalTaxCollected += tax;
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, tax);
            }

            System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", totalTaxCollected);
        }

        private static double calculateFamilyCarTax(double initialTax, int yearsInUse, int kilometersTraveled) {
            double tax = initialTax - (5 * yearsInUse) + (12 * Math.floor(kilometersTraveled / 3000.0));
            return tax;
        }

        private static double calculateHeavyDutyCarTax(double initialTax, int yearsInUse, int kilometersTraveled) {
            double tax = initialTax - (8 * yearsInUse) + (14 * Math.floor(kilometersTraveled / 9000.0));
            return tax;
        }

        private static double calculateSportsCarTax(double initialTax, int yearsInUse, int kilometersTraveled) {
            double tax = initialTax - (9 * yearsInUse) + (18 * Math.floor(kilometersTraveled / 2000.0));
            return tax;
        }
    }
