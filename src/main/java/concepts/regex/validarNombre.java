package main.java.concepts.regex;

public class validarNombre {
	
	public static void main (String [] argumentos) {
		System.out.println("Jorge Chavez: "+validar("Jorge Chavez"));//true
		System.out.println("Jorge chavez: "+validar("Jorge chavez"));//false
		System.out.println("jorge chavez: "+validar("jorge chavez"));//false
		System.out.println("JORGE CHAVEZ: "+validar("JORGE CHAVEZ"));//false
	}

	public static boolean validar(String nombre) {
		return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
	}
}
