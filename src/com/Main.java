package com;

import com.model.Book;  

public class Main {
    public static void main(String[] args) {
        // Create a new Book object
        Book myBook = new Book();
        
        // Set the title and author
        myBook.setTitle("To Kill a Mockingbird");
        myBook.setAuthor("Harper Lee");
        
        // Print the book details
        System.out.println(myBook);
    }
}

