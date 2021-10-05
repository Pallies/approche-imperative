package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Veuillez entrez un chiffre :");
			try {
				int nb = scanner.nextInt();
				System.out.println("Votre chiffre est le : " + nb);
				break;
			} catch (InputMismatchException e) {
				System.err.println("votre chiffre n'est pas un nombre ");
			}

		}
	}

}
