package models;

@SuppressWarnings("unused")
public class ImageProxy implements Element, Picture {
    private final String proxyImage;
    private int imageSize;
    private Image imageObject;

    public ImageProxy(String proxyImage) {
        this.proxyImage = proxyImage;
    }

    public Image loadImage() {
        if (imageObject == null) {
            imageObject = new Image(proxyImage);
        }
        return imageObject;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int indexulElementului) {
        return null;
    }
}
