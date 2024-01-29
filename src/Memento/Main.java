package Memento;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Initial content", "Arial", 12);

        History history = new History();

        history.saveMemento(document.createDocumentState());

        document.setContent("Updated content");
        document.setFontName("Times New Roman");
        document.setFontSize(16);

        history.saveMemento(document.createDocumentState());

        document.restoreFromDocumentState(history.getMemento(0) , "fontSize");

        System.out.println(document);
    }
}
