package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifStockageNombre {
	final static String BORDER = "**********************************";
	static Scanner scanner;
	static int option;

	public static void main(String[] args) {
		int[] array = new int[0];
		while (true) {
			afficheMenu();
			try {
				scanner = new Scanner(System.in);
				option = scanner.nextInt();
				if (!(option == 1 ^ option == 2)) {
					break;
				}
				if (option == 2) {
					afficheTabs(array);
				} else {
					System.out.println(" 1 - Ajouter un nombre");
					option = scanner.nextInt();
					array = stockInArray(array);
				}

			} catch (InputMismatchException e) {
				break;
			}
		}
	}

	public static void afficheMenu() {
		System.out.println("Choisissez une option");
		System.out.println(" 1 - Ajouter un nombre");
		System.out.println(" 2 - Afficher les nombres stockés");
		System.out.println("Pour Quitter - n'importe quelle autre touche");
	}

	public static void afficheTabs(int[] array) {
		if (array.length != 0) {
			System.out.println(BORDER);
			System.out.println("\n");
			System.out.println("Affichage du tableau");
			System.out.println(BORDER);
			System.out.println("\n");
			for (int i : array) {
				System.out.print(i + " | ");
			}
			System.out.println("\n");
			System.out.println(BORDER);
		}
	}

	public static int[] stockInArray(int[] array) {
		int[] temp = new int[0 >= array.length ? 1 : array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[array.length] = option;
		return temp;
	}

}
