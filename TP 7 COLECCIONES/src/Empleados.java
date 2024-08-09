import java.time.LocalDate;
import java.util.Objects;

public abstract class Empleados { ///CON ABSTRACTAS ES MEJOR PRACTICA USAR PROTECTED PARA NO CREAR GETTERS Y SETTERS

    protected int legajo;
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String telefono;
    protected LocalDate fechaIngreso;
    protected double salarioBase;

    public Empleados() { ///CONSTRUCT
    }

    public Empleados(int legajo, String dni, String nombre, String apellido, String email, String telefono, LocalDate fechaIngreso, double salarioBase) {
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
        this.salarioBase = salarioBase;
    }

    ///METODOS

    @Override
    public String toString() {
        return "Empleados{" +
                "legajo=" + legajo +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", salarioBase=" + salarioBase +
                '}';
    }


    public abstract double calcularSalario();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleados empleados)) return false;
        return dni.equals(empleados.dni);
    }


}
