/*Cargar un array de manera aleatoria con 10 números enteros del -5 al 5. Imprimirlo en
pantalla y computar cuál es el mayor elemento del vector. */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = crearArray(scanner);
        mayor(numeros);

    }

    public static int[] crearArray (Scanner scanner) {
        int[] numerosRandom = new int[10];
        int min = -5, max = 6;
        for (int i = 0 ; i < numerosRandom.length ; i++) {
            numerosRandom[i] = (int) (Math.random() * (max - min) +min);
        }
        for (int numero : numerosRandom) {
            System.out.println(numero);
        }
        return numerosRandom;
    }

    public static void mayor(int[] numeros){
        int mayor = numeros[0];
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("El elemento mayor es: " + mayor);
    }


}