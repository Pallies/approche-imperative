package fr.algorithmie;

public class FirstLast6 {
	static int[] array1 = {1, 15, -3, 8, 2, 3, 0, 14, -4} ;
	static int[] array2 = {6, 15, -3, 8, 7, 4, -4} ;
	static int[] array3 = {1, 15, -3, 8, 0, 14, 6} ;
	static int[] array4 = {} ;
	public static void main(String[] args) {
		System.out.println(" reponse : "+ controlFirstLast6(array1));
		System.out.println(" reponse : "+ controlFirstLast6(array2));
		System.out.println(" reponse : "+ controlFirstLast6(array3));
		System.out.println(" reponse : "+ controlFirstLast6(array4));

	}
	public static boolean controlFirstLast6(int[] array) {
		return array.length > 0 && (array[0] == 6 || array[array.length-1] == 6) ;
	}

}
