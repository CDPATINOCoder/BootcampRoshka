/* Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si
no lo es lo volverá a pedir (do while), después muestra ese número por consola. */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        do {
            System.out.println("Por favor ingrese un número mayor o igual que cero");
            num = scanner.nextDouble();
        } while(num < 0);
        System.out.print("El número es: " + num);
    }
}