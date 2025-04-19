public class PdfDocument implements Document{
    private String fileName;
    private String author;
    private int pageCount;
    private String name;

    public PdfDocument(String fileName, String author, int pageCount, String name){
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
        this.name = name;
        System.out.println("Creating a PDF Document prototype.");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public PdfDocument clone() {
        try{
            return (PdfDocument)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not supported");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + getFileName() + " by " + getAuthor() + " (" + getPageCount() + " pages)");
    }

    @Override
    public String getType() {
        return "Type: PDF, File: " + getFileName() + ", Author: " + getAuthor() + ", Pages: " + getPageCount() ;
    }
}
