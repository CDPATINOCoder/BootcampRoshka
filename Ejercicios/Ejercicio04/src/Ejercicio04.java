//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = crearNombre(scanner);
        saludar(nombre);
    }

    public static String crearNombre(Scanner scanner) {
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        return nombre;
    }

    public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre);
    }

}