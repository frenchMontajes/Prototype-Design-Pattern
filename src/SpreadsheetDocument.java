public class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadsheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        System.out.println("Creating a Spreadsheet Document Prototype.");
    }

    public String getSpreadsheetName() {
        return spreadsheetName;
    }

    public void setSpreadsheetName(String spreadsheetName) {
        this.spreadsheetName = spreadsheetName;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public SpreadsheetDocument clone() {
        try {
            return (SpreadsheetDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not supported");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + getSpreadsheetName() + " (" + getRowCount() + " rows, " + getColumnCount() + " columns");
    }

    @Override
    public String getType() {
        return "Type: Spreadsheet, File: " + getSpreadsheetName() + ", Rows: " + getRowCount() + ", Columns: " + getColumnCount() ;
    }
}
