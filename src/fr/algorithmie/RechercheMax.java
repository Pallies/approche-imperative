package fr.algorithmie;

import java.util.ArrayList;

public class RechercheMax {
	static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	static ArrayList<Integer> arrayInteger = new ArrayList<Integer>();

	public static void main(String[] args) {
		int max = convertArrayForMax();
		int max2 = afficheMax();

		System.out.println("method Stream " + max);
		System.out.println("method array " + max2);

	}

	/**
	 * recherchela valeur la plus grande avec un stream().max
	 * 
	 * @return int max
	 */
	public static Integer convertArrayForMax() {
		int indexArray = 0;
		while (indexArray < array.length) {
			arrayInteger.add(array[indexArray]);
			indexArray++;
		}

		return arrayInteger.stream().max(Integer::compare).get();
	}

	/**
	 * recherchela valeur la plus grande 
	 * avec une boucle while
	 * @return int max
	 */
	public static int afficheMax() {
		int indexArray = 0;
		int max = array[0];
		while (indexArray < array.length) {
			if (array[indexArray] > max) {
				max = array[indexArray];
			}
			indexArray++;
		}
		return max;
	}
}
