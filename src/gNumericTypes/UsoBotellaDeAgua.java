package gNumericTypes;

import java.util.Scanner;

/**
 * 
 * @author Jonathan Ruano
 * @method programa que reporte el uso de agua de un usuario que dura x minutos en la ducha expresado
 *         en botellas de agua. $ ./botellas_agua donde:
 *         Minutos: 1
 *         Botellas: 12
 *         $ ./botellas_agua
 *         Minutos: 10
 */
public class UsoBotellaDeAgua {

	public static void main(String[] args) {
		//=====================VARIABLES
		int minutosEnDucha = 0;

		Scanner userInput = new Scanner(System.in);
		System.out.println("Minutos A Utilizar Ducha");
		minutosEnDucha = Integer.parseInt(userInput.nextLine());
		userInput.close();
		calcularBotellasXMinuto(minutosEnDucha);
	}

	public static void calcularBotellasXMinuto(int minutosEnDucha ) {
		//=====================CONSTANTS
		int CNT_BOTELLASMINUTO = 12;
		String WHITESPACE = " ";
		//=====================VARIABLES
		int totalBotellasXMinuto = 0;

		//=====================Calculo de botellas por minuto
		totalBotellasXMinuto = minutosEnDucha * CNT_BOTELLASMINUTO;
		System.out.println("*****************************************************************");
		System.out.println("La Ducha Va A Durar Un Total De: " + minutosEnDucha + " MINUTO(s)");
		System.out.println("El Total De Botellas A Ocupar En Una Ducha De: " + minutosEnDucha + " MINUTO(s)" 
		+ WHITESPACE + "Es De: " + totalBotellasXMinuto + " BOTELLAS EN TOTAL");
		System.out.println("*****************************************************************");
	}
}