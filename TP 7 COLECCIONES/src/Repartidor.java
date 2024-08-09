import java.time.LocalDate;

public class Repartidor extends Empleados implements Llamadas {

    private int salidasPordia;

    private Celular celularAsignado;



    public Repartidor(){ ///CONSTRUCTORES

    }


    public Repartidor(int salidasPordia, Celular celularAsignado) {
        this.salidasPordia = salidasPordia;
        this.celularAsignado = celularAsignado;
    }

    public Repartidor(int legajo, String dni, String nombre, String apellido, String email, String telefono, LocalDate fechaIngreso, double salarioBase, int salidasPordia, Celular celularAsignado) {
        super(legajo, dni, nombre, apellido, email, telefono, fechaIngreso, salarioBase);
        this.salidasPordia = salidasPordia;
        this.celularAsignado = celularAsignado;
    }

    ///GETTERS Y SETTERS


    public int getSalidasPordia() {
        return salidasPordia;
    }

    public void setSalidasPordia(int salidasPordia) {
        this.salidasPordia = salidasPordia;
    }

    public Celular getCelularAsignado() {
        return celularAsignado;
    }

    public void setCelularAsignado(Celular celularAsignado) {
        this.celularAsignado = celularAsignado;
    }

    ///METODOS

    @Override
    public void llamar() {

    }

    @Override
    public void atender() {

    }

    @Override
   public double calcularSalario(){

       return this.salarioBase+ this.salidasPordia * 1000 ;

    }

}
