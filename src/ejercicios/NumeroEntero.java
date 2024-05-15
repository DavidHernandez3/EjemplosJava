package ejercicios;

import java.util.Scanner;

public class NumeroEntero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int i = 0;

        System.out.println("Ingrese un numero entero:");
        numero = entrada.nextInt();

        System.out.println("Los numeros pares hasta " + numero + " son:");
        while (i <= numero) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++; // Incrementamos i en cada iteración
        }
    }
}
