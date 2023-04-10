package ConditionalStatementsAdvancedMoreExercise;

import java.util.Scanner;

public class FlowersAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrizanetemi = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int laleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String day = scanner.nextLine();

        boolean dayOff = day.equals("Y");

        double priceHr = 0;
        double priceRoses = 0;
        double priceLale = 0;
        double totalPrice = 0;

        switch (season){
            case "Spring":
            case "Summer":
                priceHr = hrizanetemi * 2.00;
                priceRoses = roses * 4.10;
                priceLale = laleta * 2.50;
                totalPrice = priceHr + priceRoses + priceLale;
                if(dayOff){
                    totalPrice = totalPrice * 1.15;
                }
                if(laleta > 7){
                    totalPrice = totalPrice * 0.95;
                }
                if((laleta + roses + hrizanetemi) > 20){
                    totalPrice = totalPrice * 0.8;
                }
                break;
            case "Autumn":
            case "Winter":
                priceHr = hrizanetemi * 3.75;
                priceRoses = roses * 4.50;
                priceLale = laleta * 4.15;
                totalPrice = priceHr + priceRoses + priceLale;
                if(dayOff){
                    totalPrice = totalPrice * 1.15;
                }
                if(roses >= 10 && season.equals("Winter")){
                    totalPrice = totalPrice * 0.9;
                }
                if((laleta + roses + hrizanetemi) > 20){
                    totalPrice = totalPrice * 0.8;
                }
                break;
        }
        System.out.printf("%.2f",(totalPrice + 2));
    }
}
