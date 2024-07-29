package ejercicioPoo2.dominio;

public class Coches extends Vehiculos{

    public Coches(String marca, int chapa) {
        super(marca, chapa);
    }

    @Override
    public void arranca() {
        System.out.println("Coche Arranca");
    }
}

