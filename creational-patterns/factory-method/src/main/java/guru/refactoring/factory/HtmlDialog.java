package guru.refactoring.factory;

import guru.refactoring.buttons.Button;
import guru.refactoring.buttons.HtmlButton;

/**
 * Concrete Creator
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
