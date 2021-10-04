package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayCopy = new int[array.length];
//		copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
		System.out.println("arrayCopy mais dans l’ordre inverse");

//		Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
		for (int i = array.length-1; i >= 0; i--) {
			arrayCopy[(array.length-1)-i ] = array[i];
		}
		
//		Afficher l’ensemble des éléments des 2 tableaux
		System.out.println("Afficher l’ensemble des éléments des 2 tableaux");
		for (int i=0;i<array.length;i++) {
			System.out.println(" tableau ARRAY");
			System.out.println(array[i]+"\n");
			System.out.println(" tableau ARRAY COPY");
			System.out.println(arrayCopy[i]+"\n");
		}
	}
}
