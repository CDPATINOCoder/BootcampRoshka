//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero = crearNumero(scanner);
        if (esDivisible(numero)) {
            System.out.println("El número ingresado es divisible entre 2");
        } else {
            System.out.println("El número ingresado no es divisible entre 2");
        }
    }

    public static double crearNumero(Scanner scanner) {
        System.out.println("Ingrese cualquier número");
        double numero = scanner.nextDouble();
        return numero;
    }

    public static boolean esDivisible(double numero) {
        boolean esDivisible = false;
        if (numero % 2 == 0) {
            esDivisible = true;
        }
        return esDivisible;
    }

}