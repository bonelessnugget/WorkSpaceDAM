/*
 Escribe un programa que lea una secuencia de datos numericos de longitud indefinida
 de manera que cuando el numero sea el 0, cesara la entrada de dicha secuencia. El programa debe 
 imprimirnos la media de todos ellos, el mayor y el menor.
 */
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		int suma = 0;
		int media = 0;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce los numeros:");
		boolean funcionando = true;
		ArrayList<Integer> serie = new ArrayList<Integer>();
		
		while (funcionando == true) {
			int numero = teclado.nextInt();
			serie.add(numero);
			if (numero == 0) {
				System.out.println("La media de los numeros es: " + media);
				System.out.println("El mayor de los números es: " + Collections.max(serie));
				System.out.println("El menor de los números es: " + Collections.min(serie));
				funcionando = false;
			}else {
				suma = suma + numero;
				contador ++;
				media = suma / contador;
				
			}
		}

	}

}
