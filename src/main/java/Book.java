import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String bookTitle;
    @SuppressWarnings({"unused", "FieldCanBeLocal"})
    private Author booksAuthor;
    private final List<Chapter> listOfChapters;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
        this.listOfChapters = new ArrayList<>();
    }

    @SuppressWarnings("unused")
    public void print() {
        System.out.println("Book with title: " + bookTitle);
    }

    public void addAuthor(Author obiectAutor) {
        this.booksAuthor = obiectAutor;
    }

    public int createChapter(String numeleCapitolului) {
        listOfChapters.add(new Chapter(numeleCapitolului));
        return listOfChapters.size() - 1;
    }

    public Chapter getChapter(int indexChapterOne) {
        return listOfChapters.get(indexChapterOne);
    }
}
