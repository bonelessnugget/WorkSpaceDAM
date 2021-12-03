import java.util.Scanner;
public class Main {

	
	static boolean isPrime(int numero) {
		if (numero <= 1)
			return false;
		for (int i = 2; i < numero; i++)
			if (numero % i == 0)
				return false;
		return true;
	}
	
	static void printPrime(int numero) {
		for (int i = 2; i <= numero; i++) {
			if (isPrime(i))
				System.out.println(i + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = teclado.nextInt();
		printPrime(numero);
		

	}
	}

