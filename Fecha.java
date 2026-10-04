public class Fecha {
    // Atributos privados
    private int mes;
    private int dia;
    private int año; 

    // Constructor
    public Fecha(int mes, int dia, int año) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }

        this.dia = dia;
        this.año = año;
    }

    // GETTERS Y SETTERS

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() { 
        return año;
    }

    public void setAño(int año) { 
        this.año = año;
    }

    // --- MÉTODOS DE MUESTRA ---

    public void mostrarFecha() {
        System.out.println(getMes() + "/" + getDia() + "/" + getAño());
    }
}
