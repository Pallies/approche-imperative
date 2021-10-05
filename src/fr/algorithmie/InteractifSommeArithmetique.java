package fr.algorithmie;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		int nb = 0;
		Scanner scanner = null;
		
		while (true) {
			try {
				System.out.println("Veuillez entrer un chiffre entre 1 et 2 147 483 647 inclus");
				scanner = new Scanner(System.in);
				nb = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println(" votre caractère " + scanner.next() + " n'est pas valide");
			}
		}
		System.out.println("La somme des valeur est : "+sommeRecursive(nb));
		scanner.close();
	}

	public static int sommeRecursive(int nb) {
		if (nb == 1) {
			return 1;
		}
		return nb + sommeRecursive(nb - 1);
	}
}
