package State;

public class ReceivedState implements PackageState {

    @Override
    public void nextState(Package pkg) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prevState(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package Received.");
    }
}
