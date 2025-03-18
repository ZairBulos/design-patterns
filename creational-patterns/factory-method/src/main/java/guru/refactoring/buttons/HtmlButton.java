package guru.refactoring.buttons;

/**
 * Concrete Product
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>HtmlButton</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click!");
    }
}
