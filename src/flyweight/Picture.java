package flyweight;

public class Picture implements PictureType {

    private final String name;
    private final String color;

    public Picture(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw Tree [" + name + ", " + color + "] at (" + x + "," + y + ")");
    }
}