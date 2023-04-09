package src.ExamJavaBasic;
import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int playedGames = Integer.parseInt(scanner.nextLine());

        int wins = 0;
        int equals = 0;
        int looses = 0;
        for (int i = 1; i <= playedGames; i++) {
            String input = scanner.nextLine();
            switch (input) {
                case "W":
                    wins++;
                    break;
                case "D":
                    equals++;
                    break;
                case "L":
                    looses++;
                    break;
            }
        }
        double percentWins = (wins * 1.0 / playedGames) * 100;
        int totalPoints = (wins * 3) + equals;
        if (playedGames < 1){
            System.out.printf("%s hasn't played any games during this season.",teamName);
        } else {
            System.out.printf("%s has won %d points during this season.%nTotal stats:%n## W: %d%n## D: %d%n## L: %d%nWin rate: %.2f%%",teamName,totalPoints,wins,equals,looses,percentWins);
        }
    }
}
