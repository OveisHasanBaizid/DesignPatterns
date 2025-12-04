package proxy;

public class Main {

    public static void main(String[] args) {
        HeavyFile file = new HeavyFileProxy("big-data.bin");

        System.out.println("Proxy created but file not loaded yet...");
        System.out.println(file.load());
    }
}
