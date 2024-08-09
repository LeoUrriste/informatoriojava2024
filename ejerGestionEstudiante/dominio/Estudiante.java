package ejerGestionEstudiante.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private Long dni;
    private List<Curso> curso = new ArrayList<>();
    private String nombre;
    private LocalDate fechaNacimiento;

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public List<Curso> getCursos() {
        return curso;
    }

    public void setCursos(List<Curso> curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
