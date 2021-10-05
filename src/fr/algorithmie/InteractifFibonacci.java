package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifFibonacci {
	static Scanner scanner;
static int result;
	public static void main(String[] args) {

//		fibonacciSuite(100);
//		fibonacciRecursif(10, 0, 1);

		try {
//				entrée clavier
			scanner = new Scanner(System.in);
			System.out.println("Veuillez entrez un chiffre entre 1 et 100 ");
			 result = scanner.nextInt();
			 
//				affichage de la suite
			 System.out.println("Liste de Fibonacci");
			 fibonacciSuiteRecursif(result,0,1);
			 
//				affichage de la réponse
				System.out.println("Valeur du rang : "+result+" value : "+fibonacciRank(result));
	
//				gestion des erreurs
		} catch (InputMismatchException e) {
			System.out.println(" votre caractère " + scanner.next() + " n'est pas valide");
		}

	}

	public static double fibonacciRank(int nb) {
		double fib1 = 0;
		double fib2 = 1;
		for (int index = 0; index <nb; index++) {
			double t = fib2;
			fib2 += fib1;
			fib1 = t;
		}
		return fib2;
	}

	public static double fibonacciSuiteRecursif(int nb, double fib1, double fib2) {
		if (nb < 0) {
			return 1L;
		}
		if (fib1 == 0) {
			System.out.println(fib1 + "\n" + fib2);
		} else {
			System.out.println(fib2);
		}
		return fibonacciSuiteRecursif(nb - 1, fib2, fib2 + fib1);
	}

// récusivité problème de convertion int long double ???
//	public static double fibonacciRecursifRank(int nb) {
//		if (nb == 1 || nb == 0) {
//			return 1D;
//		}
//	return fibonacciRecursifRank(nb - 1) + fibonacciRecursifRank(nb - 2);
//	}

}
