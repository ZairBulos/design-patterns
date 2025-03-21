package guru.refactoring.factories;

import guru.refactoring.buttons.Button;
import guru.refactoring.buttons.MacOSButton;
import guru.refactoring.checkboxes.Checkbox;
import guru.refactoring.checkboxes.MacOSCheckbox;

/**
 * Concrete Factory
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
