public class MiClase {
    static int variableEstatica = 0;
    int variableInstancia = 1;

    public static int metodoEstatico() {
        return variableEstatica;
        return variableInstancia; // error porque estoy intentando acceder a una variable de instancia a través de un metodo estático
    }

    public int metodoInstancia() {
        return variableEstatica + variableInstancia; //no hay error por que un metodo instancia puede acceder a las variables estáticas
    }
}
