package kgcoding.challenge5.library;

public class LibraryItem {
    private String itemID;
    private String title;
    private String author;
    private boolean isOccupied;

    public LibraryItem(String itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
        this.isOccupied = false;
    }

    @Override
    public String toString() {
        return "LibraryItem {\n" +
                "\titemID='" + itemID + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                "}";
    }

    public void checkout(){
        if (isOccupied){
            System.out.println("Sorry you cannot checkout this book..");
        } else {
            isOccupied = true;
            System.out.println("Hurray! Enjoy your book..");
        }
    }

    public void returnItem(){
        if (isOccupied){
            System.out.println("Item returned successfully..");
            isOccupied = false;
        } else {
            System.out.println("This book is not occupied by you..");
        }

    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
