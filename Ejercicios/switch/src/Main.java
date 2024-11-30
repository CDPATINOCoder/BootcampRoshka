import java.util.Scanner;

public class Main {

    public static final double PI = 3.14159265359;

    public static void main(String[] args){
        //Crear un programa que calcule el área de un círculo, triángulo o rectángulo según la opción ingresada.
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenido a esta calculadora de areas");
            System.out.println("Estas son las opciones: ");
            System.out.println("1. Calcular el área de un triangulo");
            System.out.println("2. Calcular el área de un rectangulo");
            System.out.println("3. Calcular el área de un circulo");
            System.out.println("4. Cerrar Programa");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Calcularemos el área de un triangulo, favor ingrese los siguientes datos: ");
                    System.out.printf("Base: ");
                    float base = scanner.nextFloat();
                    System.out.printf("Altura: ");
                    float altura = scanner.nextFloat();
                    System.out.println("El área del Triangulo es: " + (base * altura) / 2 + "m\u00B2");
                    break;
                case 2:
                    System.out.println("Calcularemos el área de un rectangulo, favor ingresar los siguientes datos: ");
                    System.out.printf("Largo: ");
                    float largo = scanner.nextFloat();
                    System.out.printf("Ancho: ");
                    float ancho = scanner.nextFloat();
                    System.out.println("El área del rectangulo es: " + (largo * ancho) + " m\u00B2");
                    break;
                case 3:
                    System.out.println("Calcularemos el área de un circulo, favor ingresar los siguientes datos: ");
                    System.out.println("Radio: ");
                    float radio = scanner.nextFloat();
                    System.out.println("El área de la circunferencia es: " + (PI * Math.pow(radio, 2)) + "m\u00B2");
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("La opción seleccionada no es la correcta");
            }
        } while (opcion != 4);
        scanner.close();
    }
}