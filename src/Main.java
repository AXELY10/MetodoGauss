/**
 * Clase principal: coordina lectura de datos, resolución e impresión.
 */
public class Main {
    public static void main(String[] args) {
        LectorDatos lector = new LectorDatos();

        int n = lector.leerTamano();
        double[][] matriz = lector.leerMatriz(n);

        System.out.println("\nMatriz aumentada inicial:");
        Utilidades.imprimirMatriz(matriz);

        double[] solucion = Gauss.resolver(matriz);

        if (solucion == null) {
            System.out.println("El sistema no tiene solución única.");
        } else {
            Utilidades.imprimirSolucion(solucion);
        }
    }
}