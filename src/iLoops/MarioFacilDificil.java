package iLoops;

import libs.Input;

public class MarioFacilDificil {
	static boolean firstRun = false;
	static int cantidadDefaultDeCaracteres = 1;
	static int espaciosAmbasPiramidesMarioDificil = 2;
	static boolean crearMarioFacilOrDificil = true;


	public static void main(String[] args) {
		//=====================VARIABLES
		int alturaMarioPiramides = 15;


		String caracterAImprimir = "*";
		crearMarioPiramides(crearMarioFacilOrDificil , alturaMarioPiramides, caracterAImprimir);
	}

	public static void crearMarioPiramides(boolean crearMarioFacilOrDificil, int alturaMarioPiramides, String caracterAImprimir) {
		firstRun = true;
		if (crearMarioFacilOrDificil == false) {
			crearMarioFacil(alturaMarioPiramides, caracterAImprimir);
		}else {
			crearMarioDificil(alturaMarioPiramides, caracterAImprimir, espaciosAmbasPiramidesMarioDificil);
		}
	}


	public static void crearMarioFacil(int alturaMarioPiramides, String caracterAImprimir) {
		int espaciosEnBlanco = alturaMarioPiramides + 1;

		//Constants
		String WHITESPACE = " ";
		for (int i = 0; i < alturaMarioPiramides; i++) {
			espaciosEnBlanco = alturaMarioPiramides + 1;
			espaciosEnBlanco = espaciosEnBlanco - cantidadDefaultDeCaracteres;
			if (!firstRun) {
				System.out.println();
			}
			for (int j = 0; j < espaciosEnBlanco; j++) {
				System.out.print(WHITESPACE);
			}

			for (int k = 0; k < cantidadDefaultDeCaracteres; k++) {
				System.out.print(caracterAImprimir);
			}
			firstRun = false;
			cantidadDefaultDeCaracteres++;
		}
	}


	public static void crearMarioDificil(int alturaMarioPiramides, String caracterAImprimir, int espaciosAmbasPiramidesMarioDificil) {
		int espaciosEnBlanco = alturaMarioPiramides + 1;

		//Constants
		String WHITESPACE = " ";
		for (int i = 0; i < alturaMarioPiramides; i++) {
			espaciosEnBlanco = alturaMarioPiramides + 1;
			espaciosEnBlanco = espaciosEnBlanco - cantidadDefaultDeCaracteres;
			if (!firstRun) {
				System.out.println();
			}
			for (int j = 0; j < espaciosEnBlanco; j++) {
				System.out.print(WHITESPACE);
			}

			for (int k = 0; k < cantidadDefaultDeCaracteres; k++) {
				System.out.print(caracterAImprimir);
			}
			if (!crearMarioFacilOrDificil) {
				firstRun = false;
			}
			for (int j = 0; j < espaciosAmbasPiramidesMarioDificil; j++) {
				System.out.print(WHITESPACE);
			}

			for (int k = 0; k < cantidadDefaultDeCaracteres; k++) {
				System.out.print(caracterAImprimir);
			}
			firstRun = false;
			cantidadDefaultDeCaracteres++;
		}
	}
}
