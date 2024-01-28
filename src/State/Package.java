package State;

public class Package {
    private PackageState state = new OrderedState();

    public void previousState() {
        state.prevState(this);
    }

    public void nextState() {
        state.nextState(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }
}
