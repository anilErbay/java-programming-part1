package _1_OOP.Book;

// class
public class Book {
    // instance variables
    private String author;
    private String name;
    private int pages;

    // constructor
    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    // methods
    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
}
