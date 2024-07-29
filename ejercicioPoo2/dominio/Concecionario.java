package ejercicioPoo2.dominio;

import java.util.ArrayList;
import java.util.List;

public class Concecionario implements ConcecionarioInterface {
    private List<Vehiculos> vehiculos = new ArrayList<>();

    public Concecionario(List<Vehiculos> vehiculos){
        this.vehiculos = vehiculos;
    }


    @Override
    public void arranca(){
        for (Vehiculos vehiculos : vehiculos){
            vehiculos.arranca();
        }
    }


    public List<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }


}
