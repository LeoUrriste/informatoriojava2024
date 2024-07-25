package arreglos;

public class EjercicioEnClase {
    public static void main(String[] args) {
        /*
        dado un arreglo de 4 posiciones crear un programa en java
        que permita tomar los dos valores del medio eliminando los extremos.
        mostrar por pantalla el resultado
        {1,2,3,4} --> {2,3}
         */
        int[] arreglo = {1,2,3,4,5,6,7,8};

        int arreglo1 = (arreglo.length/2);
        int arreglo2 = (arreglo.length/2)+1;
        System.out.println(arreglo1);
        System.out.println(arreglo2);

    }
}
