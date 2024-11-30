public class FileProcessor {
    public static void main(String[] args) {
        if (args.length > 0) {
            String fileName = args[0];
            System.out.println("Procesando el archivo: " + fileName);
            // Lógica para procesar el archivo
        } else {
            System.out.println("Por favor, proporciona el nombre del archivo.");
        }
    }
}