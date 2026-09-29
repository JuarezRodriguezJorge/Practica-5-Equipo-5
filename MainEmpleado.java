public class MainEmpleado {
    public static void main(String[] args) {
        // Crear 2 objetos de tipo Empleado
        Empleado emp1 = new Empleado("Juan", "Pérez", 2500.0);
        Empleado emp2 = new Empleado("María", "Gómez", 3200.0);

        // Mostrar el salario anual de cada uno usando sus getters
        System.out.println("--- Salario Anual Inicial ---");
        System.out.println(emp1.getNombre() + " " + emp1.getApellido() + ": $" + emp1.getSalarioAnual());
        System.out.println(emp2.getNombre() + " " + emp2.getApellido() + ": $" + emp2.getSalarioAnual());

        // Aplicar aumento del 10% usando getters y setters
        double nuevoSalario1 = emp1.getSalarioMensual() * 1.10;
        emp1.setSalarioMensual(nuevoSalario1);

        double nuevoSalario2 = emp2.getSalarioMensual() * 1.10;
        emp2.setSalarioMensual(nuevoSalario2);

        // Mostrar nuevamente el salario anual
        System.out.println("\n--- Salario Anual con Aumento del 10% ---");
        System.out.println(emp1.getNombre() + " " + emp1.getApellido() + ": $" + emp1.getSalarioAnual());
        System.out.println(emp2.getNombre() + " " + emp2.getApellido() + ": $" + emp2.getSalarioAnual());
    }
}