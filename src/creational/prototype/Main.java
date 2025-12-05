package creational.prototype;

public class Main {

    public static void main(String[] args) {

        // creational.prototype object
        DocumentTemplate template = new DocumentTemplate("Report", "Company Name", 1);

        DocumentTemplate doc1 = template.cloneTemplate();
        DocumentTemplate doc2 = template.cloneTemplate();

        doc2.setTitle("Changed Report");

        System.out.println(template);
        System.out.println(doc1);
        System.out.println(doc2);
    }
}