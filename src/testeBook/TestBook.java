package testeBook;

import java.util.Scanner;

import classe.Book;

public class TestBook {

	public static void main(String[] args) {
		
	
		int nbrBook =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez entrer le nbre de livre à gerer ");
		nbrBook = sc.nextInt();
		
		Book[] livres = new Book[nbrBook];
		
		for(int i =0; i<nbrBook;i++) {
			sc.nextLine();
			System.out.println("veuillez entrer le titre du livre "+(i+1));
			String titre = sc.nextLine();
			System.out.println("veuillez entrer l'auteur du livre "+(i+1));
			String auteur = sc.nextLine();
			//sc.nextLine();
			System.out.println("veuillez entrer  le prix du livre "+(i+1));
			int prix = sc.nextInt();
			
			Book livre = new Book(titre, auteur, prix);
			livres[i] = livre;
		}
		for(int i =0; i<nbrBook;i++) {
			System.out.println(livres[i].toString());
			
		}
		
		System.out.println( "le nombre de livres est de: " + livres[0].getCompteur());
		sc.close();

	}

}
