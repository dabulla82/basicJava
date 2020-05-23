package iConditionals;

import java.io.IOException;
import java.util.Scanner;

public class MinimoMonedas {
	static boolean firstRun = false;
	static int cantidadDefaultDeCaracteres = 1;
	static int espaciosAmbasPiramidesMarioDificil = 2;
	static boolean crearMarioFacilOrDificil = true;

	/**
	 * @author Jonathan Ruano
	 * @method Programa que muestre el numero minimo de monedas necesarias para darle el cambio 
	 * 		   a un usuario.
	 * 
	 * 			Cambio Esperado $1.23
	 * 			25c - 4 => 23c
	 * 			10c - 2 => 3c
	 * 			5c  - 0 => 3c
	 * 			1c  - 3 -> 0c
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		//=====================VARIABLES
		double cantidadDeCambio = 0;

		Scanner userInput = new Scanner(System.in);
		System.out.println("Hola!  Cuanto cambio te debo?O hai!");
		cantidadDeCambio = Double.parseDouble(userInput.nextLine());
		cambioEnMonedas(cantidadDeCambio);
		userInput.close();
	}

	public static void cambioEnMonedas(double cantidadDeCambio) {
		//=====================CONSTANTS
		double CNS_COUNTER25 = .25;
		double CNS_COUNTER10 = .10;
		double CNS_COUNTER5 = .05;
		double CNS_COUNTER1 = .01;
		String CNS_STR25 = "25c";
		String CNS_STR10 = "10c";
		String CNS_STR5 = " 5c";
		String CNS_STR1 = " 1c";
		//=====================VARIABLES
		int counter25 = 0;
		int counter10 = 0;
		int counter5 =  0;
		int counter1 =  0;
		double residuo = 0;
		double totalMonedasSum = 0;
		double residuoFirstTry = 0;
		double CounterByUnit = 0;
		double actualSum = 0;

		while (totalMonedasSum < cantidadDeCambio) {
			//DecimalFormat residuoFormat = new DecimalFormat("####0.##");
			residuo = cantidadDeCambio;
			if (residuo >= CNS_COUNTER25) {
				residuoFirstTry = residuo / CNS_COUNTER25;
				counter25 = (int) Math.round(residuoFirstTry);
				CounterByUnit = counter25 * CNS_COUNTER25;
				if (CounterByUnit > residuo) {
					counter25--;
				}
				CounterByUnit = counter25 * CNS_COUNTER25;
				actualSum = residuo - CounterByUnit;
				residuo =  Math.round(actualSum * 100.0) / 100.0;
				totalMonedasSum += CounterByUnit;

			}
			System.out.println(CNS_STR25 + " - " + counter25 +" => " + residuo + "c");

			if (residuo >= CNS_COUNTER10) {
				residuoFirstTry = residuo / CNS_COUNTER10;
				counter10 = (int) Math.round(residuoFirstTry);
				CounterByUnit = counter10 * CNS_COUNTER10;
				if (CounterByUnit > residuo) {
					counter10--;
				}
				CounterByUnit = counter10 * CNS_COUNTER10;
				actualSum = residuo - CounterByUnit;
				residuo =  Math.round(actualSum * 100.0) / 100.0;
				totalMonedasSum += CounterByUnit;
			}

			System.out.println(CNS_STR10 + " - " + counter10 +" => " + residuo + "c");

			if (residuo >= CNS_COUNTER5) {
				residuoFirstTry = residuo / CNS_COUNTER5;
				counter5 = (int) Math.round(residuoFirstTry);
				CounterByUnit = counter5 * CNS_COUNTER5;
				if (CounterByUnit > residuo) {
					counter5--;
				}
				CounterByUnit = counter5 * CNS_COUNTER5;
				actualSum = residuo - CounterByUnit;
				residuo =  Math.round(actualSum * 100.0) / 100.0;
				totalMonedasSum += CounterByUnit;

			}
			System.out.println(CNS_STR5 + " - " + counter5 +" => " + residuo + "c");

			if (residuo >= CNS_COUNTER1) {
				residuoFirstTry = residuo / CNS_COUNTER1;
				counter1 = (int) Math.round(residuoFirstTry);
				CounterByUnit = counter1 * CNS_COUNTER1;
				if (CounterByUnit > residuo) {
					counter1--;
				}
				CounterByUnit = counter1 * CNS_COUNTER1;
				actualSum = residuo - CounterByUnit;
				residuo =  Math.round(actualSum * 100.0) / 100.0;
				totalMonedasSum += CounterByUnit;
			}
			System.out.println(CNS_STR1 + " - " + counter1 +" => " + residuo + "c");
		}
	}	
}