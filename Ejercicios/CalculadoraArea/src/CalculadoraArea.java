import java.util.Scanner;

public class CalculadoraArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        Figura figura;
        System.out.println();
        System.out.println("|=====================================|");
        System.out.println("|         Calculadora de Áreas        |");
        System.out.println("|=====================================|");
        opciones();

        do {
            figura = null;
            opcion = validarOpcion(scanner);
            System.out.println();

            switch (opcion) {
                case 1:
                    figura = crearCirculo(scanner);
                    break;
                case 2:
                    figura = crearTriangulo(scanner);
                    break;
                case 3:
                    figura = crearRectangulo(scanner);
                    break;
                case 4:
                    opciones();
                    break;
                case 5:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Error: Opción no válida");
            }

            if (figura != null) {
                System.out.println("El area de la figura es: " + figura.calcularArea() + " m\u00B2");
            }

        } while (opcion != 5);

        scanner.close();

    }

    private static void opciones(){
        System.out.println("|Estas son las opciones disponibles:  |");
        System.out.println("|1. Calcular area de un circulo       |");
        System.out.println("|2. Calcular area de un triangulo     |");
        System.out.println("|3. Calcular area de un rectangulo    |");
        System.out.println("|4. Mostrar menú de  vuelta           |");
        System.out.println("|5. Salir del programa                |");
        System.out.println("|=====================================|");
    }

    private static int validarOpcion(Scanner scanner) {
        int opcion = 0;
        boolean entradaValida = false;
        do {
            System.out.println();
            System.out.printf("Seleccione una opcion: ");
            String entrada = scanner.nextLine();
            if(entrada.matches("^\\d+$")) {
                opcion = Integer.parseInt(entrada);
                entradaValida = true;
            } else {
                System.out.println("Ingresa solo un dato que sea de tipo númerico entre 1 y 5");
            }
        } while(!entradaValida);
        return opcion;
    }

    private static double validarValor(Scanner scanner, String mensaje) {
        double valor = 0;
        boolean entradaValida = false;
        do {
            System.out.printf("Valor de " + mensaje);
            String entrada = scanner.nextLine();
            if (entrada.matches("^\\d+(,\\d+)?$")) {
                entrada = entrada.replace(',', '.');
                valor = Double.parseDouble(entrada);
                if (valor == 0) {
                    System.out.println("El valor no puede ser 0");
                    System.out.println();
                } else {
                    entradaValida = true;
                }
            } else {
                System.out.println("Ingresa solo un dato, este puede ser entero o decimal positivo");
                System.out.println("En caso de ingresar un decimal, utilizar la coma (,)");
                System.out.println();
            }
        } while (!entradaValida);
        return valor;
    }

    private static Circulo crearCirculo(Scanner scanner) {
        System.out.println("Has seleccionado el Circulo");
        double radio = validarValor(scanner, "radio: ");
        return new Circulo(radio);
    }

    private static Triangulo crearTriangulo(Scanner scanner) {
        System.out.println("Has seleccionado el Triangulo");
        double base = validarValor(scanner, "base: ");
        double altura = validarValor(scanner, "altura: ");
        return new Triangulo(base, altura);
    }

    private static Rectangulo crearRectangulo(Scanner scanner) {
        System.out.println("Has seleccionado el Rectangulo");
        double largo = validarValor(scanner, "largo: ");
        double ancho = validarValor(scanner, "ancho: ");
        return new Rectangulo(largo, ancho);
    }
}