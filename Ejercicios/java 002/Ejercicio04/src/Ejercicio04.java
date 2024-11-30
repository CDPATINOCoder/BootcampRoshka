import java.util.Arrays;
public class Ejercicio04 {
    public static void main(String[] args) {
        String numeroString = crearString();
        int[] numeroArrayInt = new int[numeroString.length()];
        String[] numeroArrayString = new String[numeroString.length()];
        numeroArrayString = crearArray(numeroString);
        numeroArrayInt = modificarArray(numeroArrayString);
        imprimirArreglo(numeroArrayInt, numeroString);
    }

    public static String crearString() {
        int numeroRandom = (int)(Math.random() * 100000000);
        return Integer.toString(numeroRandom);
    }

    public static String[] crearArray(String numeroString) {
        return numeroString.split("");
    }

    public static int[] modificarArray(String[] numeroArrayString){
        int[] arregloModificado = new int[numeroArrayString.length];
        for (int i = 0; i < numeroArrayString.length; i++) {
            arregloModificado[i] = Integer.parseInt(numeroArrayString[i]);
        }
        return arregloModificado;
    }

    public static void imprimirArreglo (int[] numeroArrayInt, String numeroString) {
        System.out.println("El String con digitos generado es : " + numeroString);
        System.out.println("Este es el arreglo con los valores númericos de los digitos");
        for (int numero : numeroArrayInt) {
            System.out.print(numero + " ");
        }
    }

}