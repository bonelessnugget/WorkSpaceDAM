import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Elige una figura: 1-->Triángulo. 2-->Cuadrado. 3-->Rectángulo");
		int numero = teclado.nextInt();
		switch (numero) {
		case 1: {
			System.out.println("El area de un triangulo es el producto de la base por la altura dividido por 2.");
			System.out.println("Introduce los datos para calcular el área del triángulo");
			System.out.println("Introduce el valor de la base: ");
			Scanner base = new Scanner(System.in);
			int valor_base = base.nextInt();
			System.out.println("Introduce el valor de la altura: ");
			Scanner altura = new Scanner(System.in);
			int valor_altura = altura.nextInt();
			System.out.println("El área del triangulo es: "+ (valor_base*valor_altura)/2);
			break;
			}
			case 2: {
			System.out.println("El área de un cuadrado es el cuadrado de la longitud de los lados.");
			System.out.println("Introduce los datos para calcular el área del cuadrado: ");
			System.out.println("Introduce la longitud del lado: ");
			Scanner lado = new Scanner(System.in);
			int valor_lado = lado.nextInt();
			System.out.println("El área del cuadrado es: " + valor_lado*valor_lado);
			break;
		}
			case 3: {
			System.out.println("El área de un rectángulo es el producto de la base por la altura.");
			System.out.println("Introduce los datos para calcular el área del rectángulo");
			Scanner altura = new Scanner(System.in);
			System.out.println("Introduce la altura: ");
			int valor_altura=altura.nextInt();
			System.out.println("Introduca la longitud de la base: ");
			Scanner base = new Scanner(System.in);
			int valor_base = base.nextInt();
			System.out.println("El área del rectángulo es: " + valor_altura*valor_base);
			break;
			}
		default:
		}
		}
}
