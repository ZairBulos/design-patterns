package guru.refactoring.factory;

import guru.refactoring.buttons.Button;
import guru.refactoring.buttons.WindowsButton;

/**
 * Concrete Creator
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
