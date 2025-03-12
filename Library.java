import java.util.ArrayList;
import java.util.List;

public class Library{
    private static Library instance;
    private final List<Item> items;
    private Library(){
        items = new ArrayList<>();
    }
    public static Library getInstance(){
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void listAvailableItems(){
        //if library is empty
        if (items.isEmpty()) {
            System.out.println("The library is empty.");
            return;          
        }

        System.out.println("Available items in the library");
        for (Item item : items) {
            if ((item instanceof Book book && !book.isBorrowed()) || item instanceof Magazine) {
                System.out.println("- " + item.getTitle() + "  " + item.getPublicationYear());
            }
        }
    }
    public Item findItemByTitle(String title){
        for (Item item : items) {
            //compare titles and find item
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Item: " + item.getTitle() + "  " + item.getPublicationYear());
                return item;
            }
        }
        System.out.println("No item found with title: " + title);
        return null;
    }
}