package guru.refactoring;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator("Super-duper-super-puper-super.");
        Caretaker caretaker = new Caretaker(originator);

        caretaker.backup();
        originator.doSomething();

        caretaker.backup();
        originator.doSomething();

        caretaker.backup();
        originator.doSomething();

        caretaker.showHistory();

        System.out.println("Client: Now, let's rollback");
        caretaker.undo();

        System.out.println("Client: Once more");
        caretaker.undo();
    }
}