package ejercicioPoo2;


import ejercicioPoo2.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        List<ConcecionarioInterface> listaVehiculo = new ArrayList<ConcecionarioInterface>();

        Coches coche = new Coches("Citroen",123);
        Coches coche2 = new Coches("Toyota",456);

        Motos moto = new Motos("honda",789);

        List<Vehiculos>vehiculos = new ArrayList<>();
        vehiculos.add(coche);
        vehiculos.add(coche2);
        vehiculos.add(moto);



        for (Vehiculos vehiculo : vehiculos){
            System.out.println("Vehivulos: "+vehiculo);
            for (Vehiculos vehi : vehiculos){
                vehi.arranca();
            }


        }



        }




}

