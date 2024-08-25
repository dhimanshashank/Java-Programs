package kgcoding.challenge5.library;

public class DVD extends LibraryItem{
    private int durationInSeconds;

    public DVD(String itemID, String title, String author, int durationInSeconds) {
        super(itemID, title, author);
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }
}
