package ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeDays = Integer.parseInt(scanner.nextLine());

        int workingTime = 365 - freeDays;
        int playTime = workingTime * 63 + freeDays * 127;
        int difNorm = Math.abs(30000 - playTime);
        int hours = difNorm / 60;
        int mins = difNorm % 60;

        if (freeDays <= 365) {
            if (playTime < 30000) {
                System.out.printf("Tom sleeps well%n");
                System.out.printf("%d hours and %d minutes less for play", hours, mins);
            } else {
                System.out.printf("Tom will run away%n");
                System.out.printf("%d hours and %d minutes more for play", hours, mins);
            }

        } else {
            System.out.println("error");
        }
    }
}