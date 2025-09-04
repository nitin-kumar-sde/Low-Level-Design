package practise.file_system;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{

    private final List<Entry> directoryContents;

    public Directory(Directory parent, String name,
                     Instant created, Instant lastUpdated) {

        super(parent, name, created, lastUpdated);
        directoryContents = new ArrayList<Entry>();
    }


    @Override
    public void displayContent() {
        System.out.println("Directory: " + this);
        for(Entry entry : directoryContents) {
            entry.displayContent();
        }
    }

    public void addEntry(Entry entry) {
        directoryContents.add(entry);
    }

    public void removeEntry(Entry entry) {
        directoryContents.remove(entry);
    }

}
