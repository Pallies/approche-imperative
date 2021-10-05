package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		int index = 0;
		int[] nb = new int[10];
		Scanner scanner = null;
		System.out.println("Vous allez entrez 10 chiffres");

		while (index < 10) {
			try {
				if (index ==0) {
					System.out.println("Veuillez entrez votre premier chiffre entre 1 et 2 147 483 647 inclus ");
				}else {					
					System.out.println("Veuillez entrer "+(index+1)+"e"+"  chiffres entre 1 et 2 147 483 647 inclus");
				}
				scanner = new Scanner(System.in);
				nb[index] = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("votre caractère " + scanner.next()+ " n'est pas un nombre");
			}
			index++;
		}
		System.out.println(" le chiffre max est : "+ max(nb));

	}
	public static int max(int[] array) {
		int max = 0;
		for(int i=0;i<array.length-2;i++) {
		max=array[i]>array[i+1]?array[i]:array[i+1];
		}
		return max;
	}

}
