package pacage;
import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número mayor que 2: ");
		int numero = teclado.nextInt();
		
		if(numero > 2) {
		
		for (int fila=1; fila<=numero; fila++) {
			for (int blanco=(numero-fila); blanco > 0; blanco--) {
				System.out.print(" ");
			}
			for (int triangulo2=fila; triangulo2 > 0; triangulo2--) {
				System.out.print(" "+triangulo2);
			}
			
			for (int triangulo3=2; triangulo3 <= fila; triangulo3++) {
				System.out.print(triangulo3+" ");
			}
			System.out.println(" ");
		}
	
		}

	}

}
