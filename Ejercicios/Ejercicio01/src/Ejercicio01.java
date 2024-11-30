/* Declara dos variables numéricas (con el valor que desees), muestra por consola la
suma, resta, multiplicación, división y módulo (resto de la división)  */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa el valor del primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("ingresa el valor del segundo número: ");
        double num2 = scanner.nextDouble();
        mostrarResultados(num1, num2);
    }

    public static double suma(double num1, double num2){
        return num1 + num2;
    }

    public static double resta(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error. División por cero");
        }
        return num1 / num2;
    }


    public static void mostrarResultados(double num1, double num2){
        System.out.println("La suma de los dos numeros es : " + suma(num1, num2));
        System.out.println("La resta (izquierda a derecha) de los dos números es: " + resta(num1, num2));
        System.out.println("La multiplicación de los dos números es: " + multiplicacion(num1, num2));
        System.out.println("La division (izquierda a derecha) de los dos números es: " + division(num1, num2));
    }

}