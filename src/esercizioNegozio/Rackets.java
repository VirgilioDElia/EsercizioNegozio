package esercizioNegozio;
public class Rackets extends Products {
    private String brand;
    private String type;
    public Rackets(){
    }
    public Rackets(double weight, double cost, String brand, String type){
        super(weight,cost);
        this.brand = brand;
        this.type = type;
    }
    public String getBrand() {
        return brand;
    }
    public String getType() {
        return type;
    }

}
