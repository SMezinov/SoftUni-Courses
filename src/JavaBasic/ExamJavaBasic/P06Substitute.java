package src.ExamJavaBasic;
import java.util.Scanner;

public class P06Substitute {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int k = Integer.parseInt(scanner.nextLine());
            int l = Integer.parseInt(scanner.nextLine());
            int m = Integer.parseInt(scanner.nextLine());
            int n = Integer.parseInt(scanner.nextLine());

            boolean stop = false;
            int count = 0;
            for (int i = k; i <= 8; i++) {
                if (stop) {
                    break;
                }
                for (int j = 9; j >= l; j--) {
                    if (stop) {
                        break;
                    }
                    for (int o = m; o <= 8; o++) {
                        if (stop) {
                            break;
                        }
                        for (int p = 9; p >= n; p--) {
                            if (count >= 6) {
                                stop = true;
                                break;
                            }
                            if (i % 2 == 0 && i == o && j % 2 != 0 && j == p) {
                                System.out.printf("Cannot change the same player.%n");
                                count++;
                            } else if (i % 2 == 0 && j % 2 != 0 && o % 2 == 0 && p % 2 != 0) {
                                System.out.printf("%d%d - %d%d%n", i, j, o, p);
                                count++;
                            }
                        }
                    }
                }
            }
        }
    }
