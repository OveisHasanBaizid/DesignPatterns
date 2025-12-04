package decorator;

public abstract class ReportDecorator implements ReportService {

    protected ReportService wrappee;

    protected ReportDecorator(ReportService service) {
        this.wrappee = service;
    }

    @Override
    public String report() {
        return wrappee.report();
    }
}