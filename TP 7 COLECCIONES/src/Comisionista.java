import java.time.LocalDate;

public class Comisionista extends Empleados {

    private int cantEntregas;




    public Comisionista(int cantEntregas) {
        this.cantEntregas = cantEntregas;
    }

    public Comisionista(int legajo, String dni, String nombre, String apellido, String email, String telefono, LocalDate fechaIngreso, double salarioBase, int cantEntregas) {
        super(legajo, dni, nombre, apellido, email, telefono, fechaIngreso, salarioBase);
        this.cantEntregas = cantEntregas;
    }


    ///GETTERS Y SETTERS

    public int getCantEntregas() {
        return cantEntregas;
    }

    public void setCantEntregas(int cantEntregas) {
        this.cantEntregas = cantEntregas;
    }


    ///METODOS


    @Override
    public String toString() {
        return "Comisionista{" +
                "cantEntregas=" + cantEntregas +
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

        return salarioBase+ (cantEntregas*1000);

    }



}
