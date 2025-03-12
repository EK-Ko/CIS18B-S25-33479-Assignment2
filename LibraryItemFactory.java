public class LibraryItemFactory{
    public static Item createItem(String type, String title, int publicationYear, String extraData){
        if (type.equalsIgnoreCase("book")) {
            return new Book(extraData,title,publicationYear);
        } else if (type.equalsIgnoreCase("magazine")) {
            return new Magazine(Integer.parseInt(extraData),title,publicationYear);
        }else {
            return null;
        }
    }
}