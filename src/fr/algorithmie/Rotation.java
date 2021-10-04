package fr.algorithmie;

public class Rotation {

	static int[] arrayRight = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	static int[] arrayLeft = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	public static void main(String[] args) {
		System.out.println("rotation à droite");
		afficher(arrayRight);
		rotateRigth();
		afficher(arrayRight);
		System.out.println(" rotation à gauche");
		afficher(arrayLeft);
		rotateLeft();
		afficher(arrayLeft);
	}

	static public void rotateRigth() {
		int temp = arrayRight[0];
		int indexArray = 0;
		while (indexArray < arrayRight.length ) {
			if (indexArray == arrayRight.length - 1) {
				arrayRight[indexArray] = temp;
			} else {
				arrayRight[indexArray] = arrayRight[indexArray + 1];
			}
			indexArray++;
		}

	}
	static public void rotateLeft() {
		int temp = arrayLeft[arrayLeft.length-1];
		int indexArray = arrayLeft.length-1;
		while (indexArray > 0 ) {
			if (indexArray == 1) {
				arrayLeft[0] = temp;
			} else {
				arrayLeft[indexArray] = arrayLeft[indexArray -1];
			}
			indexArray--;
		}

	}
	 public static void afficher(int[] array) {
		int indexArray = 0;
		while(indexArray< array.length) {
			System.out.print(array[indexArray]+" ");
			indexArray++;
		}
		System.out.println("");
	}
}
