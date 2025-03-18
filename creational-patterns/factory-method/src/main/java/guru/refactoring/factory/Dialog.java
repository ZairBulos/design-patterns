package guru.refactoring.factory;

import guru.refactoring.buttons.Button;

/**
 * Creator
 */
public abstract class Dialog {

    public void renderButton() {
        Button btn = createButton();
        btn.render();
    }

    public abstract Button createButton();
}
