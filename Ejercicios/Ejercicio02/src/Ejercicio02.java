import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("ingresa el valor del segundo número: ");
        double num2 = scanner.nextDouble();
        mostrarResultados(num1, num2);
    }

    public static double mayor(double num1, double num2) {
        double mayor = 0;
        if (num1 == num2) {
            return Double.NaN;
        }
        mayor = Math.max(num1, num2);
        return mayor;
    }

    public static void mostrarResultados(double num1, double num2) {
        double mayor = mayor(num1, num2);
        if (Double.isNaN(mayor)) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("El número mayor es: " + mayor);
        }
    }
}