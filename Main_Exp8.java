class Book {
    protected String title;
    protected String author;
    protected int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

class ReferenceBook extends Book {
    private String referenceCode;

    public ReferenceBook(String title, String author, int year, String referenceCode) {
        super(title, author, year);
        this.referenceCode = referenceCode;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Reference Code: " + referenceCode);
    }
}

class Magazine extends Book {
    private String issue;

    public Magazine(String title, String author, int year, String issue) {
        super(title, author, year);
        this.issue = issue;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Issue: " + issue);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Book Title", "Author Name", 2023);
        ReferenceBook referenceBook = new ReferenceBook("Reference Book", "Ref Author", 2020, "ABC123");
        Magazine magazine = new Magazine("Magazine Title", "Mag Author", 2023, "Jan 2023");

        System.out.println("Book Information:");
        book.display();

        System.out.println("\nReference Book Information:");
        referenceBook.display();

        System.out.println("\nMagazine Information:");
        magazine.display();
    }
}
