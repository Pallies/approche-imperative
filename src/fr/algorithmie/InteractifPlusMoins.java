package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifPlusMoins {

	static Scanner scanner;
	static int nbMystic = (int) Math.round(Math.random() * 100);

	public static void main(String[] args) {

		int result = 0;
		while (nbMystic != result) {
			try {
//				entrée clavier
				scanner = new Scanner(System.in);
				System.out.println("Veuillez entrez un chiffre entre 1 et 100 ");
				result = scanner.nextInt();
				
//				affichage de la réponse
				if (result == 0) {
					System.out.println("Seulement pour ceux qui triche ^^ " + nbMystic);
				} else {
					plusMoins(result);
				}
				
//				gestion des erreurs
			} catch (InputMismatchException e) {
				System.out.println(" votre caractère " + scanner.next() + " n'est pas valide");
			}
		}
//		resultat
		System.out.println(" ************************************************************* ");
		System.out.println(" * ");
		System.out.println(" * Félicitation le chiffre mystère était : " + nbMystic  );
		System.out.println(" * ");
		System.out.println(" ************************************************************* ");
	}

	public static void plusMoins(int nb) {
		if (nb < nbMystic) {
			System.out.println("Votre chiffre est plus bas que le chiffre mystère");
		} else if (nb > nbMystic) {
			System.out.println("Votre chiffre est plus élevé que le chiffre mystère");
		}
	}

}
