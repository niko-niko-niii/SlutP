public class book {
    protected String name; //book name
    protected int releaseDate; //release date
    protected String author; //author of the book

    book(String name, int releaseDate,String author){
        this.name=name;
        this.releaseDate=releaseDate;
        this.author=author;
    }
    public String getName() {return name;}
    public int getReleaseDate() {return releaseDate;}
    public String getAuthor() {return author;}
     
}
