public class Table implements Element {
    private final String numeleTabelei;

    public Table(String numeleTabelei) {
        this.numeleTabelei = numeleTabelei;
    }

    public void print() {
        System.out.println("Table with title: " + numeleTabelei);
    }
}
