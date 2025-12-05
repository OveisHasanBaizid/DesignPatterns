package structural.proxy;

public class RealHeavyFile implements HeavyFile {

    private final String path;

    public RealHeavyFile(String path) {
        this.path = path;
    }

    @Override
    public String load() {
        System.out.println("Loading file from disk: " + path);
        return "FileData(" + path + ")";
    }
}