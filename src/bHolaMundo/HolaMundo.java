package bHolaMundo;

/**
 * 
 * @author Jonathan Ruano
 * @method Implementa un programa que imprima un saludo simple para el usuario, como se muestra abajo.
 * 				$ ./hello
 * 				hello, world
 */
public class HolaMundo {

	public static void main(String[] args) {
		//=====================CONSTANTES
		String HOLAMUNDOMSG = "HOLA MUNDO EN CUARENTENA";
		helloMundo(HOLAMUNDOMSG);
	}

	public static void helloMundo(String HOLAMUNDOMSG ) {

		//=====================Calculo de botellas por minuto
		System.out.println("******************************");
		System.out.println(HOLAMUNDOMSG);
		System.out.println("******************************");
	}
}