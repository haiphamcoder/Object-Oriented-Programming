package Lesson4_CreationAndUsingClass;

import java.util.Scanner;

public class Exercise1 {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the maximum number of elements for a Book array: ");
        int maximum;
        try {
            maximum = Integer.parseInt(keyboard.nextLine());
            if (maximum > 0) {
                Book[] books = new Book[maximum];
                int option;
                while (true) {
                    System.out.println("######################################");
                    System.out.println("#           Book Management          #");
                    System.out.printf("# %-34s #\n", "The current number of Books: " + Book.numberOfBook);
                    System.out.printf("# %-34s #\n", "1. Add book");
                    System.out.printf("# %-34s #\n", "2. Print the list of book");
                    System.out.printf("# %-34s #\n", "3. Exit");
                    System.out.println("######################################");
                    System.out.print("Enter your option (1,2,3): ");
                    option = Integer.parseInt(keyboard.nextLine());
                    System.out.println();
                    if (option == 1) {
                        if (Book.numberOfBook == maximum) {
                            System.out.println("The number of books is maximum.");
                        } else {
                            System.out.print("\t- Enter the name of book: ");
                            String name = keyboard.nextLine();
                            System.out.print("\t- Enter the author of book: ");
                            String author = keyboard.nextLine();
                            System.out.print("\t- Enter the number of page for book: ");
                            int page = Integer.parseInt(keyboard.nextLine());
                            books[Book.numberOfBook] = new Book(name, author, page);
                        }

                    } else if (option == 2) {
                        int totalPages = 0;
                        System.out.printf("| %-21s | %-10s |\n", "Name's book", "Page");
                        System.out.println("--------------------------------------");
                        for (int i = 0; i < Book.numberOfBook; i++) {
                            String name = books[i].getName();
                            int page = books[i].getNumberOfPage();
                            totalPages += page;
                            System.out.printf("| %-21s | %-10s |\n", name.length() > 21 ? name.substring(0, 18) + "..." : name, page);
                        }
                        System.out.println("--------------------------------------");
                        System.out.println("The total of pages for all books: " + totalPages);
                    } else if (option == 3) {
                        break;
                    } else {
                        System.out.println("Option is not found!");
                    }
                    System.out.print("\nPress Enter to continue...");
                    keyboard.nextLine();
                }
            } else {
                System.out.println("Error: The maximum number of elements for a book array must be a positive number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: The number is invalid!");
            System.out.println("Exit program! Goodbye!!!");
        }
    }
}