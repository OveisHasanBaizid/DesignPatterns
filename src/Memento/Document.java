package Memento;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public Document(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public DocumentState createDocumentState() {
        return new DocumentState(content, fontName, fontSize);
    }

    public void restoreFromDocumentState(DocumentState documentState, String propertyName) {
        switch (propertyName) {
            case "content" -> this.content = documentState.getContent();
            case "fontName" -> this.fontName = documentState.getFontName();
            case "fontSize" ->  this.fontSize = documentState.getFontSize();
        }
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
