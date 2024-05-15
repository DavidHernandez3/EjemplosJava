package ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PromedioExamen {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int correcta = 0;
        int incorrecta = 0 ;
        int vacio = 0 ;
        double porcentaje ;

        System.out.println("Ingrese la nota correcta :");
        correcta = entrada.nextInt();

        System.out.println(" ingrese las notas incorrectas :");
        incorrecta = entrada.nextInt();

        System.out.println(" valor vacio");
        vacio = entrada.nextInt();

        porcentaje = (correcta * 5) + (incorrecta * -2) + (vacio) ;
        System.out.println("el porentaje es :" + porcentaje );


    }
}
