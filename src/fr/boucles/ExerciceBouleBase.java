package fr.boucles;

public class ExerciceBouleBase {

	public static void main(String[] args) {
		String name= "Palliès";
		String firstname="yvan";
		/** boucle 1 à 10 */
		for(byte i=0;i<10;i++) {
			System.out.println(i+1);
		}
        /** boucle 20f Nom prénom */
		for(byte i=0;i<20;i++) {
			System.out.println(i+1+": "+name+" "+firstname);
		}
		/** boucle pair*/
		for(byte i=0;i<=98;) {
			i+=2;
			System.out.println("nbre pair :"+i);
		}
		/** boucle impair*/
		for(byte i=0;i<100;) {
			i+=2;
			System.out.println("nbre impair :"+(i-1));
		}
	}

}
