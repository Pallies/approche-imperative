package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		afficheSuperieurA3(array);
		affichePair(array);
		afficheIndexPair(array);
		afficheImpair(array);
	}

	/**
	 * affiche les nombres du tableau
	 * Si ils sont supérieurs à 3
	 * @param int [] array
	 */
	public static void afficheSuperieurA3(int[] array) {
		int indexArray = 0;
		while (indexArray < array.length) {
			if (array[indexArray] > 3) {
				System.out.println(array[indexArray]);
			}
			indexArray++;
		}
	}

	/**
	 * affiche les nombres du tableau 
	 * Si ils sont pairs
	 * @param int[] array
	 */
	public static void affichePair(int[] array) {
		int indexArray = 0;
		while (indexArray < array.length) {
			if (array[indexArray] % 2 == 0) {
				System.out.println(array[indexArray]);
			}
			indexArray++;
		}
	}
	
	/**
	 * affiche les nombre du tableau
	 * si ils ont un index pair
	 * @param int[] array
	 */
	public static void afficheIndexPair(int[] array) {
		int indexArray=0;
		while(indexArray< array.length) {
			if(indexArray%2==0) {
				System.out.println(array[indexArray]);
			}
			
			indexArray++;
		}
	}
	/**
	 * affiche les nombres du tableau
	 * Si ils sont impairs
	 * @param int[] array
	 */
	public static void afficheImpair(int[] array) {
		int indexArray=0; 
		while(indexArray< array.length) {
			if(array[indexArray]% 2 == 1) {
				System.out.println(array[indexArray]);
			}
			indexArray++;
		}
	}
}
