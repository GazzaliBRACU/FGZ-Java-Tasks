// Version: 1.0
// Set A
// Lab Quiz 4: Book
// Scheduled: 9th July'24; Tue 11 AM

public class Book {
    // Fields
    private String title;
    private String status = "available";
    private String isbn;

    public void setTitle(String title) {
        if (isbn != null) {
            this.title = title;
        }
        else {
            System.out.println("Please set ISBN first.");
        }
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public void updateStatus(String newStatus) {
        if (status.equals("available") || newStatus.equals("available")){
            status = newStatus;
        }
        else {
            System.out.println(this.title + " won't be " + newStatus + " since it is currently " + status + ".");
        }
    }

    public void printStatus() {
        if (isbn == null) {
            System.out.println("Please set ISBN first.");
        } else {
            System.out.println(title + " with ISBN " + isbn + " is currently " + status + ".");
        }
    }
}
