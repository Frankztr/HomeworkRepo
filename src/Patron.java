public class Patron {
    private String name;
    private Book book1;
    private Book book2;
    private Book book3;
    Patron(String name){
        this.name=name;
    }
    public void borrow(Book a,int num){
        if(num==1){
            book1=a;
        }else if(num==2){
            book2=a;
        }else if(num==3){
            book3=a;
        }
    }
    public boolean hasBorrowed(String title){
        if(title.equals(book1.getTitle())){
            return true;
        }else if(title.equals(book2.getTitle())){
            return true;
        }else if(title.equals(book3.getTitle())){
            return true;
        }else{
            return false;
        }
    }
    public void returnBook(int num){
        if(num==1){
            book1=null;
        }else if(num==2){
            book2=null;
        }else if(num==3){
            book3=null;
        }
    }

    public Book getBook1() {
        return book1;
    }

    public Book getBook2() {
        return book2;
    }

    public Book getBook3() {
        return book3;
    }

    public String getName() {
        return name;
    }

    public void setBook1(Book book1) {
        this.book1 = book1;
    }

    public void setBook2(Book book2) {
        this.book2 = book2;
    }

    public void setBook3(Book book3) {
        this.book3 = book3;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                ", book1=" + book1 +
                ", book2=" + book2 +
                ", book3=" + book3 +
                '}';
    }
}
