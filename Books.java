class Book{
    private String title;
    private String author;
    private int numPages;
    public Book(String t, String au, int n){
        title = t;
        author = au;
        numPages = n;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public int getPages(){
        return numPages;
    }
}
public class Books{
    public static void main(String[] args){
        Book books = new Book("The Hobbit", "J.R.R Tolkeit", 295);
        System.out.println("Book Information:");
        System.out.println("Author: "+books.getauthor());
        System.out.println("Book Title: "+books.gettitle());
        System.out.println("Pages: "+books.getPages());
    }
}