package fr.algorithmie;

public class SommeDeTableaux {
	static int[] tab1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	static int[] tab2 = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };
	static int[] tabAdd = new int[tab1.length];

	public static void main(String[] args) {
		additionTable();
//		affichage
		for(int i=0;i<tabAdd.length;i++) {
			System.out.print(tabAdd[i]+" ");			
		}

	}

	public static void additionTable() {
//	affectation
		for (int i = 0; i < tabAdd.length; i++) {
				tabAdd[i] = tab1[i] + tab2[i];
		}
	}

}
