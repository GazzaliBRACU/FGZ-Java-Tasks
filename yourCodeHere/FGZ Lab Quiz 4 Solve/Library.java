public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Baby Shark");
        book1.printStatus();  // Should prompt to set ISBN first
        book1.setISBN("9876543210");
        book1.setTitle("Baby Shark");
        book1.printStatus();
        book1.updateStatus("borrowed");
        System.out.println("After update 1:");
        book1.printStatus();
        book1.updateStatus("borrowed");
        System.out.println("After update 2:");
        book1.printStatus();
        book1.updateStatus("reserved");
        book1.updateStatus("borrowed");
        System.out.println("After update 3:");
        book1.printStatus();

        System.out.println("*********************************");
        
        Book book2 = new Book();
        book2.setISBN("0123456789");
        book2.setTitle("Humpty Dumpty");
        book2.printStatus();
        book2.updateStatus("reserved");
        System.out.println("After update 4:");
        book2.printStatus();
        book2.updateStatus("borrowed");  // Should not allow as it's reserved
    }
}
