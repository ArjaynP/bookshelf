package Problem5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bookshelf {
    public static void main(String[] args) {
        ArrayList<Book> bookshelf = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        char charCounter = 'Y';
        char charCounterUpper = Character.toUpperCase(charCounter);

        System.out.println("Welcome to your personal digital bookshelf");

        while (charCounterUpper == 'Y') {
            String title;
            long isbn;
            String author;
            String edition;
            String publisher;
            int publishYear;

            System.out.print("Please enter the title of the book you wish to have added: ");
            title = scanner.nextLine();

            System.out.print("Please enter the isbn Number (13): ");
            isbn = scanner.nextLong();

            scanner.nextLine();

            System.out.print("Please enter the author of your book: ");
            author = scanner.nextLine();

            System.out.print("Please enter the edition of the book: ");
            edition = scanner.nextLine();

            System.out.print("Please enter the name of the publisher: ");
            publisher = scanner.nextLine();

            System.out.print("Please enter the year the book was published: ");
            publishYear = scanner.nextInt();

            bookshelf.add(new Book(title, isbn, author, edition, publisher, publishYear));

            System.out.print("Would you like to add a new Book to your shelf? ");
            charCounter = scanner.next().charAt(0);
            charCounterUpper = Character.toUpperCase(charCounter);

            scanner.nextLine();
            System.out.println();
        }

        Collections.sort(bookshelf);

        for (Book book : bookshelf) {
            System.out.println(book);
        }
    }
}

/*
 bookshelf.add(new Book("To Kill a Mockingbird", 9780062420701L, "Harper Lee", "Kindle Edition", "HarperCollins Publishers CA", 2005));
 bookshelf.add(new Book("The Enchanted Forest: Dealing with Dragons", 9780544541221L, "Patricia C.  Wrede", "First Edition", "Harcourt Brace & Company", 1990));
 bookshelf.add(new Book("Harry Potter and the Sorcerer's Stone", 9780747532699L, "J.K. Rowling", "Library Edition", "Scholastic Corporation", 2003));
 */