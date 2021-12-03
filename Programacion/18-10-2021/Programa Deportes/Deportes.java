//Programa que obtiene una temperatura y dice el deporte adecuado.
//Natacion >29, Tenis 21< tmp <=29, Golf 0< tmp <=21, Esquí -12<tmp<=0, Damas <=-12.
import java.util.Scanner;

public class Deportes {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int tmp;
        while (1 == 1){
        System.out.print("Introduce la temperatura: ");
        tmp=teclado.nextInt();
        if (tmp > 29) {
            System.out.print("Natación");
        } else if (tmp <= 29 && tmp > 21) {
            System.out.print("Tenis");
        } else if (0 < tmp && tmp <= 21) {
            System.out.print("Golf");
        }else if (-12 < tmp && tmp <= 0) {
            System.out.print("Esqui");
        }else if (tmp <= -12) {
            System.out.print("Damas");
        }}
teclado.close();
    }
}
