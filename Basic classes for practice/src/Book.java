public class Book {
    static int totalBooks;
    String title, author, isbn;
    boolean isBorrowed;

    // Default total number of books will be zero
    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    // Constructor building
    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        isBorrowed = false;
    }

    // Another constructor building with only unique ID of the book
    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
        isBorrowed = false;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("The book is not available... Try again later...");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy your book " + this.title +"...");
        }
    }

    void returnBook(){
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("The book is returned and please leave a review...");
        }
        else {
            System.out.println("Book is already in the library....");
        }
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design Of Things", "Author");
        Book myBook = new Book("2");

        System.out.println(Book.getTotalBooks());

        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        myBook.returnBook();
        myBook.returnBook();
    }
}
