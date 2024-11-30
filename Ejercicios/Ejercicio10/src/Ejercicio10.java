//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Ingrese un día de la semana");
        Scanner scanner = new Scanner(System.in);
        String dia = scanner.nextLine();
        dia = dia.toLowerCase();
        diasDeLaSemana(dia);
    }

    public static void diasDeLaSemana(String dia) {
        switch (dia) {
            case "lunes":
                System.out.println("Es un día laboral");
                break;
            case "martes":
                System.out.println("Es un día laboral");
                break;
            case "miercoles":
                System.out.println("Es un día laboral");
                break;
            case "jueves":
                System.out.println("Es un día laboral");
                break;
            case "viernes":
                System.out.println("Es un día laboral");
                break;
            case "sabado":
                System.out.println("No es un día laboral");
                break;
            case "domingo":
                System.out.println("No es un día laboral");
                break;
            default:
                System.out.println("Entrada no válida");
        }
    }
}