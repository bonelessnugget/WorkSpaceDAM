/*Hacer un prgrama que vaya leyendo numeros por el teclad hasta que lea 0
 * que indicara el fin de la entrada de datos. El programa debe calcular
 * y escribir la suma de lso numeros introducidos en lugar par y de los introducidos
 * en lugar impar. Paun Costin Daniel, 3-11-2021
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int suma_impar = 0;
		int suma_par = 0;
		boolean funcionando = true;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce los numeros");
		while (funcionando = true){
			int numero = teclado.nextInt();
			if (numero == 0) {
				funcionando = false;
				System.out.println("La suma de los pares es " + suma_par);
				System.out.println("La suma de los impares es " + suma_impar);
			}else if (numero % 2 == 0) {
				suma_par = suma_par + numero;
			} else {
				suma_impar = suma_impar + numero;
			}
		}

	}

}
