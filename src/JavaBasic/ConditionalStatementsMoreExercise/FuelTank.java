package ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double literOfFuel = Double.parseDouble(scanner.nextLine());

        switch (fuel){
            case "Gasoline":
                if(literOfFuel >= 25) {
                    System.out.println("You have enough gasoline.");
                }else if(literOfFuel < 25){
                    System.out.println("Fill your tank with gasoline!");
                }
                break;
            case "Diesel":
                if(literOfFuel >= 25) {
                    System.out.println("You have enough diesel.");
                }else if(literOfFuel < 25){
                    System.out.println("Fill your tank with diesel!");
                }
                break;
            case "Gas":
                if(literOfFuel >= 25) {
                    System.out.println("You have enough gas.");
                }else if(literOfFuel < 25){
                    System.out.println("Fill your tank with gas!");
                }
                break;
            default:
                System.out.println("Invalid fuel!");
                break;

        }

    }
}
