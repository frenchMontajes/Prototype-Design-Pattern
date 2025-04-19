public class DocumentRegistry {
    private PdfDocument pdfPrototype = new PdfDocument("Filename", "User", 0,"Unknown");
    private TextDocument textDocumentPrototype = new TextDocument("Filepath","Encoding",0);
    private SpreadsheetDocument spreadsheetDocumentPrototype = new SpreadsheetDocument("Sheetname",0,0);

    public PdfDocument createPdfDocument(String fileName, String author, int pageCount) {
        PdfDocument pdfDocument = pdfPrototype.clone();
        pdfDocument.setFileName(fileName);
        pdfDocument.setAuthor(author);
        pdfDocument.setPageCount(pageCount);
        return pdfDocument;
    }

    public TextDocument createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument textDocument = textDocumentPrototype.clone();
        textDocument.setFilePath(filePath);
        textDocument.setEncoding(encoding);
        textDocument.setWordCount(wordCount);
        return textDocument;
    }

    public SpreadsheetDocument createSpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument spreadsheetDocument = spreadsheetDocumentPrototype.clone();
        spreadsheetDocument.setSpreadsheetName(spreadsheetName);
        spreadsheetDocument.setRowCount(rowCount);
        spreadsheetDocument.setColumnCount(columnCount);
        return spreadsheetDocument;
    }
}
