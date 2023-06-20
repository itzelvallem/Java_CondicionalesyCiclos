package ejerciciosCondicionalesYCiclos;

import java.util.Scanner;

public class ejerciciosCondicionalesYCiclos {

	public static void main(String[] args) {

		/*
		 * Condicionales
		 * 
		 * if else else if switch
		 * 
		 */

		System.out.println("Programa para calcular la hora");

		// Equivalente al prompt en JS se llama Scanner

		// var hora = prompt("mensaje");

		// Nenito = new Gatito (parametros);

		// Java, crea un nuevo objeto Scanner, llamalo hora y este sera un nuevo objeto
		// de la clase Scanner, que tiene los argumentos para guardar la informacion que
		// le pase como entrada

		Scanner valorIngresado = new Scanner(System.in);

		System.out.println("Por favor, ingresa una hora en un formato de 24 horas");

		// var valorIngresado = prompt("mensaje"); en una sola linea (declaro variable,
		// asigno el prompt, y la info del prompt la guardo en esa variable
		int hora = valorIngresado.nextInt();// usar la informacion del objeto

		// int hora = 13; delcaramos una variable

		if (hora >= 0 && hora <= 23) { // true

			System.out.println("Hora ingresada correctamente");

			if (hora >= 7 && hora <= 11) {
				System.out.println("Buenos días solecito");

			} else if (hora >= 12 && hora <= 18) {
				System.out.println("Buenas tardes ya, que calor hace");
			} else if (hora > 19 && hora <= 24) {
				System.out.println("Buenas noches, a dormir");

			} else {
				System.out.println("Es de madrugada, no es bueno desvelarse");

			} // cierre del if general

			valorIngresado.close(); // cierre del scanner

			/* Condicionales switch */

			int opcion = 1;
			switch (opcion) {
			case 1:
				System.out.println("Bienvenido al servicio de reservas");
				break;

			case 2:
				System.out.println("Bienvenido al servicio de check-in");
				break;

			case 3:
				System.out.println("Bienvenido al servicio de check-out");
				break;

			default:
				System.out.println("Opción invalida");
				break;
		
	} //Cierre del switch
			
	/*
			//Ejemplo del switch anidado
			int entradaDeDato = 5;
			
			switch(entradaDeDato) {
			
			case 1:
				System.out.println("Esta es la primera opción, del primer caso");
				break;	
				
			case 2:
				System.out.println("Esta es la segunda opción, del primer caso");
				break;		
			
			default:
				System.out.println("Opción invalida");
				break;
			
			
			}
	
	*/
	
	
		
	} //Cierre del metodo main
	} //Cierre de la clase condicionales
	
	
}

