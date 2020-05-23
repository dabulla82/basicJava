package jStrings;

import java.util.Scanner;

/**
 * 
 * @author Jonathan Ruano
 * @method programa que, dado el nombre de una persona, imprima las iniciales de la personas, 
 * como se muestra abajo.
 * 			$ ./iniciales_dificil
 * 			regulus Arcturus black
 * 			RAB
 * Tome en cuenta que la persona podria introducir palabras con iniciales en minuscular, 
 * o espacios extra entre palabras, como se muestra abajo.

 */
public class InicialesFacil {

	public static void main(String[] args) {
		//=====================VARIABLES
		String nombreDeUsuario = "";

		//=====================Obtener Input De Usuario
		Scanner userInput = new Scanner(System.in);
		System.out.println("ESCRIBA SU NOMBRE");
		nombreDeUsuario = userInput.nextLine().trim();
		userInput.close();
		generarIniciales(nombreDeUsuario);
	}

	public static void generarIniciales(String nombreDeUsuario ) {
		//=====================CONSTANTS
		int ZERO_IDX = 0;

		//=====================VARIABLES
		char subsInicial;
		boolean isUperCaseFlag = false;

		//=====================Utilizamos Expresiones Regulares Para Eliminar Los Espacios De mas Entre
		//					   Palabras
		nombreDeUsuario = nombreDeUsuario.trim().replaceAll("\\s+", " ");
		String[] nombreDeUsuarioArray = nombreDeUsuario.split("[\\h]");

		for (int i = 0; i < nombreDeUsuarioArray.length; i++) {
			subsInicial = nombreDeUsuarioArray[i].charAt(ZERO_IDX);
			isUperCaseFlag = Character.isUpperCase(subsInicial);
			if (isUperCaseFlag) {
				System.out.println("*****************************************************************");
				System.out.println("Las Inicial Del Usuario : " + nombreDeUsuarioArray[i] + 
						" SI ESTA EN MAYUSCULA");
				System.out.println("Las Inicial Del Nombre Es: " + subsInicial);
				System.out.println("*****************************************************************");
			}else {
				System.out.println("*****************************************************************");
				System.out.println("Las Inicial Del Usuario : " + nombreDeUsuarioArray[i] + 
						" NO ESTA EN MAYUSCULA");
				System.out.println("Las Inicial Del Nombre QUE NO ESTA EN MAYUSCULA ES: " + subsInicial);
				System.out.println("*****************************************************************");
			}
		}
	}
}