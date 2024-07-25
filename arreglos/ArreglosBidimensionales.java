package arreglos;

public class ArreglosBidimensionales {
    public static void main(String[] args) {

        int[][]arrBidemensional = {{1,2} , {3,4,5}};
        System.out.println("elemento 0,0: " + arrBidemensional[0][0]);

        for (int i = 0; i < arrBidemensional.length; i++) {
            for (int j = 0; j < arrBidemensional[i].length; j++) {
                //System.out.println(arrBidemensional[i][j]+ " ");
                System.out.println("elemento: "+ i +" , "+ j +" : "+ arrBidemensional[i][j]);

            }
        }


    }
}
