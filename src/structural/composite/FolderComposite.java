package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public FolderComposite(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "+ Folder: " + name);
        children.forEach(c -> c.show(indent + "   "));
    }
}