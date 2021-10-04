package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int index;

//		Afficher l’ensemble des éléments du tableau grâce à une boucle
		System.out.println("Afficher l’ensemble des éléments");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
//		Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		System.out.println("\nAfficher l’ensemble des éléments inversés");
		index = array.length - 1;
		while (index >= 0) {
			System.out.print(array[index]+" ");
			index-=1;
		}
//		Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
		System.out.println("\nCréer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy");
		int[] arrayCopy;
		arrayCopy =array;
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i]+" ");
		}
	}

}
