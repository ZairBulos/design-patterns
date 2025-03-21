package guru.refactoring.factories;

import guru.refactoring.buttons.Button;
import guru.refactoring.buttons.WindowsButton;
import guru.refactoring.checkboxes.Checkbox;
import guru.refactoring.checkboxes.WindowsCheckbox;

/**
 * Concrete Factory
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
