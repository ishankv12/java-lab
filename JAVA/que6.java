class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
public class que6 {
    static void display(Book b) {
        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
    }
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        display(b1);
    }
}