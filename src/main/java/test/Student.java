package test;

@SuppressWarnings("unused")
public class Student implements Element {
    private final String numePrenumeStudent, emailStudent;

    public Student(String numePrenumeStudent, String emailStudent) {
        this.numePrenumeStudent = numePrenumeStudent;
        this.emailStudent = emailStudent;
    }

    public String getNumePrenumeStudent() {
        return numePrenumeStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    @Override
    public void add(Element... obiectElement) {
    }
}
