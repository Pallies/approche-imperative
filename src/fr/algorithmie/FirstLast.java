package fr.algorithmie;

public class FirstLast {
	static int[] array1 = {1, 15, -3, 8, 2, 3, 0, 14, -4} ;
	static int[] array2 = {3, 15, -3, 8, 7, 4, 3} ;
	static int[] array3 = {1, 15, -3, 8, 0, 14, 6} ;
	static int[] array4 = {} ;
	public static void main(String[] args) {
		System.out.println(" reponse : "+ controlFirstLast(array1));
		System.out.println(" reponse : "+ controlFirstLast(array2));
		System.out.println(" reponse : "+ controlFirstLast(array3));
		System.out.println(" reponse : "+ controlFirstLast(array4));

	}
	public static boolean controlFirstLast(int[] array) {
		return array.length > 0 && array[0] ==  array[array.length-1];
	}

}
