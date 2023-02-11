package esercizioNegozio;
public abstract class Products {
    protected double weight;
    protected double cost;

    public Products(){

    }
    public Products(double weight, double cost){
        this.weight = weight;
        this.cost = cost;
    }
    public double getCost() {

        return cost;
    }
    public double getWeight() {

        return weight;
    }
}
