public class SistemaPrincipal {
        public static void main(String[] args) {
            // Crear instancias de Empleado
            Empleado empleado1 = new Empleado("César Patiño", 25, 50000, "Desarrollador");
            Empleado empleado2 = new Empleado("Katherin Patiño", 23, 55000, "Ingeniera de Robótica");

            // Mostrar la información de cada empleado
            System.out.println("Información de Empleados:");
            System.out.println();
            empleado2.mostrarInformacion();
            empleado1.setSalario(55000);
            empleado1.mostrarInformacion();
            // Obtener el nombre de 'empleado1'
            String nombreEmpleado = empleado1.getNombre();
            System.out.println(nombreEmpleado);  // Imprime "César Patiño"

        }
}
