package design_patterns.behavioral.momento;

/**
 * Document class that can create and restore its state using Memento pattern.
 */
public class Document {
    private String content;

    public void write(String newContent) {
        this.content = newContent;
        System.out.println("Document updated to: " + content);
    }

    public String getContent() {
        return content;
    }

    // Creates a snapshot (Memento)
    public DocumentMemento save() {
        return new DocumentMemento(content);
    }

    // Restores from a snapshot (Memento)
    public void restore(DocumentMemento memento) {
        this.content = memento.getState();
        System.out.println("Document reverted to: " + content);
    }
}

