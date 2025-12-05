package behavioral.Iterator;

public interface Iterator {
    boolean hasNext();

    Product current();

    void next();
}
