package estructurada;

public class EstructuraElseIf {
    public static void main(String[] args) {

        //siempre los booleanos en forma de pregunta
        boolean esUnDiaDeClases = true;

        //final es porque es constante
        final  String DIA = "Viernes";

        if ( esUnDiaDeClases && DIA == "Lunes" ){
            System.out.println("Hoy es: "+ DIA + " y no hay clases");
        } else if ( !esUnDiaDeClases ) {
            System.out.println("Hoy es: " + DIA + " y no hay clases");
        } else if (DIA != "Lunes"  ) {
            System.out.println("Hoy no es lunes");
        }

    }
}
