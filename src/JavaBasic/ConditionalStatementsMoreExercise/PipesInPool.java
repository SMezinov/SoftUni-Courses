package ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pool = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double workerTime = Double.parseDouble(scanner.nextLine());

        double sumPipe1 = pipe1 * workerTime;
        double sumPipe2 = pipe2 * workerTime;
        double sumPipes = sumPipe1 + sumPipe2;
        double pipe1Percent = (sumPipe1 / sumPipes) * 100;
        double pipe2Percent = (sumPipe2 / sumPipes) * 100;

        double poolFill = 0;

        if (sumPipes <= pool) {
            poolFill = (sumPipes / pool) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",poolFill,pipe1Percent,pipe2Percent);
        } else {
            poolFill = sumPipes - pool;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",workerTime,poolFill);
        }


    }
}
