//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio03 {
    public static void main(String[] args) {
        nombre();
    }

    public static void nombre() {
        String nombre = "César Patiño";
        saludar(nombre);
    }

    public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre);
    }
}