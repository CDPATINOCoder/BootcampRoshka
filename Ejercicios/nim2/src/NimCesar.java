import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;

public class NimCesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pilas = crearPilas();
        int pilaA = pilas[0];
        int pilaB = pilas[1];
        int pilaC = pilas[2];
        List<String> jugadores = jugadores(sc);
        imprimirPilas(pilaA, pilaB, pilaC);

        String jugador1 = jugadores.get(0);
        String jugador2 = jugadores.get(1);

        String opcion = null;
        boolean juegoTermino = false;

        int i = 1;
        int extraccion = 0;

        while (!juegoTermino) {
            if (i % 2 != 0) {
            System.out.println("\n" + jugador1 + " Elige una pila (a, b, c): ");
            opcion = sc.nextLine().toLowerCase();
                switch (opcion) {
                    case "a":
                        System.out.println("Cuántos quitará de la pila A?");
                        extraccion = validarExtraccion(sc);
                        sc.nextLine();
                        if (pilaA == 0) {
                            System.out.println("La pila ya se encuentra vacío");
                            continue;
                        }
                        if (extraccion > pilaA) {
                            System.out.println("No puedes quitar más elementos de lo que hay en la pila");
                            continue;
                        }
                        pilaA = pilaA - extraccion;
                        imprimirPilas(pilaA, pilaB, pilaC);
                        break;
                    case "b":
                        System.out.println("Cuántos quitará de la pila B?");
                        extraccion = sc.nextInt();
                        sc.nextLine();
                        if (pilaB == 0) {
                            System.out.println("La pila ya se encuentra vacío");
                            continue;
                        }
                        if (extraccion > pilaB) {
                            System.out.println("No puedes quitar más elementos de lo que hay en la pila");
                            continue;
                        }
                        pilaB = pilaB - extraccion;
                        imprimirPilas(pilaA, pilaB, pilaC);
                        break;
                    case "c":
                        System.out.println("Cuántos quitará de la pila C?");
                        extraccion = sc.nextInt();
                        sc.nextLine();
                        if (pilaC == 0) {
                            System.out.println("La pila ya se encuentra vacío");
                            continue;
                        }
                        if (extraccion > pilaC) {
                            System.out.println("No puedes quitar más elementos de lo que hay en la pila");
                            continue;
                        }
                        pilaC = pilaC - extraccion;
                        imprimirPilas(pilaA, pilaB, pilaC);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        continue;
                }

                if (pilaA == 0 && pilaB == 0 && pilaC == 0) {
                    juegoTermino = true;
                    System.out.println("¡El juego ha terminado!, El ganador es " + jugador2);
                }

            } else {
                System.out.println("\n" + jugador2 + " Elige una pila (A, B, C): ");
                opcion = sc.nextLine().toLowerCase();
                switch (opcion) {
                    case "a":
                        System.out.println("Cuántos quitará de la pila A?");
                        extraccion = sc.nextInt();
                        sc.nextLine();
                        if (pilaA == 0) {
                            System.out.println("La pila ya se encuentra vacío");
                            continue;
                        }
                        if (extraccion > pilaA) {
                            System.out.println("No puedes quitar más elementos de lo que hay en la pila");
                            continue;
                        }
                        pilaA = pilaA - extraccion;
                        imprimirPilas(pilaA, pilaB, pilaC);
                        break;
                    case "b":
                        System.out.println("Cuántos quitará de la pila B?");
                        extraccion = sc.nextInt();
                        sc.nextLine();
                        if (pilaB == 0) {
                            System.out.println("La pila ya se encuentra vacío");
                            continue;
                        }
                        if (extraccion > pilaB) {
                            System.out.println("No puedes quitar más elementos de lo que hay en la pila");
                            continue;
                        }
                        pilaB = pilaB - extraccion;
                        imprimirPilas(pilaA, pilaB, pilaC);
                        break;
                    case "c":
                        System.out.println("Cuántos quitará de la pila C?");
                        extraccion = sc.nextInt();
                        sc.nextLine();
                        if (pilaC == 0) {
                            System.out.println("La pila ya se encuentra vacío");
                            continue;
                        }
                        if (extraccion > pilaC) {
                            System.out.println("No puedes quitar más elementos de lo que hay en la pila");
                            continue;
                        }
                        pilaC = pilaC - extraccion;
                        imprimirPilas(pilaA, pilaB, pilaC);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        continue;
                }

            if (pilaA == 0 && pilaB == 0 && pilaC == 0) {
                juegoTermino = true;
                System.out.println("¡El juego ha terminado!, El ganador es " + jugador1);
            }

            }

            i++;

        }
    }

    public static int[] crearPilas() {
        int max = 21, min = 1;
        int pilaA = (int) (Math.random() * (max - min) + min);
        int pilaB = (int) (Math.random() * (max - min) + min);
        int pilaC = (int) (Math.random() * (max - min) + min);
        return new int[]{pilaA, pilaB, pilaC};
    }

    public static List<String> jugadores(Scanner sc) {
        List<String> jugadores = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Jugador " + (i + 1) + ", ingrese su nombre: ");
            String nombre = validarNombre(sc);
            while (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacío");
                nombre = validarNombre(sc);
            }
            jugadores.add(nombre);
        }
        return jugadores;
    }

    public static void imprimirPilas(int pilaA, int pilaB, int pilaC) {
        System.out.println("A: " + pilaA + "   B: " + pilaB + "   C: " + pilaC);
    }

    public static int validarExtraccion(Scanner scanner) {
        boolean esValido = false;
        int valor = 0;
        do {
            try {
                valor = scanner.nextInt();
                esValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada Inválida");
                System.out.println("El dato debe ser de tipo númerico");
                scanner.next();
            }
        } while (!esValido);
        return valor;
    }

    public static String validarNombre(Scanner scanner) {
        boolean esValido = false;
        String nombre = null;
        do {
            nombre = scanner.nextLine().trim();
            if (nombre.length() > 30 || nombre.length() < 2 ) {
                System.out.println("El nombre es aceptado entre 2 a 30 caractéres, ingrese nuevamente");
                continue;
            }
            if (!(nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$"))) {
                System.out.println("El nombre solo acepta caracteres sin espacios, ingrese nuevamente");
                continue;
            }
            esValido = true;
        } while (!esValido);
        return nombre;
    }

}
