package ie.atu.collections;

public class Book {
    private String title;
    private String author;
    private int price;
    public Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;        
    }
    public void setTitle(String x){
        title = x;
    }
    public void setAuthor(String x){
        author = x;
    }
    public void setPrice(int x){
        price = x;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=" + price + "}";
    }
    @Override
    public boolean equals(Object y){
        if (this == y) return true;
        if (y == null || getClass() != y.getClass()) return false;
        Book book = (Book) y;
        return author == book.author && title.equals(book.title);
    }

}
