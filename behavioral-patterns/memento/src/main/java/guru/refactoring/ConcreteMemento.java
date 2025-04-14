package guru.refactoring;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConcreteMemento implements Memento {
    private String state;
    private String date;

    public ConcreteMemento(String state) {
        this.state = state;
        this.date = generateDate();
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String getName() {
        return this.date + " / " + this.state.substring(0, 9);
    }

    @Override
    public String getDate() {
        return this.date;
    }

    private String generateDate() {
        LocalDateTime date = LocalDateTime.now();
        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
