package src.ExamJavaBasic;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clubWantedMoney = Integer.parseInt(scanner.nextLine());
        String cocktail = scanner.nextLine();

        double money = 0;
        while (!cocktail.equals("Party!")) {
           int cocktailsQuantity = Integer.parseInt(scanner.nextLine());
            int cocktailPrice = cocktail.length();
            double cocktailSum = cocktailPrice * cocktailsQuantity;
            if (cocktailSum % 2 != 0){
               cocktailSum = cocktailSum * 0.75;
            }
            money += cocktailSum;
            if (money >= clubWantedMoney){
                break;
            }
            cocktail = scanner.nextLine();
        }

        if (money < clubWantedMoney){
            System.out.printf("We need %.2f leva more.%nClub income - %.2f leva.",clubWantedMoney - money,money);
        } else {
            System.out.printf("Target acquired.%nClub income - %.2f leva.",money);
        }

    }
}
