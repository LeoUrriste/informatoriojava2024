package ejerGestionEstudiante;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //menu de opciones

        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese opcion: \n");
            System.out.println("1. Crear curso");
            System.out.println("2. Registrar estudiante nuevo");
            System.out.println("3. registrar un estudiante existente");
            System.out.println("4. Listar cursos");
            System.out.println("5. Listar cursos y estudiantes");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    //funcionadlidad crear curso
                    break;
                case 2:
                     //funcionalidad registrar estudiante nuevo
                    break;
                case 3:
                    // funcionalidad registrar estudiante existente
                    break;
                case 4:
                    //fincionalidad listar curso
                    break;
                case 5:
                    //funcionalidad listar curso y estudiante
                    break;
                case 6:
                    System.out.println("\n Aplicacion finalizada");
                    break;
                default:
                    break;
            }

        }while (opcion != 6);

        scanner.close();

    }
}
