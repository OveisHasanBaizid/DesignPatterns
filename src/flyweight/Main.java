package flyweight;

public class Main {

    public static void main(String[] args) {
        PictureType oak1 = PictureFactory.getPictureType("Oak-Green");
        PictureType oak2 = PictureFactory.getPictureType("Oak-Green");

        oak1.draw(10, 20);
        oak2.draw(30, 50);

        System.out.println("Shared object? " + (oak1 == oak2)); // true
    }
}