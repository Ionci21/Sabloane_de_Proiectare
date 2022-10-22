import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private final String subChapterName;
    private final List<Element> listOfElements;

    public SubChapter(String subChapterName) {
        this.subChapterName = subChapterName;
        listOfElements = new ArrayList<>();
    }

    public void print() {
        System.out.println("Subchapter: " + subChapterName);
        listOfElements.forEach(Element::print);
    }

    public void createNewParagraph(String numeleParagrafului) {
        listOfElements.add(new Paragraph(numeleParagrafului));
    }

    public void createNewImage(String numeleImaginii) {
        listOfElements.add(new Image(numeleImaginii));
    }

    public void createNewTable(String numeleTabelei) {
        listOfElements.add(new Table(numeleTabelei));
    }
}
