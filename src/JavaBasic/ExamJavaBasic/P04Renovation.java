package src.ExamJavaBasic;
import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int areaWithoutPaint = Integer.parseInt(scanner.nextLine());

        double wallsFirst = Math.ceil ((height * width) * 4);
        double walls = Math.ceil(wallsFirst - (wallsFirst * (areaWithoutPaint * 1.0 / 100)));

        int allLiters = 0;
        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            int liters = Integer.parseInt(input);
            allLiters += liters;
            if(allLiters >= walls){
                break;
            }
            input = scanner.nextLine();
        }
        if(walls < allLiters){
            System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(walls - allLiters));
        } else if (walls == allLiters){
            System.out.printf("All walls are painted! Great job, Pesho!");
        } else {
            System.out.printf("%.0f quadratic m left.",walls - allLiters);
        }
    }
}
