package guru.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private Originator originator;
    private List<Memento> mementos = new ArrayList<>();

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void backup() {
        System.out.println("Caretaker: Saving Originator's state");
        this.mementos.add(this.originator.save());
    }

    public void undo() {
        if (this.mementos.isEmpty()) return;

        Memento memento = this.mementos.remove(this.mementos.size() - 1);

        System.out.println("Caretaker: Restoring state to: " + memento.getName());
        this.originator.restore(memento);
    }

    public void showHistory() {
        System.out.println("Caretaker: Here's the list of mementos");
        this.mementos.forEach(memento -> System.out.println(memento.getName()));
    }
}
