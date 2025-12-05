package structural.composite;

public class FileLeaf implements FileSystemComponent {

    private final String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}