package practise.file_system;

import java.time.Instant;

public class FileSystem {

    private final Directory root;

    public FileSystem() {
        this.root = new Directory(null, "/",
                Instant.now(), Instant.now());
    }


    public void create(String[] path, boolean isDirectory) {
        create(root, path, 0, isDirectory);
    }

    public void read(String[] path) {

        Entry node = find(root, path, 0);
        if (node == null) {
            System.out.println("❌ Path not found: " + String.join("/", path));
            return;
        }
        node.displayContent();
    }

    public void delete(String[] path) {

        boolean deleted = delete(root, path, 0);
        if (!deleted) {
            System.out.println("❌ Could not delete: " + String.join("/", path));
        }
    }

    // === Private Recursive Utilities ===

    private void create(Directory current, String[] path, int index, boolean isDirectory) {
        // base case: fully consumed path → nothing to do
        if (index == path.length) {
            return;
        }

        String name = path[index];
        Entry child = current.getDirectoryContents().get(path[index]);

        // last segment → actually create file/dir
        if (index == path.length - 1) {
            if (child != null) {
                System.out.println("⚠️ Entry already exists: " + name);
                return;
            }
            current.addEntry(isDirectory
                    ? new Directory(current, name, Instant.now(), Instant.now())
                    : new File(current, name, Instant.now(), Instant.now()));
            System.out.println("✅ Created " + (isDirectory ? "directory" : "file") + ": " + name);
            return;
        }

        // recursive step → ensure directory
        if (child == null) {
            child = new Directory(current, name, Instant.now(), Instant.now());
            current.addEntry(child);
        }
        if (!(child instanceof Directory dir)) {
            throw new IllegalStateException("Path segment is a file, cannot create under it: " + name);
        }
        create(dir, path, index + 1, isDirectory);
    }

    private Entry find(Directory current, String[] path, int index) {
        // base case: fully consumed path → return current node
        if (index == path.length) {
            return current;
        }

        Entry child = current.getDirectoryContents().get(path[index]);
        if (child == null) return null;

        if (child instanceof Directory dir) {
            return find(dir, path, index + 1);
        }
        return null;
    }

    private boolean delete(Directory current, String[] path, int index) {
        // base case: fully consumed path → nothing to delete
        if (index == path.length) {
            return false;
        }

        String name = path[index];
        Entry child = current.getDirectoryContents().get(path[index]);
        if (child == null) return false;

        if (index == path.length - 1) {
            current.removeEntry(child);
            System.out.println("🗑️ Deleted: " + name);
            return true;
        }

        if (child instanceof Directory dir) {
            boolean deleted = delete(dir, path, index + 1);
            // optional cleanup: remove empty directories

            if (dir.getDirectoryContents().isEmpty()) {
                current.removeEntry(dir);
            }
            return deleted;
        }
        return false;
    }
}
