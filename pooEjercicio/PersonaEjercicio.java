package pooEjercicio;

import java.time.LocalDate;

public class PersonaEjercicio {

    private Long dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;

    //CONTRUCTOR vacio
    public PersonaEjercicio(){}
    //Contructor completo
    public PersonaEjercicio(Long dni,String nombre,LocalDate fechaDeNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }



    //relacion
    private VehiculoEjercicio vehiculo;


    //setter
    public void setDni(Long dni){
        this.dni = dni;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    //getter
    public Long getdni(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public LocalDate getFechaDeNacimiento(){
        return this.fechaDeNacimiento;
    }

    //get y set vehiculo
    public VehiculoEjercicio getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoEjercicio vehiculo) {
        this.vehiculo = vehiculo;
    }
}
