package guru.refactoring.buttons;

/**
 * Concrete Product
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created Windows button");
    }
}
