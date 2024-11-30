import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numerosMasRepetidos = new ArrayList<>();
        List<Integer> numerosNoPresentes = new ArrayList<>();
        int[] numerosRandom = crearArray(scanner);
        computarArreglo(numerosRandom, numerosMasRepetidos);

        calcularNumerosNoPresentes(numerosRandom, numerosNoPresentes);

        if (!numerosNoPresentes.isEmpty()) {
            System.out.println("Estos son los números no presentes dentro del arreglo:");
            for (int numero : numerosNoPresentes) {
                System.out.print(numero + " ");
            }
            System.out.println();
        } else {
            System.out.println("Todos los números del rango están presentes.");
        }

        scanner.close();
    }

    public static int[] crearArray(Scanner scanner) {
        int[] numerosRandom = new int[100];
        int min = -30, max = 31;
        for (int i = 0; i < numerosRandom.length; i++) {
            numerosRandom[i] = (int) (Math.random() * (max - min) + min);
            System.out.print(numerosRandom[i] + " ");
        }
        System.out.println();
        return numerosRandom;
    }

    public static void computarArreglo(int[] numerosRandom, List<Integer> numerosMasRepetidos) {
        Arrays.sort(numerosRandom);
        System.out.println("El arreglo ordenado es: ");
        for (int numero : numerosRandom) {
            System.out.print(numero + " ");
        }
        System.out.println();

        int frecuencia = 1;
        int frecuenciaMax = 1;

        for (int i = 1; i < numerosRandom.length; i++) {
            if (numerosRandom[i] == numerosRandom[i - 1]) {
                frecuencia++;
            } else {
                if (frecuencia > frecuenciaMax) {
                    frecuenciaMax = frecuencia;
                    numerosMasRepetidos.clear();
                    numerosMasRepetidos.add(numerosRandom[i - 1]);
                } else if (frecuencia == frecuenciaMax) {
                    numerosMasRepetidos.add(numerosRandom[i - 1]);
                }
                frecuencia = 1;
            }
        }

        if (frecuencia > frecuenciaMax) {
            frecuenciaMax = frecuencia;
            numerosMasRepetidos.clear();
            numerosMasRepetidos.add(numerosRandom[numerosRandom.length - 1]);
        } else if (frecuencia == frecuenciaMax) {
            numerosMasRepetidos.add(numerosRandom[numerosRandom.length - 1]);
        }

        if (numerosMasRepetidos.size() > 1) {
            System.out.println("Los números más repetidos son: " + numerosMasRepetidos);
        } else {
            System.out.println("El número más repetido es: " + numerosMasRepetidos.get(0));
        }
    }

    public static void calcularNumerosNoPresentes(int[] numerosRandom, List<Integer> numerosNoPresentes) {
        boolean[] presente = new boolean[61];

        for (int numero : numerosRandom) {
            presente[numero + 30] = true;
        }

        for (int i = -30; i <= 30; i++) {
            if (!presente[i + 30]) {
                numerosNoPresentes.add(i);
            }
        }
    }
}