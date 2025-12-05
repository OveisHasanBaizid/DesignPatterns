package behavioral.command;

public class Main {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        EditorInvoker invoker = new EditorInvoker();

        invoker.setCommand(new CopyCommand(editor));
        invoker.pressButton();

        invoker.setCommand(new PasteCommand(editor));
        invoker.pressButton();
    }
}