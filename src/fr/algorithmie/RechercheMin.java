package fr.algorithmie;

import java.util.ArrayList;

public class RechercheMin {
	static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	static ArrayList<Integer> arrayInteger = new ArrayList<Integer>();

	public static void main(String[] args) {
		int min = convertArrayForMin();
		int min2 = afficheMin();

		System.out.println("method Stream " + min);
		System.out.println("method array " + min2);

	}

	/**
	 * recherche la valeur la plus petite avec un stream().min
	 * 
	 * @return int min
	 */
	public static Integer convertArrayForMin() {
		int indexArray = 0;
		while (indexArray < array.length) {
			arrayInteger.add(array[indexArray]);
			indexArray++;
		}

		return arrayInteger.stream().min(Integer::compare).get();
	}

	/**
	 * recherchela valeur la plus petite 
	 * avec une boucle while
	 * @return int min
	 */
	public static int afficheMin() {
		int indexArray = 0;
		int min = array[0];
		while (indexArray < array.length) {
			if (array[indexArray] < min) {
				min = array[indexArray];
			}
			indexArray++;
		}
		return min;
	}
}
