import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador 1 :");
        String jugador1 = validarNombres(scanner);
        System.out.println("Ingrese el nombre del jugador 2 :");
        String jugador2 = validarNombres(scanner);
        int pilaA = crearPila();
        int pilaB = crearPila();
        int pilaC = crearPila();
        imprimirPilas(pilaA, pilaB, pilaC);
        turnar(scanner, jugador1, jugador2);

    }

    public static String validarNombres(Scanner scanner) {
        String nombre = null;
        boolean esValido = false;
        do {
            nombre = scanner.nextLine();
            if(nombre.length() < 3 || nombre.length() > 30) {
                System.out.println("El nombre acepta caractéres entre 3 y 30");
                System.out.print("\nIntente nuevamente: ");
                continue;
            }
            if (!(nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$"))) {
                System.out.println("El nombre solo acepta letras sin espacios");
                System.out.print("\nIntente nuevamente: ");
                continue;
            }
            esValido = true;
        } while (!esValido);
        return nombre;
    }

    public static int crearPila() {
        return (int) (Math.random() * (21 - 1) + 1);
    }

    public static void imprimirPilas(int A, int B, int C) {
        System.out.println("A: " + A + " B: " +  B + " C: " + C);
    }


    public static void turnar(Scanner scanner, String jugador1, String jugador2, int pilaA, int pilaB, int pilaC) {
        boolean seTermino = false;
        int turno = 1;
        while (!seTermino) {
            String jugadorActual = (turno % 2 != 0) ? jugador1 : jugador2;
                if (jugadorActual.equals(jugador1)) {
                    jugar(jugador1, scanner, pilaA, pilaB, pilaC);
                    continue;
                } else {
                    jugar(jugador2, scanner, pilaA, pilaB, pilaC);
                    continue;
                }
            }
        turno++;
        }

        public static void jugar(String jugador, Scanner scanner, int pilaA, int pilaB, int pilaC) {
            String opcionPila = "";
            do {
                opcionPila = scanner.nextLine();
                switch (opcionPila) {
                    case "a":
                        calcular();
                        imprimirPilas(pilaA, pilaB, pilaC);
                        break;
                    case "b":
                        calcular();
                        break;
                    case "c":
                        calcular();
                        break;
                    case "d":
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } while(!(opcionPila.equals('d')));
        }


    }
