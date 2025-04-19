public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
        System.out.println("Creating a Text Document prototype.");
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public TextDocument clone() {
        try {
            return (TextDocument)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not supported");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + getFilePath() + " with encoding: " + getEncoding() + " (" + getWordCount() + " words)");
    }

    @Override
    public String getType() {
        return "Type: Text, File: " + getFilePath() + ", Encoding: " + getEncoding() + ", Words: " + getWordCount() ;
    }
}
