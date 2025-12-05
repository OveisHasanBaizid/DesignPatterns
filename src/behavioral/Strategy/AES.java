package behavioral.Strategy;

public class AES implements Encryption{
    @Override
    public void apply(String text) {
        System.out.println("AES");
    }
}
