package practise.file_system;


public class FileSystemController {

    private final FileSystem fs;

    public FileSystemController(FileSystem fs) {
        this.fs = fs;
    }

    public void create(String rawPath, boolean isDirectory) {
        String[] path = normalizePath(rawPath);
        if (path.length == 0) {
            System.out.println("❌ Invalid path: " + rawPath);
            return;
        }
        fs.create(path, isDirectory);
    }

    public void delete(String rawPath) {
        String[] path = normalizePath(rawPath);
        if (path.length == 0) {
            System.out.println("❌ Invalid path: " + rawPath);
            return;
        }
        fs.delete(path);
    }

    public void read(String rawPath) {
        String[] path = normalizePath(rawPath);
        if (path.length == 0) {
            System.out.println("❌ Invalid path: " + rawPath);
            return;
        }
        fs.read(path);
    }

    // === Utility ===
    private String[] normalizePath(String rawPath) {
        if (rawPath == null || rawPath.isBlank()) {
            return new String[0];
        }
        // strip leading/trailing slashes and split
        return rawPath.replaceAll("^/+", "")
                .replaceAll("/+$", "")
                .split("/");
    }
}
