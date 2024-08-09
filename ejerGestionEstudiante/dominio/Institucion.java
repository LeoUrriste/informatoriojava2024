package ejerGestionEstudiante.dominio;

import ejerGestionEstudiante.enumeration.ComplejidadEnum;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Institucion {
    private List<Curso> cursos = new ArrayList();


    private Estudiante registrarEstudiante(){
        Estudiante estudianteNuevo = new Estudiante();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        sc.nextLine();
        estudianteNuevo.setNombre(nombreEstudiante);


        System.out.println("Ingrese el dni del estudiante: ");
        Long dni = sc.nextLong();
        sc.nextLine();
        estudianteNuevo.setDni(dni);

        System.out.println("Ingrese año de nacimiento del estudiante: ");
        int anoDeNacimiento = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese mes de nacimiento del estudiante: ");
        int mesDeNacimiento = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese día de nacimiento del estudiante: ");
        int diaDeNacimiento = sc.nextInt();
        sc.nextLine();

        LocalDate fechaDeNacimiento = LocalDate.of(anoDeNacimiento,mesDeNacimiento,diaDeNacimiento);
        estudianteNuevo.setFechaNacimiento(fechaDeNacimiento);

        return estudianteNuevo;
    }

    public void inscribirEstudiante(UUID idCurso){
        Estudiante estudiante = registrarEstudiante();

        boolean existeCurso = Boolean.FALSE;

        for (Curso curso: this.cursos){
            if ( curso.getId().equals(idCurso)){
                //Encontramos el curso
                estudiante.getCursos().add(curso);
                curso.getEstudiantes().put(estudiante.getDni(),estudiante);
                existeCurso = Boolean.TRUE;

                break;
            }
        }

        if (existeCurso){
            System.out.println("Estudiante asignado al curso");
        }
    }


    public Curso crearcurso(){
        //crear una nueva instancia
        Curso nuevoCurso = new Curso();
        Scanner sc = new Scanner(System.in);

        nuevoCurso.setId( UUID.randomUUID() );

        //mostrar por pantalla
        System.out.println("Ingrese el nombre del curso: ");
        //resibir dato
        String nombreCurso = sc.nextLine();
        sc.nextLine();
        //guardar dato
        nuevoCurso.setNombre( nombreCurso );

        System.out.println("Ingrese la complejidad del curso: ");
        System.out.println("1. ALTA");
        System.out.println("2. MEDIA");
        System.out.println("3. BAJA");
        int complejidad = sc.nextInt();
        sc.nextLine();

//        switch (complejidad){
//            case 1:
//                nuevoCurso.setComplejidad(ComplejidadEnum.ALTA);
//                break;
//            case 2:
//                nuevoCurso.setComplejidad(ComplejidadEnum.MEDIA);
//                break;
//            case 3:
//                nuevoCurso.setComplejidad(ComplejidadEnum.BAJA);
//                break;
//            default:
//                nuevoCurso.setComplejidad(null);
//        }

        //java 17 - switch
        nuevoCurso.setComplejidad(
                switch (complejidad){
                    case 1 -> ComplejidadEnum.ALTA;
                    case 2 -> ComplejidadEnum.MEDIA;
                    case 3 -> ComplejidadEnum.BAJA;
                    default -> null;
                }
        );

        System.out.println("Ingrese cantidad de horas del curso: ");
        int horas = sc.nextInt();
        sc.nextLine();
        nuevoCurso.setCantidadhoras(horas);

        //guardar en la lista
        this.cursos.add(nuevoCurso);
        System.out.println("Curso creado");

        return nuevoCurso;

    }


    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
