package ejercicioPoo2.dominio;

abstract public class Vehiculos {
    protected String marca;
    protected int chapa;

    public Vehiculos(String marca, int chapa){
        this.marca = marca;
        this.chapa = chapa;
    }

    public abstract void arranca();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getChapa() {
        return chapa;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }
}
