import clases.Reloj;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RelojDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reloj reloj1 = crearObjeto(scanner);
        Reloj reloj2 = crearObjeto(scanner);
        Reloj reloj3 = restarObjetos(reloj1, reloj2);
        System.out.println();
        System.out.println("La diferencia entre las horas es de: ");
        System.out.println(reloj3.toString());
        System.out.println();
        manipularTick(reloj1);
    }

    public static Reloj crearObjeto(Scanner scanner) {
        int segundos = -1;
        while (segundos < 0 || segundos > 86399) {
            try {
                System.out.print("Ingresa la cantidad de segundos que desea convertir a horas en formato 24hs: ");
                segundos = scanner.nextInt();
                if (segundos < 0 || segundos > 86399) {
                    System.out.println("Por favor, ingresa un número entre 0 y 86399.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Ingresa un número entero.");
                scanner.next();
            }
        }
        return new Reloj(segundos);
    }


    public static void manipularTick(Reloj objeto) {
        System.out.println("Imprimiendo incrementos: ");
       for (int i = 0; i < 10; i++) {
           objeto.tick();
           System.out.print("incremento N°: " + (i+1) + "\n");
           System.out.println(objeto.toString());
       }
    }

    public static Reloj restarObjetos(Reloj objeto1, Reloj objeto2) {
        return objeto1.restaReloj(objeto2);
    }
}