package com.yearup;

import java.util.Scanner;

public class Main {
    private static Book[] Books = new Book[6];
    private static int numBooks = 6;
    private static boolean[] checkedOut = new boolean[6];

    public static void main(String[] args) {

        Books[0] = new Book(11111, "02980A", "Hunger Games");
        Books[1] = new Book(22222, "08723B", "To Kill A Mocking Bird");
        Books[2] = new Book(33333, "04543C", "Maze Runner");
        Books[3] = new Book(44444, "05487D", "Atomic Habits");
        Books[4] = new Book(55555, "07782E", "Catcher and The Rye");
        Books[5] = new Book(66666, "034543F", "48 Laws of Power");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome To Our Library!");
            System.out.println("What Would You Like to Do?");

            System.out.println("1. Show Available Books");
            System.out.println("2. Check Out Book");
            System.out.println("3. List Checked Out Books");


            System.out.println("4. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    listAvailableBooks();
                    break;
                case 2:
                    checkOutBook(scanner);
                    break;
                case 3:
                    listCheckedOutBooks();
                    break;
                case 4:
                    goHome();
                    return; // exit the program when user selects option 3

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private static void listAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < numBooks; i++) {
            if (!checkedOut[i]) {
                System.out.println(Books[i].getTitle() + " | " + Books[i].getId() + " | " + Books[i].getIsbn());
            }

            String line ="--------------------------------------------------------";
            System.out.println(line);

        }

    }

    private static void checkOutBook(Scanner scanner) {
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Select a book to check out (1-6):");
        listAvailableBooks();

        int bookIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (bookIndex < 0 || bookIndex >= numBooks) {
            System.out.println("Invalid book selection");
        } else if (checkedOut[bookIndex]) {
            System.out.println("Book is already checked out");
        } else {
            checkedOut[bookIndex] = true;
            Books[bookIndex].setCheckedOut(true);
            Books[bookIndex].setCheckedOutTo(name);
            System.out.println(name + ", you have checked out " + Books[bookIndex].getTitle());

        }
    }

    private static void listCheckedOutBooks(){
        System.out.println("Checked Out Books:");
        for (int i = 0; i < numBooks ; i++){
            if (checkedOut[i]){
                System.out.println(Books[i].getTitle() + " | " + Books[i].getId() + " | " + Books[i].getIsbn() + " | Checked Out By: " + Books[i].getCheckedOutTo());
            }
            }
        }


    private static void goHome() {
        System.out.println("Thank you for visiting our library!");
    }
}




