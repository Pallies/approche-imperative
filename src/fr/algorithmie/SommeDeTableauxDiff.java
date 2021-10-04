package fr.algorithmie;

public class SommeDeTableauxDiff {

	static int[] tab1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
	static int[] tab2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
	static int[] tabAdd;

	public static void main(String[] args) {
		additionTable();
		
//		affichage
		for(int i=0;i<tabAdd.length;i++) {
			System.out.print(tabAdd[i]+" ");			
		}

	}

	public static void additionTable() {
//		initialise le tableau
		int tabLength = tab1.length >= tab2.length ? tab1.length : tab2.length;
		tabAdd = new int[tabLength];
//		affectation
		for (int i = 0; i < tabLength; i++) {
			if (i >= tab1.length) {
				tabAdd[i] = tab2[i];
			} else if (i >= tab2.length) {
				tabAdd[i] = tab1[i];
			} else {
				tabAdd[i] = tab1[i] + tab2[i];
			}
		}
	}
}
