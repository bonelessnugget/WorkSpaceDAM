// Primo mas cercano pro excess a introduced

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		boolean primo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte un numero:");
		int numero = teclado.nextInt();
		int primoPorExceso;
		
		primo = false;
		primoPorExceso = numero;
		do {
			primoPorExceso++;
		
		
		// Determino si un numero es primo o no
		primo = primoPorExceso % 2 != 0 || primoPorExceso == 2; // comprbar si el numero es divisible por do salvo dos mismo.
		int divisor = 3; //
		while (primo && divisor < primoPorExceso && primoPorExceso != 2) {
			if ( primoPorExceso % divisor == 0)
				primo = false;
			divisor += 2;
		}
		}while(primo == false);
		//Fin de la determinacion
		if ( primo == false)
			System.out.println("No es primo");
		else
			System.out.println("es primo");
			System.out.println("El primo por exceso es "+primoPorExceso);
		
	}
}
