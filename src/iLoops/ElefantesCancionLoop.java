package iLoops;

import libs.Input;

public class ElefantesCancionLoop {
	
	//=========================================CONSTANTS
	public static final String ELEFANTE_CANCIONSINGULAR = " elefante se columpiaba sobre la tela de una araña, como veia "
			+ "que resistia, fue a llamar a otro elefante";
	public static final String ELEFANTE_CANCIONPLURAL = " elefantes se columpiaban sobre la tela de una araña, como veian "
			+ "que resistia, fueron a llamar a otro elefante";

	/**
	 * @author Jonathan Ruano
	 * @method Escriba un programa que escriba la letra de la cancion de los elefantes,
	 * hasta que sean 100 elefantes.
	 * Ejemplo:
				1 elefante se columpiaba sobre la tela de una araña,
				como veia que resistia, fue a llamar a otro elefante
				
				2 elefantes se columpiaban sobre la tela de una araña,
				como veian que resistia, fueron a llamar a otro elefante.
	 * @param args
	 */
	public static void main(String[] args) {
		//=====================VARIABLES
		int cantidadDeElefantes = 100;
		//EXECUTING printElefantSong Method
		printElefantSong(cantidadDeElefantes);
	}

	public static void printElefantSong(int cantidadDeElefantes)
	{
		int elefantesCounter = 1;
		while (elefantesCounter <= 100) {
			//=====================Cancion Singular
			if (elefantesCounter == 1) {
				System.out.println(elefantesCounter + ELEFANTE_CANCIONSINGULAR);
				elefantesCounter++;
			}
			//=====================Cancion Plural
			else {
				System.out.println(elefantesCounter + ELEFANTE_CANCIONPLURAL);
				elefantesCounter++;
			}
		}
	}
}
