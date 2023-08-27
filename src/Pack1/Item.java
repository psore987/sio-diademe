package Pack1;
/**
 * La classe Item définit la structure d'un élément unitaire qui sera ensuite acheté et placé dans un panier.
 */

public class Item {
	
	// variables
	private final String name;
	private final long price;
	private final long weight;
	
	//constructeur	
	public Item(String name, long price, int weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	/** Accesseurs : pas de mutateurs (setter) puisque les variables sont en "Final".
	 * 	Ils ne peuvent être modifiées après leur création !
	 */
	


	public String getName() {
		return name;
	}

	public long getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}



	//méthode toString
	@Override
	public String toString() {
		return name + " prix= " + String.format("%.2f", price/100.0) + " €\n";
	}
	
	
}
