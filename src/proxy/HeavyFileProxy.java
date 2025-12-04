package proxy;

public class HeavyFileProxy implements HeavyFile {

    private final String path;
    private RealHeavyFile realFile;

    public HeavyFileProxy(String path) {
        this.path = path;
    }

    @Override
    public String load() {
        if (realFile == null) {
            realFile = new RealHeavyFile(path);
        }
        return realFile.load();
    }
}