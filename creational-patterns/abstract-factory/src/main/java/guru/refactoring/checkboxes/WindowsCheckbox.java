package guru.refactoring.checkboxes;

/**
 * Concrete Product
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created Windows checkbox");
    }
}
