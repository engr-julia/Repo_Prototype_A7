public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    public void setDetails(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    @Override
    public Document clone() {
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType() { return "Text"; }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount;
    }
}