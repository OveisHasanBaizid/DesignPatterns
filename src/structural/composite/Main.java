package structural.composite;

public class Main {

    public static void main(String[] args) {

        FolderComposite root = new FolderComposite("root");
        FolderComposite src = new FolderComposite("src");

        FileLeaf file1 = new FileLeaf("main.java");
        FileLeaf file2 = new FileLeaf("utils.java");

        src.add(file1);
        src.add(file2);

        root.add(src);
        root.add(new FileLeaf("readme.md"));

        root.show("");
    }
}