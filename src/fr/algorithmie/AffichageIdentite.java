package fr.algorithmie;

public class AffichageIdentite {

	public static void main(String[] args) {
	User client = new User();
	
		for(int i =0;i<10;i++) {
			System.out.println(client.toString());
		}
	}
	
}

/**
 * création d'une class User
 * réécriture de la méthod toString().
 * @author yvan
 *
 */
class User {
	String name = "Palliès";
	String firstName = "Yvan";
	@Override
	public String toString() {
		return  name + ", " + firstName;
	}

}
