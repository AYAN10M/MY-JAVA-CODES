
class Book {

    String title;
    String author;
    int pages;
    int price;

    // Non Parameterized Constructors
    Book() {
        title = "Java The Complete Reference";
        author = "Herbert Schildt";
        pages = 1208;
        price = 2000;
    }

    // Parameterized Constructors
    Book(String title, String author, int pages, int price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    void display() {
        System.out.println(title + " is written by " + author + " and it costs " + price);
    }
}

public class Constructor_Example {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();

        Book b2 = new Book("Let us C", "Yashavant Kanetkar", 743, 400);
        b2.display();
    }

}
