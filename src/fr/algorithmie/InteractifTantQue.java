package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifTantQue {
	static Scanner scanner;
	public static void main(String[] args) {
		while (true) {
			try {
				scanner = new Scanner(System.in);
				System.out.println("Veuillez entrez un chiffre :");
				int nb = scanner.nextInt();
				System.out.println("Votre chiffre est le : " + nb);
				break;
			} catch (InputMismatchException e) {
				System.err.println("votre chiffre n'est pas un nombre ");
			}

		}
	}

}
