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
public class InicialesDificil {

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
		int NUMOFCHARSTOSUBSTRACT = 1;

		//=====================VARIABLES
		String inicialesDeNombre = "";
		String subsInicial = "";

		//=====================Utilizamos Expresiones Regulares Para Eliminar Los Espacios De mas Entre
		//					   Palabras si tenemos mas de un espacio en blanco se remplaza con un espacio en blanco
		nombreDeUsuario = nombreDeUsuario.trim().replaceAll("\\s+", " ");
		String[] nombreDeUsuarioArray = nombreDeUsuario.split("[\\h]");

		for (int i = 0; i < nombreDeUsuarioArray.length; i++) {
			subsInicial = nombreDeUsuarioArray[i].substring(ZERO_IDX, NUMOFCHARSTOSUBSTRACT).toUpperCase();
			inicialesDeNombre = inicialesDeNombre.concat(subsInicial);
		}
		System.out.println("*****************************************************************");
		System.out.println("Las Iniciales Del Usuario: " + nombreDeUsuario + 
				" Queda Como Se Muestra Abajo:");
		System.out.println("Las Iniciales Del Usuario: " + inicialesDeNombre);
		System.out.println("*****************************************************************");
	}
}