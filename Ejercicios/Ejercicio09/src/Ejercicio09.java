/* Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá
mas la contraseña y mostrara un mensaje diciendo “Correcto!”. Piensa bien en la
condición de salida (3 intentos y si acierta sale, aunque le queden intentos, si no acierta
en los 3 intentos mostrar el mensaje “Fallaste jaja!!”) */

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        String contrasenaSaved = "hola";
        String contrasena;
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        System.out.print("Ingrese la contraseña: ");
        while (intentos < 3) {
            contrasena = scanner.nextLine();
            if (contrasena.equals(contrasenaSaved)) {
                System.out.println("Correcto!");
                break;
            } else {
                System.out.println("Incorrecto!");
                System.out.print("intenta nuevamente: ");
                intentos++;
            }
            if (intentos == 3) {
                System.out.println("Fallaste jajaj!!");
                break;
            }
        }
    }
}