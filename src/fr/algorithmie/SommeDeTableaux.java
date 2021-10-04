package fr.algorithmie;

public class SommeDeTableaux {
	static int[] tab1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	static int[] tab2 = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };
	static int[] tabAdd;

	public static void main(String[] args) {
		additionTable();
		for(int i=0;i<tabAdd.length;i++) {
			System.out.print(tabAdd[i]+" ");			
		}

	}

	public static void additionTable() {
		int tabLength = tab1.length >= tab2.length ? tab1.length : tab2.length;
		tabAdd = new int[tabLength];
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
