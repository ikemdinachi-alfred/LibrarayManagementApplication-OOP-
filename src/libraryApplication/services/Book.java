package libraryApplication.services;

public class Book {


    private String id;
    private String title;
    private String author;
    private String pages;
    private boolean isAvailable;

    public Book(String id, String title, String author, String pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPages() {
        return pages;
    }
}
