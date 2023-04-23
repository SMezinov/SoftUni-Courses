package NestedLoopsMoreExsercise;

import java.util.Scanner;

public class P04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fisrt = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = fisrt; i <= second; i++) {
            for (int j = fisrt; j <= second; j++) {
                for (int k = fisrt; k <= second; k++) {
                    for (int l = fisrt; l <= second; l++) {
                        int sum = (j + k) % 2;
                        if (i > l && sum == 0 && i % 2 == 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        } else if (i > l && sum == 0 && l % 2 == 0 && i % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
