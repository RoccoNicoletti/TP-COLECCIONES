import java.util.Objects;

public class Celular {

    private int idCelu;
    private String modelo;
    private String marca;
    private String numero;



    public Celular(){ ///CONSTRUC

    }


    public Celular(int idCelu, String modelo, String marca, String numero) {
        this.idCelu = idCelu;
        this.modelo = modelo;
        this.marca = marca;
        this.numero = numero;
    }






    ///GETTERS Y SETTERS

    public int getIdCelu() {
        return idCelu;
    }

    public void setIdCelu(int idCelu) {
        this.idCelu = idCelu;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    ///METODOS


    @Override
    public String toString() {
        return "Celular{" +
                "idCelu=" + idCelu +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Celular celular)) return false;
        return numero.equals(celular.numero);
    }


}

