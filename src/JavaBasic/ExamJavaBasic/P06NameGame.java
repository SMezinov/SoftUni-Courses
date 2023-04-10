package src.ExamJavaBasic;
import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int totalPoints = 0;
        String winner = "";
        while (!input.equals("Stop")) {

            int currentPoints = 0;
            String nameOfPlayer = input;
            for (int i = 0; i < nameOfPlayer.length(); i++) {
                int num = Integer.parseInt(scanner.nextLine());
                if (num == nameOfPlayer.charAt(i)) {
                    currentPoints += 10;
                } else {
                    currentPoints += 2;
                }
                if (currentPoints >= totalPoints) {
                    totalPoints = currentPoints;
                    winner = nameOfPlayer;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winner, totalPoints);
    }
}


