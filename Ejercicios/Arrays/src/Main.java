import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];
        System.out.println("En este programa veremos los arreglos en java");
        System.out.println("type[] name;");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);
        for (String car : cars) {
            System.out.println(car);
        }
        for (int i = 0 ; i < numeros.length; i++){
            System.out.println("posicion " + i + ":");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }

        int[][] multidimencional = new int[4][4];
        for (int i = 0 ; i < multidimencional.length ; i++) {
            for (int j = 0 ; i < multidimencional[i].length ; j++) {
                multidimencional[i][i] = scanner.nextInt();
            }
        }

    }
}