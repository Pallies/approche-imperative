package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		
		System.out.println("affichage du tableau");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("affichage du tableau en inversé");
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
		System.out.println("affichage du tableau filtré supérieur à 3");
		for (int i = 0; i < array.length; i++) {
			if(array[i]>3) {System.out.println(" supérieur à 3 :"+array[i]);}
		}
		
		System.out.println("affichage du tableau filtré entiers pairs");
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0) {System.out.println("Les entiers pairs :"+array[i]);}
		}
		System.out.println("affichage du tableau filtré entiers impairs");
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==1) {System.out.println("Les entiers impairs :"+array[i]);}
		}
	}
}
