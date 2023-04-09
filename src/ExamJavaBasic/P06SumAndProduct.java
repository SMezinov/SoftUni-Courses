package src.ExamJavaBasic;

import java.util.Scanner;

public class P06SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean stop = false;
        boolean falseN = false;
        for (int a = 1; a <= 9; a++) {
            if (stop) {
                break;
            }
            for (int b = 9; b >= a; b--) {
                if (stop) {
                    break;
                }
                for (int c = 0; c <= 9; c++) {
                    if (stop) {
                        break;
                    }
                    for (int d = 9; d >= c; d--) {
                        if (n < 100 || n > 1000){
                            stop = true;
                            falseN = true;
                            break;
                        }
                        if ((a + b + c + d == a * b * c * d) && (n % 10 == 5)) {
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            stop = true;
                        } else if (((a * b * c * d) / (a + b + c + d) == 3) && n % 3 == 0) {
                            System.out.printf("%d%d%d%d", d, c, b, a);
                            stop = true;
                            break;
                        }
                    }
                }
            }
        }
       if(stop && falseN){
           System.out.println("error");
       }
       else if (!stop) {
            System.out.println("Nothing found");
        }
    }
}
