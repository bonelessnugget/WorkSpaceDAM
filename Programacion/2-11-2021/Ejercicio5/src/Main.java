/*Hacer un programa que lea una serie de numeros por 
 * teclado de manera que cuando el numero leido
 * sea el cero ya no se introduzcan mas
 * el programa debe sumar los numeros introducidos y contarlos.
 * Paun Costin Daniel, 3-11-2021
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int suma = 0;
		int contador = 0;
		boolean funcionando = true;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce los numeros");
		while (funcionando == true) {
			int numero = teclado.nextInt();
			if (numero == 0) {
				System.out.println("La suma de los numeros es: " + suma);
				System.out.println("Has introducido: " + contador + " numeros");
				funcionando = false;
			}else {
				suma = suma + numero;
				contador ++;
			}
		}
	}
	}

