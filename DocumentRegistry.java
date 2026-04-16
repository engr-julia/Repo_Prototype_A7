import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private Map<String, Document> prototypes = new HashMap<>();

    public DocumentRegistry() {
        prototypes.put("PDF", new PdfDocument());
        prototypes.put("TEXT", new TextDocument());
        prototypes.put("SHEET", new SpreadsheetDocument());
    }

    public Document getDocument(String type) {
        Document proto = prototypes.get(type.toUpperCase());
        return (proto != null) ? proto.clone() : null;
    }
}