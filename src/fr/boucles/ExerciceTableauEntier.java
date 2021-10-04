package fr.boucles;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.stream.Stream;
>>>>>>> edcffb01799bfe6c6886911a4042fb5e306d029f

public class ExerciceTableauEntier {

	public static void main(String[] args) {

		int[] tabInt = new int[10];
		int[] tabInteger = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayList<Integer> tabIntList = new ArrayList<Integer>();

		for (byte i = 0; i < 10; i++) {
//			Affectation
			tabInt[i] = i + 1;
			tabIntList.add(i + 1);

//          Affichage
//			System.out.println(tabInt[i]);
//			System.out.println(tabInteger[i]);
//			System.out.println(tabIntList.get(i));
		}
		
		System.out.println("premier chiffre :"+tabInteger[0]+ " "+tabIntList.get(0));
		System.out.println("la taille du tableau :"+tabInteger.length+ " "+tabIntList.size());
		System.out.println("dernier chiffre :"+tabInteger[tabInteger.length-1] + " "+ tabIntList.get(tabIntList.size()-1));

		tabInteger[4]=8;
		tabIntList.set(4, 8);
	}

}
