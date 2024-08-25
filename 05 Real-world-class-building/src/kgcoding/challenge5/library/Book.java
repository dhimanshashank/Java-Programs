package kgcoding.challenge5.library;

public class Book extends LibraryItem{
    private String iSBN;

    public Book(String itemID, String title, String author, String iSBN) {
        super(itemID, title, author);
        this.iSBN = iSBN;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", iSBN='" + iSBN + '\'' +
                '}';
    }
}
