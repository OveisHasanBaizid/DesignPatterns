package State;

public interface PackageState {
    void nextState(Package pkg);

    void prevState(Package pkg);

    void printStatus();
}
