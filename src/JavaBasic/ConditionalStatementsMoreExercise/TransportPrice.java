package ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double taxi = 0;
        double bus = kilometers * 0.09;
        double train = kilometers * 0.06;

        switch (dayOrNight){
            case "day":
                taxi = 0.70 + kilometers * 0.79;
                if (kilometers < 20){
                    System.out.printf("%.2f",taxi);
                } else if (kilometers >= 20 && kilometers < 100) {
                    System.out.printf("%.2f",bus);
                } else{
                    System.out.printf("%.2f",train);
                }
                break;
            case "night":
                taxi = 0.70 + kilometers * 0.90;
                if (kilometers < 20){
                    System.out.printf("%.2f",taxi);
                } else if (kilometers >= 20 && kilometers < 100) {
                    System.out.printf("%.2f",bus);
                } else{
                    System.out.printf("%.2f",train);
                }
                break;
        }

    }
}
