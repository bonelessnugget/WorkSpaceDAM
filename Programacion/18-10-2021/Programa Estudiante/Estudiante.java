//Programa que genera un documento de notificacion de perdida de derecho a evaluacion si las ausencias superan el 15%.
//Debe avisar si ha suerado el 5% o el 10% 256
import java.util.Scanner;
public class Estudiante {


    public static void main(String[] args) {
        final int HORAS_TOTALES = 256;
        Scanner teclado = new Scanner(System.in);
        int Id = 1;
        System.out.print("Baga auencias: ");
        int ausencias = teclado.nextInt();
        int porcentaje = (ausencias*100)/HORAS_TOTALES;
        
        if (porcentaje > 15) {
            System.out.print("El alumno con ID" + Id + " ");
            System.out.print("El número de ausencias ha superado el 15%");
        }else if (porcentaje <= 10 && porcentaje > 5){
            System.out.print("El alumno con ID" + Id + " ");
            System.out.print("Ha superado el 5% de faltas");
        }
    }
}
