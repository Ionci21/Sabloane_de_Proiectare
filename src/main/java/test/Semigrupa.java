package test;

import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"MismatchedQueryAndUpdateOfCollection", "unused"})
public class Semigrupa implements Element {
    private final String titluSemigrupa;
    private final List<Element> listaElemente;
    public Semigrupa(String titluSemigrupa) {
        this.titluSemigrupa = titluSemigrupa;
        this.listaElemente = new ArrayList<>();
    }

    public String getTitluSemigrupa() {
        return titluSemigrupa;
    }

    @Override
    public void add(Element... obiectElement) {
        listaElemente.addAll(List.of(obiectElement));
    }
}
