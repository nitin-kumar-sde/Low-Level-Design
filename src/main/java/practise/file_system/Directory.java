package practise.file_system;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Directory extends Entry{

    private final Map<String, Entry> directoryContents;

    public Directory(Directory parent, String name,
                     Instant created, Instant lastUpdated) {

        super(parent, name, created, lastUpdated);
        directoryContents = new HashMap<>();
    }


    @Override
    public void displayContent() {
        System.out.println("Directory: " + this);
        for(Entry entry : directoryContents.values()) {
            entry.displayContent();
        }
    }

    public void addEntry(Entry entry) {
        directoryContents.put(entry.getName(), entry);
    }

    public void removeEntry(Entry entry) {
        directoryContents.remove(entry.getName());
    }

    public Map<String, Entry> getDirectoryContents() {
        return directoryContents;
    }

}
