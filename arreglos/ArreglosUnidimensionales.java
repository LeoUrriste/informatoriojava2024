package arreglos;

public class ArreglosUnidimensionales {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        System.out.println("el tamano del arreglos es: " + array.length);
        System.out.println("acceder al valor de la posicion 3: "+ array[2]);
        System.out.println(" ");


        //declarar y no inicializar
        int[] array2 = new int[6];
        System.out.println("valor en la posicion 1 " + array2[0]);

        char[] array3 = new char[6];
        double[] array4 = new double[6];
        boolean[] array5 = new boolean[6];

        //cambiar el valor en una posicion
        array[0] = 100;

        //con un bucle for recorrer
        for (int i = 0; i < array.length; i++){
            System.out.println("elemento: " + i);
            System.out.println("valor: " + array[i]);
        }
        System.out.println("-------------");

        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.println("elemento: " + i);
            System.out.println("valor: " + array[i]);
        }

        }
}
