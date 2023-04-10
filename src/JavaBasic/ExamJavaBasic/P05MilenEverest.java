package src.ExamJavaBasic;
import java.util.Scanner;

public class P05MilenEverest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int dayCounts = 1;
        int meters = 5364;
        while (!input.equals("END")) {
            int metersForDay = Integer.parseInt(scanner.nextLine());
            meters += metersForDay;
            if (input.equals("Yes")) {
                dayCounts++;
            }
            if (dayCounts >= 5 || meters >= 8848) {
                break;
            }
            input = scanner.nextLine();
        }
        if (meters >= 8848) {
            System.out.printf("Goal reached for %d days!", dayCounts);
        } else {
            System.out.printf("Failed!%n%d", meters);
        }

    }
}
