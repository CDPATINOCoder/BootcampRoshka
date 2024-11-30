import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Generala
{

    //esto es un comentario de prueba para verificar la rama creada
    public static void main(String[] args)
    {
        Dados dados = new Dados();
        System.out.println("\nLanzando Dados...");
        dados.mostrarDados();
        if (generala(dados)) {
            System.out.println("\nGENERALA");
        } else if (poker(dados)) {
            System.out.println("\nPOKER");
        } else if (full(dados)) {
            System.out.println("\nFULL");
        } else if (escalera(dados)) {
            System.out.println("\nESCALERA");
        } else {
            System.out.println("\nNADA");
        }
    }

    public static boolean generala(Dados dados) {
        List<Integer> valorDados = new ArrayList<>(dados.getDados());
        Collections.sort(valorDados);
        return valorDados.get(0).equals(valorDados.get(4));
    }

    public static boolean poker(Dados dados) {
        List<Integer> valorDados = new ArrayList<>(dados.getDados());
        Collections.sort(valorDados);
        boolean tieneCuatro = false;
        int[] contador = new int[7];
        for (int valor : valorDados) {
            contador[valor]++;
        }
        for (int i = 1; i < contador.length; i++) {
             if (contador[i] == 4) {
                 tieneCuatro = true;
             }
        }
        return tieneCuatro;
    }

public static boolean full(Dados dados) {
    List<Integer> valorDados = new ArrayList<>(dados.getDados());
    Collections.sort(valorDados);
    boolean tieneTrio = false;
    boolean tienePar = false;
    int[] contador = new int[7];
    for (int valor : valorDados) {
        contador[valor]++;
    }
    for (int i = 1; i < contador.length; i++) {
        if (contador[i] == 3) {
            tieneTrio = true;
        }
        if (contador[i] == 2) {
            tienePar = true;
        }
    }
    return tieneTrio && tienePar;
}

public static boolean escalera(Dados dados) {
    int[] contadorArray = new int[7];
    int contador = 0;
    List<Integer> valorDados = new ArrayList<>(dados.getDados());
    Collections.sort(valorDados);
    for (int valor : valorDados) {
        contadorArray[valor]++;
    }

    for (int i = 1; i < 6; i++) {
        if (contadorArray[i] == 1) {
            contador++;
        }
    }

    if (contador != 5) {
        contador = 0;
        for (int i = 2 ; i < 7; i++) {
            if (contadorArray[i] == 1) {
                contador++;
            }
        }
        if (contador != 5) {
            contador = 0;
            for (int i = 3; i < 7; i++) {
                if (contadorArray[i] == 1) {
                    contador++;
                }
            }
            if ((contador == 4) && (contadorArray[1] == 1)) {
                contador++;
            } else {
                contador = 0;
            }
        }
    }

    return contador == 5;

    }

}
