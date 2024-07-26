package ascenario1.dominio;

public class Gato extends Animal{

    private String raza;

    @Override
    public void hacerSonido() {
        System.out.println("miau...");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
