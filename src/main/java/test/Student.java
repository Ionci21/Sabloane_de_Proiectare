package test;

@SuppressWarnings("unused")
public record Student(String numePrenumeStudent, String emailStudent) implements Element {

    @Override
    public void add(Element... obiectElement) {
    }

    @Override
    public void printElement() {
        System.out.println("\t\t\t" + numePrenumeStudent + ", " + emailStudent);
    }

    @Override
    public void accept(Visitor visitorObject) {
        visitorObject.visitElement(this);
    }
}
