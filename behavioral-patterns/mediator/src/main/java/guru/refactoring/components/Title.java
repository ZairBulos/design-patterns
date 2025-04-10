package guru.refactoring.components;

import guru.refactoring.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Component
 */
public class Title extends JTextField implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "Title";
    }
}
