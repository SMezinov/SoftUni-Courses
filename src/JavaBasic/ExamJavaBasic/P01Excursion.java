package ExamJavaBasic;

import java.util.Scanner;

public class P01Excursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transportCarts = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

        double nightsPrice = nights * 20;
        double transportPrice = transportCarts * 1.60;
        double museumPrice = tickets * 6;
        double sum = nightsPrice + transportPrice + museumPrice;
        double totalSum = people * sum;
        double absoluteSum = totalSum + (totalSum * 0.25);

        System.out.printf("%.2f", absoluteSum);

    }
}
