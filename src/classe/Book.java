package classe;

public class Book {
	/*Définir une classe Livre avec les attributs suivants : id, titre, auteur, prix.
	• Définir les accesseurs aux différents attributs de la classe.
	• Définir un constructeur permettant d’initialiser les attributs d'un objet livre par des
	valeurs saisies par l’utilisateur, sachant que l’attribut id est auto-incrémenté lors de la
	création d’un nouveau livre (le id d’un livre n’est pas saisi par l’utilisateur).
	• Définir la méthode toString() permettant d’afficher les informations du livre en cours.
	*/
	
	private int idBook =-1;
	private String titre ="";

	private String auteur ="";
	private int prix =0;
	private static int nbrDinstance = 0;
	/**
	 * 
	 * @param titre
	 * @param auteur
	 * @param prix
	 * 
	 * le calcul de l'id et automatique
	 */
	public Book( String titre, String auteur, int prix) {
		this.nbrDinstance++;
		this.idBook = this.nbrDinstance;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
/**
 * affiche le l'auteur le prix et le titre du livre
 * 
 */
	public String toString() {
		return " le prix du livre " + titre + " de l'auteur=" + auteur + " avec la reference=> "+ idBook+" est de "+ prix + " €";
	}
	
	public int getIdBook() {
		return idBook;
	}
	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	
	
}
