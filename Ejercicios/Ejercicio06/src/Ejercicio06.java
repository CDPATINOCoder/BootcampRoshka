/* Lee un número por teclado que pida el precio de un producto (puede tener
decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del
10%. */

import java.util.Scanner;

public class Ejercicio06 {

    public static final double IVA = 0.1   ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio = pedirPrecio(scanner);
        System.out.println("El precio Final es: " + calcularPrecio(precio));
    }

    public static double pedirPrecio(Scanner scanner) {
        System.out.println("Favor ingrese el precio del producto");
        double precio = scanner.nextDouble();
        return precio;
    }

    public static double calcularPrecio(double precio){
        double ivaAgregado = precio * IVA;
        double precioFinal = precio + ivaAgregado;
        precioFinal = Math.round(precioFinal * 100.0) / 100.0;
        return precioFinal;
    }

}