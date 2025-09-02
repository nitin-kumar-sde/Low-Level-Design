package design_patterns.behavioral.momento;

public class Main {
    public static void main(String[] args) {

        Document doc = new Document();
        HistoryLogger history = new HistoryLogger(doc);

        doc.write("Draft");
        history.saveState(doc.save());

        doc.write("Added Intro");
        history.saveState(doc.save());

        doc.write("Added Conclusion");
        history.saveState(doc.save());

        history.undo();
        System.out.println("Current Content: " + doc.getContent());

        history.undo();
        System.out.println("Current Content: " + doc.getContent());

        // Redo once
        history.redo();

        System.out.println("Current Content: " + doc.getContent());
    }

}
