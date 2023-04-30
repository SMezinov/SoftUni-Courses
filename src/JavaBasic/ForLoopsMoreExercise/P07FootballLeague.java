package ForLoopsMoreExercise;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadionCapacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;
        for (int i = 1; i <= fans ; i++) {
            String sector = scanner.nextLine();

            switch (sector){
                case "A":
                    sectorA++;
                    break;
                case "B":
                    sectorB++;
                    break;
                case "V":
                    sectorV++;
                    break;
                case "G":
                    sectorG++;
                    break;
            }

        }

        double percentA = (sectorA * 1.0 / fans) * 100;
        double percentB = (sectorB * 1.0 / fans) * 100;
        double percentV = (sectorV * 1.0 / fans) * 100;
        double percentG = (sectorG * 1.0 / fans) * 100;
        double percentTotal = (fans * 1.0 / stadionCapacity) * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%",percentA,percentB,percentV,percentG,percentTotal);

    }
}
