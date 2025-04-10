package guru.refactoring.components;

import guru.refactoring.mediator.Mediator;
import guru.refactoring.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Component
 */
public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
