package guru.refactoring;

import guru.refactoring.app.Application;
import guru.refactoring.factories.GUIFactory;
import guru.refactoring.factories.MacOSFactory;
import guru.refactoring.factories.WindowsFactory;

public class Main {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        app = new Application(factory);

        return app;
    }
}