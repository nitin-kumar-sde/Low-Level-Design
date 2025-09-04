package practise.file_system;

import java.time.Instant;

/**
 * Entry abstract class representing a file system entry.
 */
public abstract class Entry {

    private final Directory parent;
    private final String name;
    private final Instant created;
    private final Instant lastUpdated;

    public Entry(Directory parent, String name,
                 Instant created, Instant lastUpdated) {
        this.parent = parent;
        this.name = name;
        this.created = created;
        this.lastUpdated = lastUpdated;
    }
    public Directory getParent() {
        return parent;
    }

    public Instant getCreated() {
        return created;
    }

    public Instant getLastUpdated() {
        return lastUpdated;
    }

    public String getName() {
        return name;
    }

    public void delete() {

        if(this.parent != null) {
            this.parent.removeEntry(this);
        }
    }

    @Override
    public String toString() {
        return "Entry{" +
                "parent=" + parent +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    public abstract void displayContent();
}
