public class Book extends Item implements IBorrowable{
    private String author;
    private String ISBN;
    private String borrower = "";

    public Book(String author, String title, int publicationYear){
        super(title, publicationYear);
        this.author = author;
        System.out.println("Added item: " + title + "_" + publicationYear + "_" + author);
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    @Override
    public void borrowItem(String borrower){
        this.borrower = borrower;
    }
    @Override
    public void returnItem(){
        borrower = "";
    }
    @Override
    public boolean isBorrowed(){
        return !borrower.isEmpty();
    }
} 