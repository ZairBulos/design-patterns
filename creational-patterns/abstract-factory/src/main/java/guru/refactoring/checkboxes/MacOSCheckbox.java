package guru.refactoring.checkboxes;

/**
 * Concrete Product
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOS checkbox");
    }
}
