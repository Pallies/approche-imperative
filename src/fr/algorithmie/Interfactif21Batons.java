package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfactif21Batons {
	static String[] baton21 = new String[21];
	static int looserCount = 0;
	static Scanner scanner;
	final static String BORDER = "\t********************************************************";
	final static String BORDER_BLANK = "\t*                                                      *";
final static String MARGE_LEFT="\n\t\t\t";
	public static void main(String[] args) {
		boolean again;
		affichageStart();
		initTabBaton();
		do {
			affichageBaton();
			menu();
			if (searchBaton() >= 1) {
				System.out.println("\tRésultat de votre tour ....");
				tourIA();
				again = true;
			} else {
				again = false;
				initTabBaton();
				again = gameOver();
			}
		} while (again);
	}

	/**
	 * initialisation du tableau de bâtonnets
	 */
	public static void initTabBaton() {
		for (int i = 0; i < baton21.length; i++) {
			baton21[i] = "|";
		}
	}

	/**
	 * Menu
	 * message client et récupération du nombre choisi 
	 * suppression du nombre de batons choisis
	 */
	static public void menu() {
		while (true) {
			try {
//		message utilisateur
				affichageNumberChoice();
//		retour du choix utilisateur 
				int nb = enterUserChoice();

				if (nb < 1 || nb > 3 || nb > searchBaton()) {
					throw new InputMismatchException();
				}
				if (nb <= searchBaton()) {
//		elimine les batonnets
					deleteBaton21(nb);
					break;
				}

			} catch (InputMismatchException e) {
				affichageBaton();
				System.out.print("\terreur de nombre");
			}
		}

	}



	/**
	 * retourne le chiffre utilisateur et remonte l'exception
	 * 
	 * @return int
	 */
	static public int enterUserChoice() throws InputMismatchException {
		scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	/**
	 * supprime les batons dans le tableau, le nombre de baton à supprimer est passé
	 * en paramètre
	 * 
	 * @param nb
	 */
	static public void deleteBaton21(int nb) {
		for (int i = baton21.length - 1; i >= 0 && nb > 0; i--) {
			if (baton21[i].contains("|")) {
				baton21[i] = " ";
				nb--;
			}
		}
		affichageBaton();
	}

	/**
	 * compte le nombre de batons dans le tableau 
	 * @return un chiffre
	 */
	static public int searchBaton() {
		int nb = 0;
		for (int i = 0; i < baton21.length; i++) {
			if (baton21[i].contains("|")) {
				nb++;
			}
		}
		return nb;
	}

	/**
	 * choix de la tactique IA
	 */
	static public void tourIA() {
		int baton = searchBaton();
		if (baton >= 4) {
			tactiqueSuperieurTrois(baton);
		} else {
			tactiqueGagnante(baton);
		}
	}

	/**
	 * inférieur de 3 baton restant supprime le nombre de baton pour gagner
	 * 
	 * @param baton
	 */
	static public void tactiqueGagnante(int baton) {
		int nb = 0;
		if (baton == 3) {
			nb = 2;
			deleteBaton21(nb);
		} else {
			nb = 1;
			deleteBaton21(nb);
		}
		afficheMessageDeleteIA(nb);
	}

	/**
	 * sélection du nombre de batons à supprimer en fonction de ce qui reste
	 * 
	 * @param baton
	 */
	static public void tactiqueSuperieurTrois(int baton) {
		int nb = 0;
		int nbBaton = baton % 4;
		switch (nbBaton) {
		case 0:
			nb = 3;
			deleteBaton21(nb);
			break;
		case 2:
			nb = 1;
			deleteBaton21(nb);
			break;
		case 3:
			nb = 2;
			deleteBaton21(nb);
			break;
		}
		afficheMessageDeleteIA(nb);
	}



	/**
	 * fin de partie perdant --> (utilisateur)
	 * 
	 * @return une autre partie (boolean)
	 */
	static public boolean gameOver() {
		affichageLooser();
		if(looserCount==5) {
			return false;
		}
//		reponse client pour refaire le jeu
		while (true) {
			try {
				System.out.println(" votre réponse : \n");
				scanner = new Scanner(System.in);
				int reponse = scanner.nextInt();
				if (reponse == 1) {
					return true;
				} else if (reponse == 2) {
					return false;
				}

			} catch (InputMismatchException e) {
				System.out.println("arrêt du programme: erreur d'entrée");
				return false;
			}
		}
	}
//	PARTIE AFFICHAGE

	/**
	 * affichage d'explication du jeu
	 */
	static public void affichageStart() {
		System.out.println(BORDER);
		System.out.println(BORDER_BLANK);
		System.out.println("\t*                    Le jeu du Baton                   *");
		System.out.println("\t*     retirer 1 à 3 baton pendant votre tour de jeu    *");
		System.out.println("\t*        mais ne prenez jamais le dernier ou vous      *");
		System.out.println("\t*                         PERDREZ                      *");
		System.out.println("\t*                         !!   !!                      *");
		System.out.println(BORDER_BLANK);
		System.out.println(BORDER);
	}
	
	/**
	 * indique le choix de battonnet possible à enlever
	 * 
	 */
	static public void affichageNumberChoice() {
		if (searchBaton() >= 3) {
			System.out.print("\tVous pouvez retirer 1 , 2 ou 3 bâtonnet(s).\t");
		} else if (baton21.length == 2) {
			System.out.print("\tVous pouvez retirer 1 ou 2 bâtonnet(s).\t");
		} else {
			System.out.print("\tVous pouvez retirer 1 bâtonnet.\t mais de toute façon vous avez perdu\t");
		}
		System.out.print(" Combien de batonnet enlevez-vous ?\t");
	}
	
	/**
	 * affichage du nombre de baton pris par l'IA
	 * 
	 * @param nb
	 */
	static public void afficheMessageDeleteIA(int nb) {
		System.out.println("\tJ'ai retiré " + nb + " bâtonnet(s)");
	}
	
	/**
	 * affichage des batonnets et du nombre en chiffres
	 */
	static public void affichageBaton() {
		for (String n : baton21) {
			System.out.print(n);
		}
		System.out.print("\t"+searchBaton());
	}
	/**
	 * affichage à la 5 partie perdue
	 */
	static public void affichageLooser() {
		switch (++looserCount) {
		case 1:
			System.out.println("\n"+BORDER);
			System.out.println(BORDER_BLANK);

			System.out
					.println(MARGE_LEFT+"1 ère défaite"+MARGE_LEFT+" d'une longue série ..."+MARGE_LEFT+"envie de me défier ? "+MARGE_LEFT+" 1-> oui ou 2-> non");
			System.out.println(BORDER_BLANK);
			System.out.println(BORDER);
			break;
		case 2:
			System.out.println("\n"+BORDER);
			System.out.println(BORDER_BLANK);
			System.out.println(
					MARGE_LEFT+"2e défaite"+MARGE_LEFT+" cela commence à devenir une habitude ..."+MARGE_LEFT+"oses tu me défier encore ?"+MARGE_LEFT+" 1-> oui ou 2-> non");
			System.out.println(BORDER_BLANK);
			System.out.println(BORDER);
			break;
		case 3:
			System.out.println("\n"+BORDER);
			System.out.println(BORDER_BLANK);
			System.out.println(
					MARGE_LEFT+"3e défaite"+MARGE_LEFT+" on parle plus d'habitude mais de coutume ..."+MARGE_LEFT+"je n'ose plus te poser la question ?3"+MARGE_LEFT+" 1-> oui ou 2-> non");
			System.out.println(BORDER_BLANK);
			System.out.println(BORDER);
			break;
		case 4:
			System.out.println("\n"+BORDER);
			System.out.println(BORDER_BLANK);
			System.out.println(MARGE_LEFT+"looser "+MARGE_LEFT+"une dernière chance ?"+MARGE_LEFT+" 1-> oui ou 2-> non");
			System.out.println(BORDER_BLANK);
			System.out.println(BORDER);
			break;
		case 5:
		default:
			System.out.println(
					MARGE_LEFT+"QI inférieur à mon programme "
					+ MARGE_LEFT+"qui d'ailleurs ne laisse aucune chance de gagner."
					+ MARGE_LEFT+"Comme disait Michel Malinovsky : seul la victoire est jolie\n\n");
			System.out.println(BORDER);
			System.out.println(BORDER_BLANK);
			System.out.println("\t*                        LOOSER                        *");
			System.out.println(BORDER_BLANK);
			System.out.println(BORDER);
		}
	}
}
