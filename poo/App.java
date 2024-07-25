package poo;

public class App {
    public static void main(String[] args) {
        //Para instancias
        //1.Tipo de dato -> Clase Persona
        //2.Variable para guardar el objeto
        //3.Instanciar objeto con new NombreDeClase()
        Persona persona = new Persona();

        persona.nombre = "Leo";

        System.out.println(persona.nombre);

        System.out.println("-------");

        persona.setNombre2("Damian");
        System.out.println(persona.getNombre2());
    }
}
