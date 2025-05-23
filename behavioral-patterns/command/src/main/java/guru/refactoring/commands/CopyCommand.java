package guru.refactoring.commands;

import guru.refactoring.editor.Editor;

/**
 * Concrete Command
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
