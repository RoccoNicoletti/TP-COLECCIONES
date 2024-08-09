import java.time.LocalDate;

public class Vendedor extends Empleados implements Llamadas {

    private float porcentajeComision;
    private Celular celularAsignado;





    public Vendedor(){ ///CONSTRUCTORES

    }


    public Vendedor(float porcentajeComision, Celular celularAsignado) {
        this.porcentajeComision = porcentajeComision;
        this.celularAsignado = celularAsignado;
    }

    public Vendedor(int legajo, String dni, String nombre, String apellido, String email, String telefono, LocalDate fechaIngreso, double salarioBase, float porcentajeComision, Celular celularAsignado) {
        super(legajo, dni, nombre, apellido, email, telefono, fechaIngreso, salarioBase);
        this.porcentajeComision = porcentajeComision;
        this.celularAsignado = celularAsignado;
    }

    ///GETTERS Y SETTERS


    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public Celular getCelularAsignado() {
        return celularAsignado;
    }

    public void setCelularAsignado(Celular celularAsignado) {
        this.celularAsignado = celularAsignado;
    }


    ///METODOS


    @Override
    public String toString() {
        return "Vendedor{" +
                "porcentajeComision=" + porcentajeComision +
                ", celularAsignado=" + celularAsignado +
                ", legajo=" + legajo +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public double calcularSalario() {

        return this.salarioBase+ this.porcentajeComision;
    }


    @Override

    public void llamar(){

    }

    @Override
    public void atender(){

    }
}
