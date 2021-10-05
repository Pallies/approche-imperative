package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

interface Calculator {void calc(int op);}

public class InteractifTableMult {
	static Scanner scanner;
	static int[] multiTabs = {1,2,3,4,5,6,7,8,9,10};
	static Calculator printTableMulti= (int x)->{for(int m:multiTabs){System.out.println(" table "+ x +" X "+m+" = "+m*x);}};
	
	public static void main(String[] args) {
		int nb;
		
		while (true) {
			try {
				System.out.println("Veuillez entrez un chiffre entre 1 et 10 inclus : ");
				scanner = new Scanner(System.in);
				nb = scanner.nextInt();
				if (nb > 10 || nb < 1) {
					throw new IndexOutOfBoundsException(nb);
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("veuillez entrez un chiffre");
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
		printTableMulti.calc(nb);
	}

}
