import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del usuario: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa la edad del usuario: ");
        int edad = scanner.nextInt();


        System.out.println("El nombre del usuario es: " + nombre + " y tiene " + edad + " años");
    }
}