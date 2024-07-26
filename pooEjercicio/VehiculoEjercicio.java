package pooEjercicio;

public class VehiculoEjercicio {

    private String marca;
    private int cantidadDeRuedas;

    protected boolean competencia;
    protected boolean alarma;


    private String kmMaximo;
    private String kmMinimo;


    //constructor
    public VehiculoEjercicio(String marca, int cantidadDeRuedas, boolean competencia, String kmMaximo){
        this.marca = marca;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.competencia = true;
        this.alarma = true;
        this.kmMaximo = kmMaximo;

    }

    public VehiculoEjercicio(String marca, int cantidadDeRuedas, boolean competencia, String kmMinimo, String kmMaximo){
        this.marca = marca;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.competencia = true;
        this.alarma = true;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public String getKmMaximo() {
        return kmMaximo;
    }

    public void setKmMaximo(String kmMaximo) {
        this.kmMaximo = kmMaximo;
    }

    public String getKmMinimo() {
        return kmMinimo;
    }

    public void setKmMinimo(String kmMinimo) {
        this.kmMinimo = kmMinimo;
    }

    public boolean isCompetencia() {
        return competencia;
    }

    public void setCompetencia(boolean competencia) {
        this.competencia = competencia;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    
}
