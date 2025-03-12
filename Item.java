public class Item{
    protected String title;
    protected int publicationYear;

    public Item(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public String getTitle(){
        return title;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
}