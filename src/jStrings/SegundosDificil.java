package jStrings;

import java.util.Scanner;

/**
 * 
 * @author Jonathan Ruano
 * @method Dada la duracion de una cancion en segundos, obtenga el numero de minutos y segundos en el 
 * formato del ejemplo
						Ejemplo:
						Duracion en segundos: 360
						La cancion dura 6 minutos y 0 segundos
 */
public class SegundosDificil {

	public static void main(String[] args) {

		//=====================VARIABLES
		int duracionDeCancionSegundos = 0;

		//=====================Obtener Input De Usuario
		Scanner userInput = new Scanner(System.in);
		System.out.println("Cuanto Dura Tu Cancion En SEGUNDOS?");
		duracionDeCancionSegundos = Integer.parseInt(userInput.nextLine());
		userInput.close();
		calcularDuracionCancion(duracionDeCancionSegundos);
	}

	public static void calcularDuracionCancion(int duracionDeCancionSegundos ) {
		//=====================CONSTANTS
		double totalSecondInAMinute = 60;
		
		//=====================VARIABLES
		int bkpTime = duracionDeCancionSegundos;
		int segundosRestantes = 0;
		int minutosEnTotal = 0;
		//=====================Convertir Segundo A Minutos Restandole al tiempo total el residuo
		segundosRestantes = (int)(duracionDeCancionSegundos % totalSecondInAMinute);
		duracionDeCancionSegundos -= segundosRestantes;
		minutosEnTotal = (int)(duracionDeCancionSegundos / totalSecondInAMinute);
		System.out.println("******************************");
		System.out.println("LA CANCION DURA ==> " + bkpTime + " SEGUNDOS");
		System.out.println("LA CANCION CONVERTIDA A MINUTOS DURA ==> " + minutosEnTotal + "min" + 
				":" + segundosRestantes + "sec");
		System.out.println("******************************");
	}
}