    package ejercicios;

    import java.util.Scanner;

    public class Array {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            String[] mascotas = new String[10];

            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese el nombre de un animal : [" + i + "]");
                mascotas[i] = entrada.next();
            }

            System.out.println("Los nombres de las mascotas ingresadas son:");
            for (int i = 0; i < 10; i++) {
                System.out.println("[" + i + "] " + mascotas[i]);
            }
        }
    }