import java.util.Scanner;
public class iteracionesDos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int errores = 0;
        while (true){
            
            String teclas = input.nextLine();
            switch (teclas) {
                case "a","b","c":
                        numero = 2;
                        System.out.println(numero);
                    break;
                case "d","e","f":
                numero = 3;
                System.out.println(numero);
                    break;
                case "g","h","i":
                numero = 4;
                System.out.println(numero);
                    break;
                case "j","k","l":
                numero = 5;
                System.out.println(numero);
                    break;
                case "m","n","o":
                numero = 6;
                System.out.println(numero);
                    break;
                case "p","q","r","s":
                numero = 7;
                System.out.println(numero);
                    break;
                case "t","u","v":
                numero = 8;
                System.out.println(numero);
                    break;
                case  "w","x","y","z":
                numero = 9;
                System.out.println(numero);
                    break;
                case "0":
                System.out.println("eL NUMERO DE EROORES TOTALES ES: " + errores);    
                System.exit(1);
                
                default:
                    System.out.println("El valor introducido no es válido.");
                    errores++;
                    break;
            }
        }
    }
}
