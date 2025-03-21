package guru.refactoring.buttons;

/**
 * Concrete Product
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOS button");
    }
}
