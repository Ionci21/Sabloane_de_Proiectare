import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element {
    private final String paragraphName;
    private final List<Element> listOfElements;

    public Paragraph(String paragraphName) {
        this.paragraphName = paragraphName;
        this.listOfElements = new ArrayList<>();
    }

    @Override
    public void add(Element elementObject) {
        listOfElements.add(elementObject);
    }

    @Override
    public void remove(Element elementObject) {
        listOfElements.remove(elementObject);
    }

    @Override
    public Element get(int indexOfElement) {
        return listOfElements.get(indexOfElement);
    }

    public void print() {
        System.out.println("Paragraph: " + paragraphName);
    }
}
