/*
 Un numero se dice que es perfecto cuando la suma de sus divisores propios- todos los
 divisores a excepción del propio numero-, es igual a dicho numero. Hacer un programa
 que lea un numero y nos diga si es perfecto o no.
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = teclado.nextInt();
		int suma_divisores=0;
		for (int i = 1; i<numero; i++) {
			if(numero%i == 0) {
				suma_divisores = i + suma_divisores;
			}
		}
		if(suma_divisores == numero)
			System.out.println(numero + " Es perfecto.");
		else
			System.out.println(numero + " No es perfecto.");
	}
	}

