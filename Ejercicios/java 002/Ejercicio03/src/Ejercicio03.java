//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> caracteresSinEspacio = new ArrayList<>();

        System.out.println("Ingrese una palabra a comprobar si es palíndroma:");
        String texto = scanner.nextLine();

        char[] textoArray = convertirToArray(texto);

        eliminarEspacios(textoArray, caracteresSinEspacio);

        char[] textoArrayFinal = convertirArreglo(caracteresSinEspacio);
        char[] textoArrayInvertido = invertirArreglo(caracteresSinEspacio);

        if (esPalindromo(textoArrayFinal, textoArrayInvertido)) {
            System.out.println("La palabra es palindorma");
        } else {
            System.out.println("La palabra no es palindroma");
        }
    }

    public static char[] convertirToArray(String texto) {
        return texto.toCharArray();
    }

    public static void eliminarEspacios(char[] textoArray, List<Character> caracteresSinEspacio) {
        for (char caracter : textoArray) {
            if (caracter != ' ') {
                caracteresSinEspacio.add(caracter);
            }
        }
    }

    public static char[] convertirArreglo (List<Character> caracteresSinEspacioLista) {
        char[] textoArrayTemp = new char[caracteresSinEspacioLista.size()];
        for (int i = 0; i < caracteresSinEspacioLista.size(); i++) {
            textoArrayTemp[i] = caracteresSinEspacioLista.get(i);
        }
        return textoArrayTemp;
    }

    public static char[] invertirArreglo(List<Character> caracteresSinEspacio) {
        Collections.reverse(caracteresSinEspacio);
        char[] textoArrayTemp = new char[caracteresSinEspacio.size()];
        for (int i = 0; i < caracteresSinEspacio.size(); i++) {
            textoArrayTemp[i] = caracteresSinEspacio.get(i);
        }
        return textoArrayTemp;
    }

    public static boolean esPalindromo(char[] textoArrayFinal, char[] textoArrayInvertido) {
        String palabra = new String(textoArrayFinal);
        String palabraInvertida = new String(textoArrayInvertido);
        if (palabra.equals(palabraInvertida)) {
            return true;
        }
        return false;
    }

}