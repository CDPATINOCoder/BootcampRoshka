//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio07 {
    public static void main(String[] args) {
        System.out.println("Los números divisibles entre el 1 al 100 son estos:");
        for (int i = 1 ; i < 101 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}