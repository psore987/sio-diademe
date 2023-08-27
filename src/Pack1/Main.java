package Pack1;

/** Cette classe est destinée à tester toutes les méthodes des classes Main et ShoppingCart
 * Elle ne comporte que des affichages qui montrent le bon fonctionnement des méthodes
 * des autres classes.
 * 
 * @author Pascal
 * @version 1.0
 * 
 */
public class Main {

    /**
     * Cette méthode est le point d'entrée du programme.
     * Elle effectue des tests sur les méthodes des classes Item et ShoppingCart,
     * en affichant les résultats pour montrer leur bon fonctionnement.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
	public static void main(String[] args) {
		
		System.out.println("---------------- Exercice 1 ------------------");
		Item item = new Item("corn flakes", 505,1000);
		System.out.println(item.getPrice()); // affiche: 500
		System.out.println(item.getName()); // affiche: corn flakes
		System.out.println(item);
	
		System.out.println("---------------- Exercice 2 ------------------");
		ShoppingCart cart = new ShoppingCart();

		//Exemple 1
        Item item1 = new Item("Pomme", 100, 1500);
        Item item2 = new Item("Banane", 150, 1000);

        cart.addItem(item1);
        cart.addItem(item2);
        
        System.out.println(".......................Exemple 1 .........................");
        System.out.println("Nombre d'articles dans le panier : " + cart.itemCount());
        System.out.println("Prix total du panier : " + cart.totalPrice()/100.0 + " €");

        if (cart.removeItem(item1) == false) {
        	System.out.println("L'article n'existe pas");
        }else {
        	System.out.println("l' article " + item1 + " a été supprimé");
        }
        
        System.out.println("Si j'essaie de supprimer un article qui n'existe pas ...");
        if (cart.removeItem(item1) == false) {
        	System.out.println("L'article n'existe pas !!! ");
        }else {
        	System.out.println("l' article " + item1 + " a été supprimé");
        }
        
        

        System.out.println("Nombre d'articles dans le panier après suppression : " + cart.itemCount());
        System.out.println("Prix total du panier après suppression : " + cart.totalPrice()/100.0 + " €");
        
        //Exemple 2
        System.out.println("........................Exemple 2 .........................");
        Item item3 = new Item("corn flakes", 505, 500);
        Item item4 = new Item("caviar", 50000, 1000);
        Item item5 = new Item("water", 100, 1000);
        Item item6 = new Item("Pack coca",900,5000);
 //       ShoppingCart cart = new ShoppingCart();
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        
        System.out.println("Nombre d'articles présents : " + cart.itemCount()); // affiche: 4 
        System.out.println("Pour un prix total de " + cart.totalPrice()/100.0); // affiche: 50750
        
        System.out.println("---------------- Exercice 3 ------------------");
        System.out.println("Poids total du panier : "+ cart.getweightCart()/1000.0); // Affiche 3500 pour l'instant
        System.out.println("on ajoute 1 pack de coca de 5 kg");
        cart.addItem(item6);
        System.out.println("Poids total du panier : "+ cart.getweightCart()/1000.0); // Affiche 8500 pour l'instant    
        System.out.println("on ajoute encore 1 pack de coca de 5 kg");
        cart.addItem(item6);
        System.out.println("Poids total du panier inchangé : "+ cart.getweightCart()/1000.0); // impossible car >10kg. Erreur!
        System.out.println("on enlève 1 pack de coca de 5 kg");
        cart.removeItem(item6);
        System.out.println("Poids total du panier : "+ cart.getweightCart()/1000.0); // Affiche 3500 pour l'instant
        System.out.println("on ajoute encore 1 pack de coca de 5 kg");
        cart.addItem(item6);
        System.out.println("Poids total du panier final : "+ cart.getweightCart()/1000.0); // Affiche 9500 pour l'instant
        
        System.out.println(cart);
        System.out.println("\n---------------- Exercice 4 ------------------");       
        // on crée un nouveau panier avec 3 articles
        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItem(item1);
        cart2.addItem(item2);
        cart2.addItem(item5);
        System.out.println(cart);
        System.out.println(cart2);
        
    }
	}
