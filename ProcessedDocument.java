public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        PdfDocument doc1 = (PdfDocument) registry.getDocument("PDF");
        doc1.setDetails("annual_report_2024.pdf", "Acme Corp", 150);
        doc1.open();
        System.out.println(doc1);

        TextDocument doc2 = (TextDocument) registry.getDocument("TEXT");
        doc2.setDetails("meeting_notes.txt", "UTF-8", 250);
        doc2.open();
        System.out.println(doc2);

        SpreadsheetDocument doc3 = (SpreadsheetDocument) registry.getDocument("SHEET");
        doc3.setDetails("sales_data_q1.xlsx", 1000, 20);
        doc3.open();
        System.out.println(doc3);

        PdfDocument doc4 = (PdfDocument) registry.getDocument("PDF");
        doc4.setDetails("summary_report.pdf", "Acme Corp", 30);
        doc4.open();
    }
}