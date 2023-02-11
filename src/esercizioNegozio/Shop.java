package esercizioNegozio;
import esercizioNegozio.Rackets;
import esercizioNegozio.Rackets;
import esercizioNegozio.Rackets;
import java.util.ArrayList;
public class Shop {
    private ArrayList<Products> inventory;
    private ArrayList<Rackets> inventoryRackets;
    public Shop(){
        this.inventory = new ArrayList<>();
        this.inventoryRackets = new ArrayList<>();
    }
    public void addProducts(Products p){
       inventory.add(p);
    }
    public int countProducts(){
        return inventory.size();
    }
    public double sumWeight(){
        double totalWeight=0;
        for(Products p : inventory) {
            totalWeight = totalWeight + p.getWeight();
        }
        return totalWeight;
    }
    public int countFantasyBooks(){
        int numberFantasyBook = 0;
        for(Products p: inventory) {
            if(p instanceof Book){
                Book b = (Book)p;
                if (b.getCategory().equalsIgnoreCase("Fantasy")) {
                    numberFantasyBook++;
                }
            }
        }
        return numberFantasyBook;
    }
    public String whichHigherCost() {
        Products higherCost = inventory.get(0);
        for (int i = 1; i < inventory.size(); i++) {
            if (inventory.get(i).getCost() > higherCost.getCost()) {
                higherCost = inventory.get(i);
            }
            if (higherCost instanceof Book) {
                Book higherBook = (Book) higherCost;
                return higherBook.getBookTitle();
            } else if (higherCost instanceof DVD) {
                DVD higherDVD = (DVD) higherCost;
                return higherDVD.getDVDTitle();
            } else {
                Rackets higherracket = (Rackets) higherCost;
                return higherracket.getBrand();
            }
        }

        return null;
    }
    public void countDropRacketsHigherPrice(){
        for(Products p : inventory){
            if(p instanceof Rackets){
                Rackets rackets = (Rackets)p;
                if(rackets.getType().equalsIgnoreCase("Goccia") && rackets.getCost() >= 100.0){
                    inventoryRackets.add(rackets);
                }
            }
        }
        for(Rackets rackets : inventoryRackets){
            System.out.println(rackets.getBrand());
        }
    }
}



