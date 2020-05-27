package jStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jonathan Ruano
 * @method Implemente el cifrado de Cesar, como se muestra abajo.
			$ ./cifrado_cesar 13
			mensaje inicial:  HELLO
			mensaje cifrado: URYYB

			H   A   L
			72  65  76
			I   B   M
			73  66  77
			ARthur C Clarke
			"2001 odisea del espacio"
 */

public class CifradoCesar {

	public static void main(String[] args) {
		//=====================VARIABLES
		String mensaje = "";
		int cifradoCesar = 0;

		//=====================Obtener Input De Usuario
		Scanner userInput = new Scanner(System.in);
		System.out.println("ESCRIBA A QUE CIFRADO CESAR SE ENCRIPTARA EL MENSAJE");
		cifradoCesar = userInput.nextInt();
		System.out.println("ESCRIBA EL MENSAJE HA ENCRIPTAR");
		mensaje = userInput.next().trim();
		generarIniciales(mensaje, cifradoCesar);
		userInput.close();
	}

	public static void generarIniciales(String mensaje, int cifradoCesar) {
		char c;
		List<String> abecedario = new ArrayList<>(); 

		//=====================VARIABLES
		String mensajeCifrado = "";
		char letra;
		String strLetra = "";

		for(c = 'A'; c <= 'Z'; ++c) {
			abecedario.add(Character.toString(c));
		}
		for (int i = 0; i < mensaje.length(); i++) {
			letra = mensaje.charAt(i);
			strLetra = String.valueOf(letra);
			for (int j = 0; j < abecedario.size(); j++) {
				if (strLetra.equalsIgnoreCase(abecedario.get(j))) {
					int newIdex = j + cifradoCesar;
					if (newIdex >= abecedario.size()) {
						newIdex = newIdex - abecedario.size();
						mensajeCifrado = mensajeCifrado.concat(abecedario.get(newIdex));
						break;
					}else {
						mensajeCifrado = mensajeCifrado.concat(abecedario.get(newIdex));
					}
					break;
				}
			}
		}
		System.out.println("*****************************************************************");
		System.out.println("El Mensaje Con Un Cifrado Cesar =>" + cifradoCesar + " Es El Siguiente: " + 
		mensajeCifrado);
		System.out.println("*****************************************************************");
	}
}