public class Magazine extends Item{
    private int issueNumber;

    public Magazine (int issueNumber, String title, int publicationYear){
        super(title, publicationYear);
        this.issueNumber = issueNumber;
        System.out.println("Added item: " + title + "_" + publicationYear + "_" + issueNumber);
    }
    public int getIssueNumber(){
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber){
        this.issueNumber = issueNumber;
    }
}