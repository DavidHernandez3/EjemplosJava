package ejercicios;

import java.util.Scanner;

public class SoliciteLaCantidadDePuntos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int puntos;

        System.out.println("Ingrese la cantidad de puntos :");
        puntos = entrada.nextInt();

        if(puntos <1000)
            System.out.println("Cliente Bronce");

        else if (puntos >= 1000 && puntos <= 3000){
            System.out.println("Cliente plata");

        }
        else if (puntos >= 3000)
        {
            System.out.println("Cliente oro");
        }
    }
}
