package design_patterns.behavioral.momento;

/**
 * DocumentMemento is a memento class that stores the state of a Document.
 */
public class DocumentMemento {
    private final String state;

    public DocumentMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

