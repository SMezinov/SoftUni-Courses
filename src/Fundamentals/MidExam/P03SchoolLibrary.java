package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03SchoolLibrary {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] books = scanner.nextLine().split("\\&");

        List<String> bookList = new ArrayList<>();
        for (String book : books) {
            bookList.add(book);
        }

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] commandParts = command.split(" \\| ");
            String action = commandParts[0];
            String bookName = commandParts[1];

            switch (action) {
                case "Add Book":
                    addBook(bookList, bookName);
                    break;
                case "Take Book":
                    takeBook(bookList, bookName);
                    break;
                case "Swap Books":
                    String book2 = commandParts[2];
                    swapBooks(bookList, bookName, book2);
                    break;
                case "Insert Book":
                    insertBook(bookList, bookName);
                    break;
                case "Check Book":
                    int index = Integer.parseInt(bookName);
                    checkBook(bookList, index);
                    break;
            }

            command = scanner.nextLine();
        }

        printBookCollection(bookList);
    }

    private static void addBook(List<String> bookList, String bookName) {
        if (!bookList.contains(bookName)) {
            bookList.add(0, bookName);
        }
    }

    private static void takeBook(List<String> bookList, String bookName) {
        bookList.remove(bookName);
    }

    private static void swapBooks(List<String> bookList, String book1, String book2) {
        int index1 = bookList.indexOf(book1);
        int index2 = bookList.indexOf(book2);

        if (index1 != -1 && index2 != -1) {
            bookList.set(index1, book2);
            bookList.set(index2, book1);
        }
    }

    private static void insertBook(List<String> bookList, String bookName) {
        if (!bookList.contains(bookName)) {
            bookList.add(bookName);
        }
    }

    private static void checkBook(List<String> bookList, int index) {
        if (index >= 0 && index < bookList.size()) {
            System.out.println(bookList.get(index));
        }
    }

    private static void printBookCollection(List<String> bookList) {
        String bookCollection = String.join(", ", bookList);
        System.out.println(bookCollection);
    }
}
