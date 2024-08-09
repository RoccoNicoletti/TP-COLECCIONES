import java.util.ArrayList;

public class Departamento {

    private int codigoDepto;

    private ArrayList<Empleados> empleados;



    public Departamento(){ ///CONSTRUC

    }

    public Departamento(int codigoDepto, ArrayList<Empleados> empleados) {
        this.codigoDepto = codigoDepto;
        this.empleados = empleados;
    }





    ///getters y setters


    public int getCodigoDepto() {
        return codigoDepto;
    }

    public void setCodigoDepto(int codigoDepto) {
        this.codigoDepto = codigoDepto;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }

    ///METODOS


    @Override
    public String toString() {
        return "Departamento{" +
                "codigoDepto=" + codigoDepto +
                ", empleados=" + empleados +
                '}';
    }


    public double aplicarAumento(double aumento){

        for(int i=0; i<empleados.size(); i++){

            return  empleados.get(i).salarioBase * (aumento / 100);
        }

        return 0;
    }

    public double verCantVendedores(){

        int contador=0;
        for(Empleados empleadito: empleados)
            if(empleadito instanceof Vendedor){

                contador++;

            }

          return contador;

    }




    public double verCantComision(){

        int contador=0;
        for(Empleados empleadito: empleados)
            if(empleadito instanceof Comisionista){

                contador++;

            }

        return contador;

    }


    public double verCantRepar(){

        int contador=0;
        for(Empleados empleadito: empleados)
            if(empleadito instanceof Repartidor){

                contador++;

            }

        return contador;

    }


    public double verCantRepar5salidas(){

        int contador=0;
        for(Empleados empleadito: empleados) {
            if (empleadito instanceof Repartidor) {
                if (((Repartidor) empleadito).getSalidasPordia() > 5)

                    contador++;

            }
        }
        return contador;

    }

    public double verCantVendedoresMenor5porcentaje(){

        int contador=0;
        for(Empleados empleadito: empleados) {
            if (empleadito instanceof Vendedor) {
                if (((Vendedor) empleadito).getPorcentajeComision() < 0.05) {

                    contador++;

                }
            }
        }
        return contador;

}

    public double verCantComi20Entregas(){

        int contador=0;
        for(Empleados empleadito: empleados) {
            if (empleadito instanceof Comisionista) {
                if (((Comisionista) empleadito).getCantEntregas() >= 20) {

                    contador++;

                }
            }
        }
        return contador;

    }

    public double verCantVendedoresMarcaSamsung(){

        int contador=0;
        for(Empleados empleadito: empleados) {
            if (empleadito instanceof Repartidor) {
                if (((Repartidor) empleadito).getCelularAsignado().getMarca().equals("Samsung")) {

                    contador++;

                }
            }
        }
        return contador;

    }

    public Vendedor vendedorConMayorPorcentajeDeVenta ()
    {
        ///Creo un vendedorMayor nulo, por que al principio no sabemos cual es el mayor.
        Vendedor vendedorMayor = null;
        ///Recorremos el arrayList de empleados
        for (Empleados empleadito: this.empleados)
        {
            ///Si encontramos un vendedor en el arraylist de empleados
            if(empleadito instanceof Vendedor)
            {
                ///Creamos un vendedor auxiliar con ese vendedor.
                Vendedor vendedorAux = (Vendedor) empleadito;
                ///Si el vendedorMayor es null (Es la primera vuelta), el auxiliar pasa a ser el mayor para tener un vendedor con el que comparar.
                ///O si el vendedorAux tiene mayor porcentaje de comsiion que el mayor, el vendedor aux pasa a ser el mayor.
                if(vendedorMayor == null || vendedorAux.getPorcentajeComision() > vendedorMayor.getPorcentajeComision())
                {
                    vendedorMayor = vendedorAux;
                }
            }
        }
        return vendedorMayor;
    }


    public Repartidor verRepartidorconmasSalidas(){

        Repartidor mayor=null;

        for(Empleados empleadito: empleados){
            if(empleadito instanceof Repartidor){

                Repartidor aux=(Repartidor) empleadito;


                if(mayor==null|| aux.getSalidasPordia()>mayor.getSalidasPordia()){

                    mayor=aux;
                }
            }
        }

        return mayor;
    }




    public Comisionista verComisioMenosEntregas(){

        Comisionista menor=null;

        for(Empleados empleadito: empleados){
            if(empleadito instanceof Comisionista){

                Comisionista aux=(Comisionista) empleadito;


                if(menor==null|| aux.getCantEntregas()<menor.getCantEntregas()){

                    menor=aux;
                }
            }
        }

        return menor;
    }

    public double cuantosTienen223(){

        int contador=0;

        for(Empleados empleadito: empleados){
            if(empleadito instanceof Vendedor){
                String telefono=empleadito.telefono;

            if(telefono.substring(0,3).equals("223")){

                contador++;
            }

                }
        }

        return contador;

    }


}






