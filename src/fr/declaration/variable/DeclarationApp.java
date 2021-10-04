package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {

//         byte varByte=1;
//          short varShort=237;
//          int varInt=178;
//          long varLong=67L;
//          float varFloat=2F;
//         double varDouble=67;
//          char varChar='a';
//          boolean varBoolean=false;
          String varString="java";

        System.out.println("cours " +varString);
        String randomString = "Voici le résultat d'un calcul : 1+5=6";

        int indexSeparate = randomString.indexOf(':');
        
        String strSlice1= randomString.substring(0, indexSeparate+1)+"\n";
        String strSlice2 = randomString.substring(indexSeparate+1);

        System.out.println(strSlice1+strSlice2);
	}

}
