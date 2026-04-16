public interface Document extends Cloneable {
    Document clone();
    void open();
    String getType();
}

class PdfDocument implements Document {
    private String fileName, author;
    private int pageCount;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    public void setProperties(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public Document clone() {
        try {
            // super.clone() copies the object WITHOUT calling the constructor again
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
        return "Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount + "\n";
    }
}

class TextDocument implements Document {
    private String filePath, encoding;
    private int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    public void setProperties(String filePath, String encoding, int wordCount) {
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
        return "Type: Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount + "\n";
    }
}

class SpreadsheetDocument implements Document {
    private String name;
    private int rows, cols;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.\n");
    }

    public void setProperties(String name, int rows, int cols) {
        this.name = name;
        this.rows = rows;
        this.cols = cols;
    }

    @Override
    public Document clone() {
        try {
            return (SpreadsheetDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + name + " (" + rows + " rows, " + cols + " columns)");
    }

    @Override
    public String getType() { return "Spreadsheet"; }

    @Override
    public String toString() {
        return "Type: Spreadsheet, Name: " + name + ", Rows: " + rows + ", Columns: " + cols + "\n";
    }
}