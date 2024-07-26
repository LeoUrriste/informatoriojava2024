package ascenario1.dominio;

abstract public class Animal {
    protected String nombre;
    protected int edad;


    public abstract void hacerSonido(); //abstrac no permite implementacion

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
