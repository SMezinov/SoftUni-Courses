package NestedLoopsMoreExsercise;

import java.util.Scanner;

public class P05ChallengetheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int man = Integer.parseInt(scanner.nextLine());
        int woman = Integer.parseInt(scanner.nextLine());
        int table = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean stop = false;
        for (int i = 1; i <= man; i++) {
            for (int j = 1; j <= woman; j++) {
                counter++;
                if (counter > table) {
                    stop = true;
                    break;
                }
                System.out.printf("(%d <-> %d) ", i, j);
            }
            if (stop) {
                break;
            }
        }
    }
}
