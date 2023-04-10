package src.ExamJavaBasic;
import java.util.Scanner;

public class P05TheBestFootbalPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String winner = "";
        int goals = 0;
        while (!input.equals("END")) {
            String nameOfPlayer = input;
            int playerGoals = Integer.parseInt(scanner.nextLine());

            if (playerGoals > goals) {
                goals = playerGoals;
                winner = nameOfPlayer;
            }
            if (playerGoals >= 10) {
                break;
            }
            input = scanner.nextLine();
        }
        if (goals >= 3) {
            System.out.printf("%s is the best player!%nHe has scored %d goals and made a hat-trick !!!", winner, goals);
        } else {
            System.out.printf("%s is the best player!%nHe has scored %d goals.", winner, goals);
        }
    }
}