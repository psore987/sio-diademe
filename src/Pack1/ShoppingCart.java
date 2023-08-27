package Pack1;
import java.util.ArrayList;

/** Cette classe permet de gérer le panier d'achat des consommateurs. Il sera constitué de plusieurs Items.
 * La structure utilisée sera un ArrayList.
 */

public class ShoppingCart {

	private static int lastCartId = 0; // Variable statique pour le dernier identifiant
	private static double weightCart = 0;
	private int numCart;
	private ArrayList<Item> items;

    //constructeur
    public ShoppingCart() {
    	numCart = ++lastCartId;
        items = new ArrayList<>();
    }
    
    // accesseurs
    public int getnumCart() {
        return numCart;
    }   
    
    public double getweightCart() {
        return weightCart;
    }   
    
    // méthodes
    public void addItem(Item item) {
        if (weightCart + item.getWeight() > 10000 ) {
        	System.out.println("erreur, ajout impossible");
//        	 throw new IllegalStateException("Poids total du panier dépasse la limite de 10 kg. Ajout impossible !");
        } else {
    	   	items.add(item);
    	   	weightCart += item.getWeight();
        }
    }

 	public boolean removeItem(Item item) {
        weightCart -= item.getWeight();
 		return items.remove(item);        
    }

    public int itemCount() {
        return items.size();
    }

    public double totalPrice() {
    	// complexité O(n)
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    
//    public double totalWeight() {
//    	double total = 0;
//        for (Item item : items) {
//            total += item.getWeight();
//        }
//        return total;
//    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Panier " + numCart + ":\n");
        
        for (Item item : items) {
            stringBuilder.append(item.toString());
        }
        
        stringBuilder.append("Prix total du panier: " + String.format("%.2f", totalPrice() / 100.0) + " €\n");
        stringBuilder.append("Poids total du panier: " + String.format("%.2f", getweightCart() / 1000.0) + " kg\n");
        
        return stringBuilder.toString();
    }

    
    
}
  