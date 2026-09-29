public class Empleado {
    
    private String nombre;
    private String apellido;
    private double salarioMensual;

    // Constructor
    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        // Se utiliza el setter para validar e inicializar
        setSalarioMensual(salarioMensual);
    }

    // Getters y Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        // Validación: Si el salario mensual no es positivo, no se establece su valor
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    

    public double getSalarioAnual() {
        // Se obtiene el salario mediante el getter
        return getSalarioMensual() * 12;
    }
}