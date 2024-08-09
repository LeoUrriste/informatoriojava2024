package ejerGestionEstudiante.dominio;

import ejerGestionEstudiante.enumeration.ComplejidadEnum;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Institucion {
    private List<Curso> cursos = new ArrayList();


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


    public List<Curso> getCurso() {
        return cursos;
    }

    public void setCurso(List<Curso> curso) {
        this.cursos = cursos;
    }
}
