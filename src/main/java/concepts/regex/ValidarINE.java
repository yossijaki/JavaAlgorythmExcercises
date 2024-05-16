package main.java.concepts.regex;

public class ValidarINE {
	
	public static void main (String argumentos[]) {
		System.out.println("abcd123: "+validar("abcd123"));//false
		System.out.println("12345678a: "+validar("12345678"));//true
	}
	
	public static boolean validar (String numINE) {
		//valida si la cadena numINE coincide con la secuencia de caracteres: de 8-12 numeros + a-z o A-Z (opcionales *)
		return numINE.matches("^[0-9]{8,12}([a-zA-Z]*)$");
	}

}
