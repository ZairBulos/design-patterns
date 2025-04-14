package guru.refactoring;

import java.util.Random;

public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
        System.out.println("Originator: My initial state is: " + state);
    }

    public Memento save() {
        return new ConcreteMemento(this.state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
        System.out.println("Originator: My state has changed to: " + this.state);
    }

    public void doSomething() {
        System.out.println("Originator: I'm doing something important.");
        this.state = generateRandomString(30);
        System.out.println("Originator: And my state has changed to: " + this.state);;
    }

    private String generateRandomString(int length) {
        String charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charSet.length());
            randomString.append(charSet.charAt(index));
        }

        return randomString.toString();
    }
}
