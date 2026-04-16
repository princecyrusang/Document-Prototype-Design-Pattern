public class Main {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        // 1. PDF
        PdfDocument pdf1 = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150);
        pdf1.open();
        System.out.println(pdf1);

        // 2. Text
        TextDocument txt = registry.createText("meeting_notes.txt", "UTF-8", 250);
        txt.open();
        System.out.println(txt);

        // 3. Spreadsheet
        SpreadsheetDocument sheet = registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        sheet.open();
        System.out.println(sheet);

        // 4. Second PDF (Cloned from prototype - no constructor output)
        PdfDocument pdf2 = registry.createPdf("summary_report.pdf", "Acme Corp", 30);
        pdf2.open();
    }
}