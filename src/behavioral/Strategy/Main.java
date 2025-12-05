package behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        ChatClient client1 = new ChatClient(new AES());
        client1.send("Hello");

        ChatClient client2 = new ChatClient(new DES());
        client2.send("Hello");
    }
}
