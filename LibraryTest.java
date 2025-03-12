public class LibraryTest{
    public static void main(String[] args) {
        Library library = Library.getInstance();
        //add two books and one magazine
        library.addItem(LibraryItemFactory.createItem("book", "The Little Prince", 1943, "Antoine de Saint-Exupéry"));
        library.addItem(LibraryItemFactory.createItem("book", "The Hobbit", 1937, "J. R. R. Tolkien"));
        library.addItem(LibraryItemFactory.createItem("magazine", "National Geographic", 1888, "1234"));

        //borrow
        System.out.println("\nBorrowing a book: ");
        Item item = library.findItemByTitle("The Hobbit");
        if (item instanceof Book book) {
            if (!book.isBorrowed()) {
               book.borrowItem("student A"); 
            } else {
                System.out.println("This book has been borrowed.");
            }     
        }

        System.out.println("\nList of available items: ");
        library.listAvailableItems();

        //return
        System.out.println("\nReturning a book: ");
        item = library.findItemByTitle("The Hobbit");
        if (item instanceof Book book) {
            if (book.isBorrowed()) {
               book.returnItem();
            } else {
                System.out.println("This book is not borrowed.");
            }     
        }

        //show list
        System.out.println("\nList of available items: ");
        library.listAvailableItems();

        //search by title
        System.out.println("\nSearching book by title: 'The Little Prince'");
        library.findItemByTitle("The Little Prince");
        System.out.println("\nSearching another book by title: 'Harry Potter'");
        library.findItemByTitle("Harry Potter");
    }
}