package kgcoding.challenge5.library;

public class Magazine extends LibraryItem{
    private String issueNumber;

    public Magazine(String itemID, String title, String author, String issueNumber) {
        super(itemID, title, author);
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }
}
