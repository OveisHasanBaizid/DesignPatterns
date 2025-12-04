package decorator;

public class SimpleReportService implements ReportService {

    @Override
    public String report() {
        return "Report content";
    }
}