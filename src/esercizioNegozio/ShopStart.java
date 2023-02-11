package esercizioNegozio;
public class ShopStart {
    public static void main(String[] args) {
        Book b1 = new Book(200,20,"ISBN 001","Harry Potter","Fantasy", 400);
        Book b2 = new Book(200,20,"ISBN 002","Poeti","Poesia", 100);
        Book b3 = new Book(300,20,"ISBN 003","Amore","Romanzi", 300);
        Book b4 = new Book(450,20,"ISBN 004","Morti","Crime", 200);
        Book b5 = new Book(200,20,"ISBN 001","Harry Potter","Fantasy", 400);
        DVD d1 = new DVD(50,20,"Candy","Pop", 3.5);
        DVD d2 = new DVD(50,25,"Soul","Jazz", 3.1);
        DVD d3 = new DVD(50,15,"ROCK","Rock", 2.8);
        Rackets r1 = new Rackets(800,90,"Marca1","Rotonda");
        Rackets r2 = new Rackets(900, 120,"Marca1","Diamante");
        Rackets r3 = new Rackets(1000,150,"Marca1","Goccia");
        Shop inventory = new Shop();
        inventory.addProducts(b1);
        inventory.addProducts(b2);
        inventory.addProducts(b3);
        inventory.addProducts(b4);
        inventory.addProducts(b5);
        inventory.addProducts(d1);
        inventory.addProducts(d3);
        inventory.addProducts(r1);
        inventory.addProducts(r2);
        inventory.addProducts(r3);
        inventory.countDropRacketsHigherPrice();
        System.out.println("Nell'inventario ci sono: " +inventory.countProducts() + " prodotti.");
        System.out.println("Il peso totale dei prodotti nel mio inventario é "+ inventory.sumWeight()+ "grammi");
        System.out.println("Il prodotto più costoso nel mio inventario è: " + inventory.whichHigherCost());
        System.out.println("Ci sono: " + inventory.countFantasyBooks() + " libri Fantasy");
    }
}
