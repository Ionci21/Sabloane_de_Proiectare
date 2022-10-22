import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class Book {
    private final String bookTitle;
    private final List<Author> listOfAuthors;
    private final List<Element> listOfElements;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
        this.listOfAuthors = new ArrayList<>();
        this.listOfElements = new ArrayList<>();
    }

    public void print() {
        System.out.println("Book: " + bookTitle + "\n\nAuthors:");
        listOfAuthors.forEach(Author::print);
        System.out.println();
        listOfElements.forEach(Element::print);
    }

    public void addAuthor(Author obiectAutor) {
        this.listOfAuthors.add(obiectAutor);
    }

    public void addContent(Element paragraphObject) {
        listOfElements.add(paragraphObject);
    }
}
