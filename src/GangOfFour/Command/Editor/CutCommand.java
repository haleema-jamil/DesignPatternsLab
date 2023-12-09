package GangOfFour.Command.Editor;

public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        String selectedText = editor.textField.getSelectedText();
        if (selectedText == null || selectedText.isEmpty()) {
            return false;
        }

        backup();
        String source = editor.textField.getText();
        editor.clipboard = selectedText;
        editor.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}