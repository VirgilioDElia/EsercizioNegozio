package esercizioNegozio;
public class DVD extends Products {
    private String title;
    private String category;
    private double duration;
    public DVD(){

    }
    public DVD(double weight, double cost, String title, String category, double duration){
        super(weight,cost);
        this.title = title;
        this.category = category;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public double getDuration() {
        return duration;
    }
}

