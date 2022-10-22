public class Image implements Element {
    private final String numeleImaginii;

    public Image(String numeleImaginii) {
        this.numeleImaginii = numeleImaginii;
    }

    public void print() {
        System.out.println("Image with name: " + numeleImaginii);
    }
}
