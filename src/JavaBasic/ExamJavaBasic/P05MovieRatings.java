package src.ExamJavaBasic;
import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movies = Integer.parseInt(scanner.nextLine());

        double maxRating = 1;
        String movieMaxRating = "";
        double minRating = 10;
        String movieMinRating = "";
        double totalRating = 0;
        for (int i = 1; i <= movies ; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            totalRating += rating;
            if(rating > maxRating){
                maxRating = rating;
                movieMaxRating = movieName;
            }
            if(rating < minRating){
                minRating = rating;
                movieMinRating = movieName;
            }
        }
        double averageRating = totalRating / movies;
        System.out.printf("%s is with highest rating: %.1f%n%s is with lowest rating: %.1f%nAverage rating: %.1f",movieMaxRating,maxRating,movieMinRating,minRating,averageRating);
    }
}
