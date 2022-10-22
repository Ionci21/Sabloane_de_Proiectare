import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private final String chapterName;
    private final List<SubChapter> listOfSubChapters;

    public Chapter(String chapterName) {
        this.chapterName = chapterName;
        listOfSubChapters = new ArrayList<>();
    }

    @SuppressWarnings("unused")
    public void print() {
        System.out.println("Paragraph: " + chapterName);
    }

    public int createSubChapter(String numeleSubcapitolului) {
        listOfSubChapters.add(new SubChapter(numeleSubcapitolului));
        return listOfSubChapters.size() - 1;
    }

    public SubChapter getSubChapter(int indexulSubcapitolului) {
        return listOfSubChapters.get(indexulSubcapitolului);
    }
}
