/*
 Se define el factorial de un numero N como N*(N-1)*(N-2). 
 Hacer un pograma que lea el numero N filtrando que debe ser mayor que 
 cero y calcule su factorioal. Paun Costin Daniel, 8-11-2021
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    System.out.print("Introduce numero: ");
	    int n=teclado.nextInt();
	    int fact=1;
	    if (n > 0){
	      for(int i=1;i<=n;i++){
	        fact=fact*i;
	      }   
	    }
	    System.out.println(fact);
		
	}

}
