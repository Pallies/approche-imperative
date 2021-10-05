package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifChiffresSuivants {

	static Scanner scanner;

	public static void main(String[] args) {
		int nb = 0;
		while (true) {
			try {
				scanner = new Scanner(System.in);
				System.out.println(" Veuillez entrer un chiffre.");
				nb = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {

				System.out.println("votre caractère \" " + scanner.next() + " \" n'est pas un nombre");
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(nb + i);
			if (i != 9) {
				System.out.print(",");
			}
		}

	}

}
