package estructurada;

public class EstructuraSwitchCase {
    public static void main(String[] args) {

        int calificacion1 = 10;
        int calificacion2 = 5;

        String mensaje;

        int division = (calificacion1 + calificacion2) / 2;
        System.out.println("valor: " + division);

        switch (division){
            case 1:
                mensaje = "Desaprobaste";
                break;
            case 2:
                mensaje = "desaprobaste";
                break;
            default:
                mensaje = "valor no valido";
                break;
        }

        System.out.println(mensaje);

    }
}
