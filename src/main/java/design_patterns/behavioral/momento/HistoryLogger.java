package design_patterns.behavioral.momento;

import java.util.Stack;
/**
 * HistoryLogger manages the undo and redo stacks for document states.
 */
public class HistoryLogger {
    private final Document document;
    private final Stack<DocumentMemento> undoStack = new Stack<>();
    private final Stack<DocumentMemento> redoStack = new Stack<>();

    public HistoryLogger(Document document) {
        this.document = document;
    }

    public void saveState(DocumentMemento memento) {
        undoStack.push(memento);
        redoStack.clear();
    }

    public DocumentMemento undo() {
        if (!undoStack.isEmpty()) {
            DocumentMemento lastState = undoStack.pop();
            document.restore(lastState);
            redoStack.push(lastState);
            return undoStack.isEmpty() ? null : undoStack.peek();
        }
        return null;
    }

    public DocumentMemento redo() {
        if (!redoStack.isEmpty()) {
            DocumentMemento redoState = redoStack.pop();
            document.restore(redoState);
            undoStack.push(redoState);
            return redoState;
        }
        return null;
    }
}
