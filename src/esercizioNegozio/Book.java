package esercizioNegozio;
public class Book extends Products {
    private String ISBN;
    private String title;
    private String category;
    private int pages;
    public Book(){
    }
    public Book(double weight, double cost,String ISBN ,String title, String category,int pages){
        super(weight,cost);
        this.ISBN = ISBN;
        this.title = title;
        this.category = category;
        this.pages = pages;
    }
    public String getISBN(){
        return ISBN;
    }
    public String getBookTitle(){
        return title;
    }
    public String getCategory(){

        return category;
    }
    public int getPages(){
        return pages;
    }
}
