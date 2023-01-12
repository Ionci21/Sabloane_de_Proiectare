package models;

public interface Element {
    void add(Element elementObject);
    void remove(Element elementObject);
    Element get(int indexOfElement);
    void print();
}
