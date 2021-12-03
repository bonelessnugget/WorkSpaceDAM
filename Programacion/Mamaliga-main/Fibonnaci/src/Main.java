import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Cuantos números quieres: ");
		int numero = input.nextInt();
		int num1 = 0, num2 = 1, suma = 1;
		for (int i = 1; i < numero; i++) {
			System.out.println(suma);
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;

		}

	}

}
