package models;

public class Author {
    private final String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    @SuppressWarnings("unused")
    public void print() {
        System.out.println("models.Author: " + authorName);
    }
}
