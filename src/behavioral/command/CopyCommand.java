package behavioral.command;

public class CopyCommand implements Command {

    private final TextEditor editor;

    public CopyCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copy();
    }
}