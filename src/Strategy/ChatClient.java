package Strategy;

public class ChatClient {
    private final Encryption encryptionAlgorithm;

    public ChatClient(Encryption encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        encryptionAlgorithm.apply(message);
        System.out.println("Sending the encrypted message...");
    }
}
