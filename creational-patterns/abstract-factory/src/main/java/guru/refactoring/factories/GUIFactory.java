package guru.refactoring.factories;

import guru.refactoring.buttons.Button;
import guru.refactoring.checkboxes.Checkbox;

/**
 * Abstract Factory
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
