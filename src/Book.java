public class Book {
    private String title;
    private String author;


    Book(String title,String author){
        this.author=author;
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Author:  "+author+"\n"+"Title:  "+title;
    }
}
