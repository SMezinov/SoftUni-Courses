package ConditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String sleeplocation = "";
        double price = 0;

        if (budget <= 1000){
            sleeplocation = "Camp";
            if(season.equals("Winter")){
                location = "Morocco";
                price = budget * 0.45;
            } else if (season.equals("Summer")){
                location = "Alaska";
                price = budget * 0.65;
            }
        } else if (budget <= 3000){
            sleeplocation = "Hut";
            if(season.equals("Winter")){
                location = "Morocco";
                price = budget * 0.60;
            } else if (season.equals("Summer")){
                location = "Alaska";
                price = budget * 0.80;
            }
        } else {
            sleeplocation = "Hotel";
            if(season.equals("Winter")){
                location = "Morocco";
                price = budget * 0.90;
            } else if (season.equals("Summer")){
                location = "Alaska";
                price = budget * 0.90;
            }
        }

        System.out.printf("%s - %s - %.2f",location,sleeplocation,price);

    }
}
