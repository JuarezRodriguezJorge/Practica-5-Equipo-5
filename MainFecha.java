public class MainFecha {
    public static void main(String[] args) {
        // Crear el objeto Fecha
        Fecha fecha1 = new Fecha(10, 24, 2026);

        // Mostrar fecha inicial
        System.out.print("La fecha inicial es: ");
        fecha1.mostrarFecha();

        // Modificar valores usando setters (usando setAño)
        fecha1.setMes(12);
        fecha1.setDia(25);
        fecha1.setAño(2027);

        // Mostrar valores individuales usando getters (usando getAño)
        System.out.println("\n--- Fecha modificada ---");
        System.out.println("Mes: " + fecha1.getMes());
        System.out.println("Día: " + fecha1.getDia());
        System.out.println("Año: " + fecha1.getAño());

        System.out.print("Fecha completa actualizada: ");
        fecha1.mostrarFecha();
    }
}