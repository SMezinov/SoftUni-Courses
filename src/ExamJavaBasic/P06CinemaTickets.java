package src.ExamJavaBasic;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();

        int studentCount = 0;
        int kidCount = 0;
        int standardCount = 0;
        int movieTickets = 0;
        boolean finish = false;
        while (!movie.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());

            String ticketsType = scanner.nextLine();
            while (!ticketsType.equals("End")) {

                switch (ticketsType) {
                    case "student":
                        studentCount++;
                        movieTickets++;
                        break;
                    case "kid":
                        kidCount++;
                        movieTickets++;
                        break;
                    case "standard":
                        standardCount++;
                        movieTickets++;
                        break;
                }
                if (movieTickets >= freePlaces){
                    break;
                }
                ticketsType = scanner.nextLine();
                if (ticketsType.equals("Finish")) {
                    finish = true;
                    break;
                }
            }
            double percent = (movieTickets * 1.0 / freePlaces) * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percent);
            movieTickets = 0;
            if (finish) {
                break;
            }
            movie = scanner.nextLine();
        }
        int totalTickets = studentCount + kidCount + standardCount;
        double percentStudents = (studentCount * 1.0 / totalTickets) * 100;
        double percentKids = (kidCount * 1.0 / totalTickets) * 100;
        double percentStandard = (standardCount * 1.0 / totalTickets) * 100;
        System.out.printf("Total tickets: %d%n%.2f%% student tickets.%n%.2f%% standard tickets.%n%.2f%% kids tickets.", totalTickets, percentStudents, percentStandard, percentKids);
    }
}