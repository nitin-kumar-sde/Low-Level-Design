package practise.file_system;

import java.time.Instant;

/**
 * Implementation of a simple file system using Composite Design Pattern.
 */
public class Main {

    public static void main(String[] args) {
        final Directory top = new Directory(null , "parent",
                Instant.now(),Instant.now());
        final Directory directory1 = new Directory(top , "directory-1",
                Instant.now(),Instant.now());

        final File file1 = new File(directory1 , "file-1",
                Instant.now(),Instant.now());
        directory1.addEntry(file1);

        final Directory directory2 = new Directory(top , "directory-2",
                Instant.now(),Instant.now());

        final File file2 = new File(directory2 , "file-1",
                Instant.now(),Instant.now());
        directory2.addEntry(file2);

        top.addEntry(directory1);
        top.addEntry(directory2);

        top.displayContent();
    }
}
