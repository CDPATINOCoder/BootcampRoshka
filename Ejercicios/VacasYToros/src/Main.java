import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String numeroRandom = crearNumeroRandom(rand);
        System.out.println("Intenta adivinar el número random");

        boolean juegoActivo = true;

        while (juegoActivo) {
            System.out.print("Ingresa un número de 4 dígitos: ");
            String numero = scanner.nextLine();

            if (!esNumeroValido(numero)) {
                System.out.println("Número inválido. Intenta nuevamente.");
                continue;
            }

            int contadorToros = 0;
            int contadorVacas = 0;


            for (int i = 0; i < numeroRandom.length(); i++) {
                for (int j = 0; j < numero.length(); j++) {
                    if (numeroRandom.charAt(i) == numero.charAt(j)) {
                        if (i == j) {
                            contadorToros++; //
                        } else {
                            contadorVacas++;
                        }
                    }
                }
            }

            // Mostrar resultados al usuario
            System.out.println("Toros: " + contadorToros + ", Vacas: " + contadorVacas);

            // Verificar si el jugador ganó
            if (contadorToros == 4) {
                System.out.println("Adivinaste el número: " + numeroRandom);
                juegoActivo = false;
            }
        }

        scanner.close();
    }

    public static String crearNumeroRandom(Random rand){
        int min = 1000, max = 9999;
        int numeroRandom;
        boolean digitoUnico;
        String randomString;
        do {
            numeroRandom = rand.nextInt(max - min + 1) + min;
            randomString = Integer.toString(numeroRandom);
            digitoUnico = true;

            for (int i = 0; i < randomString.length(); i++) {
                for (int j = i + 1; j < randomString.length(); j++) {
                    if (randomString.charAt(i) == randomString.charAt(j)) {
                        digitoUnico = false;
                        break;
                    }
                }
                if (!digitoUnico) {
                    break;
                }
            }
        } while (!digitoUnico);
        return randomString;
    }

    public static boolean esNumeroValido(String numero) {

        if (!numero.matches("^[1-9]\\d{3}$")){
            System.out.println("El numero debe ser de 4 digitos y no debe empezar con 0");
            return false;
        }
        for (int i = 0; i < numero.length(); i++) {
            char digitoActual = numero.charAt(i);
            if (numero.indexOf(digitoActual) != numero.lastIndexOf(digitoActual)) {
                System.out.println("Los digitos no pueden repetirse");
                return false;
            }
        }

        return true;

    }


}




