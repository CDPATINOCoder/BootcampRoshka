public class Main {
    public static void main(String [] args) {
        System.out.println("Para encontrar el valor máximo usamos Math.max(x, y)");
        int x = 5, y = 10;
        System.out.println(Math.max(x, y));
        System.out.println("Para enontrar el valor minimo usamos Math.min(x,y)");
        System.out.println(Math.min(x, y));
        System.out.println("Para retornar la raiz de un numero usamos Math.sqrt(x)");
        System.out.println(Math.sqrt(25));
        System.out.println("Para retornar un valor absoluto usamos Math.sqrt(x)");
        System.out.println(Math.abs(-4.7));
        System.out.println("Para retornar un número random entre 0(inclusive) y 1(exclusive) usamos Math.random");
        System.out.println(Math.random());
        System.out.println("Para retornar un número random entre 0(inclusive) y N(exclusive)");
        int N = 10;
        System.out.println(Math.random() * N);
        System.out.println("Para retornar un número random entre min(inclusive) y max(exclusive)");
        int min = 1000, max = 10000;
        System.out.println(Math.random() * (max - min) + min);
        System.out.println("Para retornar un número entero entre un min y max especificamos el int");
        int numeroEntero = (int) (Math.random() * (max -min) + min);
        System.out.println(numeroEntero);
        System.out.println("Operador ternario");
        System.out.println("variable = (condicion) ? expressionTrue : expressionFalse");
        boolean esVerdadero = (5 > 10) ? true : false ;
        System.out.println(esVerdadero);
        System.out.println((5 < 2) ? "si" : "no");

    }
}