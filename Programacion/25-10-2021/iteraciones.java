// El programa obtiene el digito al presionar una de las letras a,b,c -> 2 y sucesivamente...
//

import java.util.Scanner;

public class iteraciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
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
                    System.exit(1);
                
                default:
                    break;
            }
        }
    }
}
