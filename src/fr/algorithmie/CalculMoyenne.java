package fr.algorithmie;

import java.util.ArrayList;

public class CalculMoyenne {
	static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	static ArrayList<Integer> arrayInteger = new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println("moyenne via reduce " +moyenneFromReduce());
		System.out.println("moyenne :"+moyenne());
	}

	/**
	 * Calcul la moyenne via la methode reduce du stream.
	 * 
	 * @return int value or null (diviser == 0)
	 */
	public static int moyenneFromReduce() {
		int indexArray = 0;
		while (indexArray < array.length) {
			arrayInteger.add(array[indexArray]);
			indexArray++;
		}
		int reduceValue = arrayInteger.stream().reduce(0, (sub, el) -> sub + el);

		return (array.length != 0) ? reduceValue / array.length : null;
	}

	/**
	 * Calcul la moyenne via l'addition des valeurs divisé par le nombre
	 * 
	 * @return int value or null (diviser == 0)
	 */
	public static int moyenne() {
		int indexArray = 0;
		int reduceValue = 0;
		while (indexArray < array.length) {
			reduceValue += array[indexArray];
			indexArray++;
		}
		return (array.length != 0) ? reduceValue / array.length : null;
	}

}
