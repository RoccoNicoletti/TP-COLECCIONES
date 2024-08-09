import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // crear los objetos de tipo Celular
        Celular celular1 = new Celular(1, "Galaxy S21", "Samsung", "22358389");
        Celular celular2 = new Celular(2, "iPhone 12", "Apple", "134294924");
        Celular celular3 = new Celular(3, "Redmi Note 10", "Xiaomi", "22358849");
        Celular celular4 = new Celular(4, "Moto G Power", "Motorola", "114988483");
        Celular celular5 = new Celular(5, "P40 Pro", "Huawei", "347574858");
        Celular celular6 = new Celular(6, "Galaxy A52", "Samsung", "223859409");
        Celular celular7 = new Celular(7, "Mi 10T Pro", "Xiaomi", "526478294");
        Celular celular8 = new Celular(8, "iPhone SE", "Apple", "665848859");
        Celular celular9 = new Celular(9, "Moto E7 Plus", "Motorola", "99584989");
        Celular celular10 = new Celular(10, "Nova 7 SE", "Huawei", "85893959");


        ///vendedores
        Vendedor vendedor1 = new Vendedor(1, "12345678", "Juan", "Perez", "juan.perez@example.com",
                "1234567890", LocalDate.now(), 30000, 0.1f, celular1);
        Vendedor vendedor2 = new Vendedor(2, "23456789", "Maria", "Gonzalez", "maria.gonzalez@example.com",
                "223654321", LocalDate.now(), 35000, 0.15f, celular2);
        Vendedor vendedor3 = new Vendedor(3, "34567890", "Pedro", "Rodriguez", "pedro.rodriguez@example.com",
                "22355555", LocalDate.now(), 32000, 0.02f, celular3);
        Vendedor vendedor4 = new Vendedor(4, "45678901", "Lucas", "Gomez", "luis.gomez@example.com",
                "223434444", LocalDate.now(), 28000, 0.08f, celular4);
        Vendedor vendedor5 = new Vendedor(5, "56789012", "Ana", "Lopez", "ana.lopez@example.com",
                "223493333", LocalDate.now(), 40000, 0.02f, celular5);

        ///repartidor

        Repartidor repartidor1 = new Repartidor(6, "66666666", "Laura", "Garcia",
                "laura.garcia@example.com", "66488495966",
                LocalDate.now(), 18000, 4, celular6);
        Repartidor repartidor2 = new Repartidor(7, "2857777", "Luis", "Hernandez",
                "luis.hernandez@example.com", "7777777777",
                LocalDate.now(), 20000, 10, celular7);
        Repartidor repartidor3 = new Repartidor(8, "88888888", "Julia", "Fernandez",
                "julia.fernandez@example.com", "8888888888",
                LocalDate.now(), 21000, 7, celular8);
        Repartidor repartidor4 = new Repartidor(9, "99999999", "Diego", "Gutierrez",
                "diego.gutierrez@example.com", "9999999999",
                LocalDate.now(), 19000, 3, celular9);
        Repartidor repartidor5 = new Repartidor(10, "10101010", "Sofia", "Perez",
                "sofia.perez@example.com", "1010101010",
                LocalDate.now(), 22000, 12, celular10);


      ///comisionista
        Comisionista comisionista1 = new Comisionista(10, "106567601", "Marta", "Hernandez",
                "marta.hernandez@example.com", "1010101010",
                LocalDate.now(), 29000, 24);

        Comisionista comisionista2 = new Comisionista(9, "9847599", "Lucas", "Gonzalez",
                "lucas.gonzalez@example.com", "9999999999",
                LocalDate.now(), 25000, 15);
        Comisionista comisionista3 = new Comisionista(8, "45888888", "Diego", "Castro",
                "diego.castro@example.com", "8888888888",
                LocalDate.now(), 27000, 18);
        Comisionista comisionista4 = new Comisionista(7, "44877777", "María", "Ramirez",
                "maria.ramirez@example.com", "7777777777",
                LocalDate.now(), 26000, 21);
        Comisionista comisionista5 = new Comisionista(6, "66589666", "Carlos", "Lopez",
                "carlos.lopez@example.com", "6666666666",
                LocalDate.now(), 28000, 25);


        ArrayList<Empleados> empleaditos= new ArrayList<Empleados>();
        empleaditos.add(vendedor1);
        empleaditos.add(vendedor2);
        empleaditos.add(vendedor3);
        empleaditos.add(vendedor4);
        empleaditos.add(vendedor5);
        empleaditos.add(repartidor1);
        empleaditos.add(repartidor2);
        empleaditos.add(repartidor3);
        empleaditos.add(repartidor4);
        empleaditos.add(repartidor5);
        empleaditos.add(comisionista1);
        empleaditos.add(comisionista2);
        empleaditos.add(comisionista3);
        empleaditos.add(comisionista4);
        empleaditos.add(comisionista5);

        Departamento depar=new Departamento(5, empleaditos);

        double sueldoAumentado= depar.aplicarAumento(4.5);
        System.out.println("Sueldo aumentado: " + sueldoAumentado); ///del vendedor 1, el primer agregado

        double contador1=depar.verCantRepar5salidas();
        System.out.println("Cantidad de repartidores con mas de 5 salidas = " + contador1);
        double contador2= depar.verCantVendedoresMenor5porcentaje();
        System.out.println("Cantidad de vendedores con porcentaje menor a 5 = " + contador2);
       double contador3=depar.verCantComi20Entregas();
        System.out.println("Cantidad de comi con mas de 20 entregas = " + contador3);
        double contador4=depar.verCantVendedoresMarcaSamsung();
        System.out.println("Cantidad de vendedores con marca samsung= " + contador4);
        Vendedor mayorVendedor=depar.vendedorConMayorPorcentajeDeVenta();
        System.out.println("El vendedor con mayor porcentaje de venta es: " + mayorVendedor.nombre);
        Repartidor mayorRepa=depar.verRepartidorconmasSalidas();
        System.out.println("El repartidor con mas salidas por dia es: " + mayorRepa.nombre);
        Comisionista menorComi=depar.verComisioMenosEntregas();
        System.out.println("El comisionista con menos entregas es: " + menorComi.nombre);
        double contador5=depar.cuantosTienen223();
        System.out.println("La cantidad de vendedores con 223 en su telefono personal son: " + contador5);








    }
}