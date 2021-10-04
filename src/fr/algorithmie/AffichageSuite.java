package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
//		Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
		System.out.println("afficher tous les nombres de 1 à 10 inclus");
		for(int i=0;i<10;i++) {
			System.out.println(i+1);
		}
//		• Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
		System.out.println("afficher tous les nombres pairs entre 0 et 10 inclus");
		for(int i=0;i<=10;i+=2) {
				System.out.println(i);
		}
//		• Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
		System.out.println("afficher tous les nombres impairs entre 0 et 9 inclus");
		for(int i=0;i<10;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
//		• Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
		System.out.println("afficher tous les nombres de 1 à 10 inclus");
		int index =0;
		while(index<10) {
			System.out.println(index+1);
			index++;
		}
//		• Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
		System.out.println("afficher tous les nombres pairs entre 0 et 10 inclus");
		index=0;
		while(index<=10) {
			System.out.println(index);
			index+=2;
		}
//		• Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
		System.out.println("afficher tous les nombres impairs entre 0 et 9 inclus");
		index=0;
		while(index<10) {
			index+=2;
			System.out.println(index-1);
		}
	}

}
