package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<DocumentState> documentStates = new ArrayList<>();

    public void saveMemento(DocumentState documentState) {
        documentStates.add(documentState);
    }

    public DocumentState getMemento(int index) {
        return documentStates.get(index);
    }
}
