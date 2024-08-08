package ejerGestionEstudiante.dominio;

import ejerGestionEstudiante.enumeration.ComplejidadEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Curso {
    private String nombre;
    private Integer cantidadhoras;
    private ComplejidadEnum complejidad;

    private Map<Long,Estudiante> estudiantes = new TreeMap();
    private List<Examen> examenes = new ArrayList();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadhoras() {
        return cantidadhoras;
    }

    public void setCantidadhoras(Integer cantidadhoras) {
        this.cantidadhoras = cantidadhoras;
    }

    public ComplejidadEnum getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(ComplejidadEnum complejidad) {
        this.complejidad = complejidad;
    }

    public Map<Long, Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Map<Long, Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Examen> examenes) {
        this.examenes = examenes;
    }
}
