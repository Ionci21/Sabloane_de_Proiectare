package models;

import java.util.ArrayList;
import java.util.List;

public class Image implements Element {
    private final String imageName;
    private final List<Element> listOfElements;

    public Image(String imageName) {
        this.imageName = imageName;
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
        System.out.println("Image with name: " + imageName);
    }
}
