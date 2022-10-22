
public class Paragraph implements Element {
    private final String paragraphName;

    public Paragraph(String paragraphName) {
        this.paragraphName = paragraphName;
    }

    public void print() {
        System.out.println("Paragraph: " + paragraphName);
    }
}
