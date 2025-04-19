public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry documentRegistry = new DocumentRegistry();

        System.out.println();

        Document pdf =  documentRegistry.createPdfDocument("annual_report_2024","Acme Corp", 150);
        pdf.open();
        System.out.println(pdf.getType());

        System.out.println();

        Document text = documentRegistry.createTextDocument("meeting_notes.txt","UTF-8", 250);
        text.open();
        System.out.println(text.getType());

        System.out.println();

        Document spreadsheet = documentRegistry.createSpreadsheetDocument("sales_data_q1.xlsx",1000,20);
        spreadsheet.open();
        System.out.println(spreadsheet.getType());

        System.out.println();

        Document newPdf = documentRegistry.createPdfDocument("summary_report.pdf","Acme Corp", 30);
        newPdf.open();
    }
}
