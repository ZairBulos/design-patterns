package guru.refactoring;

import guru.refactoring.factory.Dialog;
import guru.refactoring.factory.HtmlDialog;
import guru.refactoring.factory.WindowsDialog;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBuisnessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBuisnessLogic() {
        dialog.renderButton();
    }
}