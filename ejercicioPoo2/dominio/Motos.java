package ejercicioPoo2.dominio;

public class Motos extends Vehiculos{

    public Motos(String marca, int chapa){
        super(marca, chapa);
    }

    @Override
    public void arranca() {
        System.out.println("Moto Arranco");
    }


}
