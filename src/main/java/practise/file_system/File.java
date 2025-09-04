package practise.file_system;


import java.time.Instant;

public class File extends Entry {

    public File(Directory parent, String name,
                Instant created, Instant lastUpdated) {
        super(parent, name, created, lastUpdated);
    }


    @Override
    public void displayContent() {
        System.out.println("File: " + this);
    }
}
