/*Ejercicio 3 Tema 3
 * Escribir un programa que, una vez que lea un n?mero N
 * por tecado, calcula y escriba los divisores propios de N
 * por la pantalla sin incluirse a s? mismo.
 * Paun Costin Daniel, 2-11-2021
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el n?mero del que quieres saber los divisores: ");
		int numero = teclado.nextInt();
		for (int i = 1; i <= numero; i++) { 
			if(numero%i==0) {	
				System.out.print(" "+i);
			}
		}
	}

}
