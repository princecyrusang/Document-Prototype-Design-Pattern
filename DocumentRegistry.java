public class DocumentRegistry {
    // Order matters here to match your requested output sequence
    private final PdfDocument pdfProto = new PdfDocument();
    private final TextDocument textProto = new TextDocument();
    private final SpreadsheetDocument sheetProto = new SpreadsheetDocument();

    public PdfDocument createPdf(String file, String author, int pages) {
        PdfDocument clone = (PdfDocument) pdfProto.clone();
        clone.setProperties(file, author, pages);
        return clone;
    }

    public TextDocument createText(String path, String encoding, int words) {
        TextDocument clone = (TextDocument) textProto.clone();
        clone.setProperties(path, encoding, words);
        return clone;
    }

    public SpreadsheetDocument createSpreadsheet(String name, int rows, int cols) {
        SpreadsheetDocument clone = (SpreadsheetDocument) sheetProto.clone();
        clone.setProperties(name, rows, cols);
        return clone;
    }
}