package guru.refactoring;

import guru.refactoring.editor.Editor;
import guru.refactoring.listeners.EmailNotificationListener;
import guru.refactoring.listeners.LogOpenListener;

/**
 * Client
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}