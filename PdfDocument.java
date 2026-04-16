public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    public void setDetails(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public Document clone() {
        try {
            return (PdfDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    @Override
    public String getType() { return "PDF"; }

    @Override
    public String toString() {
        return "Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount;
    }
}