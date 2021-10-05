package fr.algorithmie;

interface FirstLastLambda{ boolean apply (int arr[]);}
public class FirstLast6 {
	static int[] array1 = {1, 15, -3, 8, 2, 3, 0, 14, -4} ;
	static int[] array2 = {6, 15, -3, 8, 7, 4, -4} ;
	static int[] array3 = {1, 15, -3, 8, 0, 14, 6} ;
	static int[] array4 = {} ;
	 
	static FirstLastLambda firstLast = array->array.length > 0 && (array[0] == 6 || array[array.length-1] == 6);
	
	public static void main(String[] args) {
		System.out.println(" reponse : "+ controlFirstLast6(array1));
		System.out.println(" reponse : "+ controlFirstLast6(array2));
		System.out.println(" reponse : "+ controlFirstLast6(array3));
		System.out.println(" reponse : "+ controlFirstLast6(array4));
		System.out.println("test lambda function");
		System.out.println(" reponse : "+ firstLast.apply(array1) );
		System.out.println(" reponse : "+ firstLast.apply(array2));
		System.out.println(" reponse : "+ firstLast.apply(array3));
		System.out.println(" reponse : "+ firstLast.apply(array4));
	
	}
	public static boolean controlFirstLast6(int[] array) {
		return array.length > 0 && (array[0] == 6 || array[array.length-1] == 6) ;
	}

}
