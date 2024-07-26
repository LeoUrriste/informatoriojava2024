package pooEjercicio;

public class AppEjercicio {
    public static void main(String[] args) {

        //persona
        PersonaEjercicio personaEjercicio = new PersonaEjercicio();

        personaEjercicio.setDni(12389457L);

        personaEjercicio.setNombre("Leo");

        //personaEjercicio.setFechaDeNacimiento(18/04/1989);

        //vehiculo
        VehiculoEjercicio vehiculo = new VehiculoEjercicio();
        vehiculo.setMarca("Citroen");
        vehiculo.setCantidadDeRuedas(4);
        vehiculo.setKmMaximo("150");
        vehiculo.setKmMinimo("20");

        personaEjercicio.setVehiculo(vehiculo);


        System.out.println(personaEjercicio.getdni());
        System.out.println(personaEjercicio.getNombre());

        System.out.println(personaEjercicio.getVehiculo().getMarca());
        System.out.println(personaEjercicio.getVehiculo().getCantidadDeRuedas());
        System.out.println(personaEjercicio.getVehiculo().getKmMaximo());
        System.out.println(personaEjercicio.getVehiculo().getKmMinimo());

    }
}
