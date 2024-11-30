public class Main {
    public static void main(String[] args) {
        //Asignamos la palabra "hola mundo a la cadena"
        String texto = "Hola mundo xd";
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        System.out.println(texto.length());
        System.out.println(texto.indexOf("mundo"));
        System.out.println(texto.charAt(0)); //busca el caracter en la posicion 0
        System.out.println(texto.charAt(5)); //busca el caracter en la posicion 5
        String[] textoString = texto.split(" ");
        System.out.println(textoString[0]); //imprime la palabra dentro de la posicion 0 del array
        for (String palabra : textoString) { //imprime todas las palabras dentro del array
            System.out.println(palabra); //for (type variable : arrayname) {//}
        }

        String[] caracteres = texto.split("");
        for (String caracter : caracteres) {
            System.out.println(caracter);
        }
        String[] caracteresSinEspacio;

    }
}
