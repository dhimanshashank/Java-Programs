package kgcoding.challenge5.utils;

import kgcoding.challenge5.library.Book;
import kgcoding.challenge5.library.DVD;
import kgcoding.challenge5.library.LibraryItem;
import kgcoding.challenge5.library.Magazine;

public class TestClass {
    public static void main(String[] args) {
        LibraryItem item = new LibraryItem("001", "Avengers", "Joy Doe");
        System.out.println(item);
        System.out.println("Book Author: " + item.getAuthor() + "\n");

        // Initially book is not borrowed
        item.checkout();
        System.out.println();

        // -------------------------------------------------------------------------------------------

        Book book1 = new Book("001", "Java Programming", "John Doe", "1234567890");

        // Using getters to retrieve information
        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("ISBN: " + book1.getiSBN());

        // Checkout the book
        book1.checkout();

        // Attempt to return the book
        book1.returnItem();

        // Modify ISBN using setter
        book1.setiSBN("0987654321");
        System.out.println("Updated ISBN: " + book1.getiSBN());

        // -------------------------------------------------------------------------------------

        DVD movie = new DVD("002", "The Devil", "Tim Hortan", 200);

        // Information retrival using getter setter
        System.out.println();
        System.out.println("DVD Title: " + movie.getTitle());
        System.out.println("DVD Duration (in seconds): " + movie.getDurationInSeconds());

        // checkout the DVD
        movie.checkout();

        // return the DVD
        movie.returnItem();

        //-----------------------------------------------------------------------------------------

        Magazine mag = new Magazine("003", "The Summer Times", "Washington", "21681");

        // Information retrival using getter setter
        System.out.println();
        System.out.println("Magazine Title: " + mag.getTitle());
        System.out.println("Magazine Issue Number: " + mag.getIssueNumber());

        // checkout the DVD
        mag.checkout();

        // return the DVD
        mag.returnItem();
    }
}
