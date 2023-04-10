package src.ExamJavaBasic;
import java.util.Scanner;

public class P05PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());

        int heart = 0;
        int fornite = 0;
        int over = 0;
        int others = 0;
        for (int i = 1; i <= games; i++) {
            String nameOfGame = scanner.nextLine();
            switch (nameOfGame) {
                case "Hearthstone":
                    heart++;
                    break;
                case "Fornite":
                    fornite++;
                    break;
                case "Overwatch":
                    over++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        double percentHeart = (heart * 1.0 / games) * 100;
        double percentFort = (fornite * 1.0 / games) * 100;
        double percentOver = (over * 1.0 / games) * 100;
        double percentOthers = (others * 1.0 / games) * 100;
        System.out.printf("Hearthstone - %.2f%%%nFornite - %.2f%%%nOverwatch - %.2f%%%nOthers - %.2f%%%n", percentHeart, percentFort, percentOver, percentOthers);
    }
}
