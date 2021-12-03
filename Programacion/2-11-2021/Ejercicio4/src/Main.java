/*Hacer un programa que lea un número N y nos escriba
 * en la pantalla mediante un mensaje si es o no primo.
 * (NOTA: Número primo es aquel que es divisible solo por si mismo y la unidad)
 * 
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");

		}
	}
