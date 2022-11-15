package Lesson4_CreationAndUsingClass;

public class Book {
    public static int numberOfBook = 0;

    // attributes
    private String name;
    private String author;
    private int numberOfPage;

    //parameterized constructor
    public Book(String name, String author, int nbrPage) {
        this.name = name;
        this.author = author;
        this.numberOfPage = nbrPage;
        numberOfBook++;
    }

    //accessor and mutator methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}
