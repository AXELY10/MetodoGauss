import java.util.Scanner;

/**
 * Se encarga de leer el sistema de ecuaciones desde el teclado.
 */
public class LectorDatos {

    private final Scanner sc = new Scanner(System.in);

    /** Lee el número de ecuaciones/incógnitas. */
    public int leerTamano() {
        System.out.print("Número de ecuaciones: ");
        return sc.nextInt();
    }

    /** Lee la matriz aumentada [A|b] de tamaño n x (n+1). */
    public double[][] leerMatriz(int n) {
        double[][] m = new double[n][n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println("Ecuación " + (i + 1) + " (" + n + " coeficientes y el término independiente):");
            for (int j = 0; j <= n; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        return m;
    }
}
