package GangOfFour.Command.Editor;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void push(Command c) {
        history.push(c);
        redoStack.clear(); // Clear redo stack when a new command is pushed
    }

    public Command pop() {
        if (!history.isEmpty()) {
            redoStack.push(history.peek());
        }
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public Command redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            history.push(command);
            return command;
        }
        return null;
    }
}
