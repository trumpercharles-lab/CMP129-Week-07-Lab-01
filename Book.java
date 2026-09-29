public class Book {
    private String title,author,ISBN;
    private int availability;

    //Constructor

    public Book(String title, String author, String ISBN, int availability){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.availability=availability;
    }

    //Getter Methods

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return ISBN;
    }

    public int getAvailability(){
        return availability;
    }

    //Mutator Methods

    public void setTitle(String title){
        this.title=title;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }

    public void setAvailability(int availability){
        this.availability=availability;
    }

}
