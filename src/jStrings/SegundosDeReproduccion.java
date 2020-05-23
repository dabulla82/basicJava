package jStrings;

import java.util.Scanner;

/**
 *@author Jonathan Ruano
 *@method Dada la leyenda de duracion de un video, en el formato mm:ss, proporcione el numero de segundos que habra que esperar
			para que dicha reproduccion termine.
			
			ejemplo:
			duracion del video: 5:45
			el video dura 345 segundos.
 */
public class SegundosDeReproduccion {

	public static void main(String[] args) {

		//=====================VARIABLES
		String stringReproduccion = "";

		//=====================Obtener Input De Usuario
		Scanner userInput = new Scanner(System.in);
		System.out.println("Cuanto Dura Tu Cancion En FORMATO MM:SS ejemplo 5:15");
		stringReproduccion = userInput.nextLine();
		userInput.close();
		calcularDuracionReproduccion(stringReproduccion);
	}

	public static void calcularDuracionReproduccion(String stringReproduccion ) {
		//=====================CONSTANTS
		int TOTALSECONDSINAMINUTE = 60;
		String SEPARATOR = ":";
		int ZERO_IDX = 0;
		int ONE_INX = 1;
		
		//=====================VARIABLES
		int minutesToSeconds = 0;
		int secondsLeft = 0;
		String [] arrayStringReproduccion = stringReproduccion.split(SEPARATOR);
		
		//=====================Convertir Minutos A Segundos
		minutesToSeconds = Integer.parseInt(arrayStringReproduccion[ZERO_IDX]) * TOTALSECONDSINAMINUTE;
		minutesToSeconds += Integer.parseInt(arrayStringReproduccion[ONE_INX]);
		System.out.println("******************************");
		System.out.println("LA REPRODUCCION TIENE UNA DURACION DE    ==> " + stringReproduccion);
		System.out.println("LA REPRODUCCION CONVERTIDA A SEGUNDOS ES ==> " + minutesToSeconds + " seconds");
		System.out.println("******************************");
	}
}