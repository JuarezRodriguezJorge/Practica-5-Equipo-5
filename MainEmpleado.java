import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Leer datos del primer empleado
        System.out.println("--- Empleado 1 ---");

        System.out.print("Nombre: ");
        String nombre1 = entrada.nextLine();

        System.out.print("Apellido: ");
        String apellido1 = entrada.nextLine();

        System.out.print("Salario mensual: ");
        double salario1 = entrada.nextDouble();
        entrada.nextLine();

        // Leer datos del segundo empleado
        System.out.println("\n--- Empleado 2 ---");

        System.out.print("Nombre: ");
        String nombre2 = entrada.nextLine();

        System.out.print("Apellido: ");
        String apellido2 = entrada.nextLine();

        System.out.print("Salario mensual: ");
        double salario2 = entrada.nextDouble();

        // Crear los 2 objetos de tipo Empleado con los datos ingresados
        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);
        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        // Mostrar el salario anual de cada uno usando sus getters
        System.out.println("\n--- Salario Anual Inicial ---");
        System.out.println(emp1.getNombre() + " " + emp1.getApellido()
                + ": $" + emp1.getSalarioAnual());

        System.out.println(emp2.getNombre() + " " + emp2.getApellido()
                + ": $" + emp2.getSalarioAnual());

        // Aplicar aumento del 10% usando getters y setters
        double nuevoSalario1 = emp1.getSalarioMensual() * 1.10;
        emp1.setSalarioMensual(nuevoSalario1);

        double nuevoSalario2 = emp2.getSalarioMensual() * 1.10;
        emp2.setSalarioMensual(nuevoSalario2);

        // Mostrar nuevamente el salario anual
        System.out.println("\n--- Salario Anual con Aumento del 10% ---");
        System.out.println(emp1.getNombre() + " " + emp1.getApellido()
                + ": $" + emp1.getSalarioAnual());

        System.out.println(emp2.getNombre() + " " + emp2.getApellido()
                + ": $" + emp2.getSalarioAnual());

        entrada.close();
    }
}
