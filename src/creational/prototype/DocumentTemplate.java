package creational.prototype;

public class DocumentTemplate {

    private String title;
    private String footer;
    private int version;

    public DocumentTemplate(String title, String footer, int version) {
        this.title = title;
        this.footer = footer;
        this.version = version;
    }

    // creational.prototype pattern
    public DocumentTemplate cloneTemplate() {
        return new DocumentTemplate(title, footer, version);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DocumentTemplate{" +
                "title='" + title + '\'' +
                ", footer='" + footer + '\'' +
                ", version=" + version +
                '}';
    }
}
