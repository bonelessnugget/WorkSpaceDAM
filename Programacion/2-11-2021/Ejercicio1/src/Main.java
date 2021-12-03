//Ejercicio 1 del Tema 3, Paun Costin Daniel, 2-11-2021
//Realiza la suma de todos los numeros comprendidos entre otros dos sin incluirlos.
/*Escribir un programa que calcule e imprima la suma de los números enteros comprendidos
entre A y B que deben leerse por teclado y filtrarse para que A<=B. Los valores de A y B no
deben incluirse en la suma.
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int suma;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		//Leo los numeros A y B
		int A=teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		int B=teclado.nextInt();
		// Sumo los numeros entre A y B sin incluirlos
		suma = 0;
		for (int contador = A+1; contador < B; contador++) { //Mientras que el contador sea menor que B, sumar contador.
			suma += contador;
			System.out.println("La suma es: " + suma);
		}
		
	}

}
