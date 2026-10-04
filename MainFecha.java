import java.util.Scanner;

public class MainFecha {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Leer los datos de la fecha
        System.out.print("Mes: ");
        int mes = entrada.nextInt();

        System.out.print("Día: ");
        int dia = entrada.nextInt();

        System.out.print("Año: ");
        int año = entrada.nextInt();

        // Crear el objeto Fecha con los datos ingresados
        Fecha fecha1 = new Fecha(mes, dia, año);

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

        entrada.close();
    }
}
