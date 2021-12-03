//Ejercicio 4 Correccion.

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		boolean primo = true;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte un numero:");
		int numero = teclado.nextInt();
		primo = numero % 2 != 0 || numero == 2; // comprbar si el numero es divisible por do salvo dos mismo.
		int divisor = 3; //
		while (primo && divisor < numero && numero != 2) {
			if ( numero % divisor == 0)
				primo = false;
			divisor += 2;
		}
		if ( primo == false)
			System.out.println("No es primo");
		else
			System.out.println("es primo");
	}

}
