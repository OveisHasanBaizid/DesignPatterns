package structural.bridge;

public class Main {

    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new RemoteControl(tv);

        remote.powerOn();
        remote.changeVolume(50);
        remote.powerOff();
    }
}