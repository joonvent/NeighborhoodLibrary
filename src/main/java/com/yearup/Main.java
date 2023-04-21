package com.yearup;
import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Main {
    private static Book[] Books = new Book[8];
    private static int numBooks = 6;
    public static void main(String[] args ){

        Books[0]= new Book(11111, "02980A","Hunger Games" );
        Books[1]= new Book(22222, "08723B", "To Kill A Mocking Bird");
        Books[2]= new Book(33333, "04543C", "Maze Runner");
        Books[3]= new Book(44444, "05487D", "Atomic Habits");
        Books[4]= new Book(55555, "07782E", "Catcher and The Rye");
        Books[6]= new Book(66666,"034543F","48 Laws of Power" );

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Welcome To Our Library!");
            System.out.println("What Would You Like to Do?");

            System.out.println("1. Show Available Books");
            System.out.println("2. show checkout out books");
            System.out.println("3. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1: ListAvailableBook;


                case 2:
                case 3:





            }
        }



    }
    private static void listAvailableBooks(){
        System.out.println("Available Books:");
        for(int i =0; i <numBooks; i++){
            System.out.println(Books[i].getId()+);
        }
    }



}




