package GangOfFour.Command.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        String selectedText = editor.textField.getSelectedText();
        if (selectedText == null || selectedText.isEmpty()) {
            return false;
        }

        editor.clipboard = selectedText;
        return true;
    }
}