package poo;

public class Persona {
    //Atributos y metodos
    String nombre;
    String apellido;
    int edad;

    //si esta en privados tenemos que usar getter y setter
    private int dni;
    private String nombre2;

    //[clasificador] [tipoDeRetorno] nombreDelMetodo([<expresiones>]){}

    public void setNombre2(String nombre2){
        //forma de apuntar a atributos y metodos de la clase
        this.nombre2 = nombre2;
    }
    //generados de forma automatica
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    //Getter para devolver informacion
    public String getNombre2(){
        return nombre2;
    }
}
