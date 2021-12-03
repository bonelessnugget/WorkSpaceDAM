//Producto de las variables si el primer numero es negativo, si no los suma.
//Paun Costin Daniel.
import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // Suma y produto se puede cambiar por resultado.
        int num1,num2,num3,suma,producto;

        System.out.print("Ingrese el primer número: ");
        num1=teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2=teclado.nextInt();
        System.out.print("Ingrese el tercer número: ");
        num3=teclado.nextInt();

        if (num1 < 0) {
            producto=num1 * num2 * num3;
            System.out.print("El producto es: ");
            System.out.print(producto);
        }
        else {
            suma=num1 + num2 + num3;
            System.out.print("La suma es: ");
            System.out.print(suma);
        }
        teclado.close();
    }
}