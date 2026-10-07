/**
 * Funciones auxiliares para mostrar matrices y vectores en consola.
 */
public class Utilidades {

    /** Imprime la matriz aumentada [A|b]. */
    public static void imprimirMatriz(double[][] m) {
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%10.4f ", m[i][j]);
            }
            System.out.printf("| %10.4f%n", m[i][n]);
        }
        System.out.println();
    }

    /** Imprime el vector solución. */
    public static void imprimirSolucion(double[] x) {
        System.out.println("Solución:");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("x%d = %.6f%n", i + 1, x[i]);
        }
    }
}