package Problem5;

public class Book implements Comparable<Book> {
    private final String title;
    private final long isbnNumber;
    private final String author;
    private final String edition;
    private final String publisher;
    private final int publishYear;

    public Book(String title, long isbnNumber, String author, String edition, String publisher, int publishYear) {
        this.title = title;
        this.isbnNumber = isbnNumber;
        this.author = author;
        this.edition = edition;
        this.publisher = publisher;
        this.publishYear = publishYear;
    }

    public String toString() {
        return "Title: " + this.title + ", ISBN: " + this.isbnNumber + ", Author: " + this.author + ", Edition: " + this.edition + ", Publisher: " + this.publisher + ", Publish Year: " + this.publishYear;
    }

    @Override
    public int compareTo(Book book) {
        int compareTitle = this.title.compareTo(book.title);
        if (compareTitle == 0) {
            if (this.isbnNumber < book.isbnNumber) {
                return -1;
            } else if (this.isbnNumber > book.isbnNumber) {
                return 1;
            }
        }
        return compareTitle;
    }
}