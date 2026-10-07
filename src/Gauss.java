/**
 * Implementación del método de eliminación de Gauss
 * con pivoteo parcial y sustitución hacia atrás.
 */
public class Gauss {

    private static final double EPSILON = 1e-12;

    /**
     * Resuelve el sistema representado por la matriz aumentada.
     * @param m matriz aumentada n x (n+1) (se modifica)
     * @return vector solución, o null si no hay solución única
     */
    public static double[] resolver(double[][] m) {
        int n = m.length;

        // Eliminación hacia adelante
        for (int k = 0; k < n - 1; k++) {
            // Pivoteo parcial: buscar la fila con mayor valor absoluto en la columna k
            int filaMax = k;
            for (int i = k + 1; i < n; i++) {
                if (Math.abs(m[i][k]) > Math.abs(m[filaMax][k])) {
                    filaMax = i;
                }
            }
            intercambiarFilas(m, k, filaMax);

            if (Math.abs(m[k][k]) < EPSILON) {
                return null; // pivote nulo: sin solución única
            }

            // Hacer ceros debajo del pivote
            for (int i = k + 1; i < n; i++) {
                double factor = m[i][k] / m[k][k];
                for (int j = k; j <= n; j++) {
                    m[i][j] -= factor * m[k][j];
                }
            }
            System.out.println("Paso " + (k + 1) + ":");
            Utilidades.imprimirMatriz(m);
        }

        if (Math.abs(m[n - 1][n - 1]) < EPSILON) {
            return null;
        }

        return sustitucionAtras(m);
    }

    /** Sustitución hacia atrás sobre la matriz triangular superior. */
    private static double[] sustitucionAtras(double[][] m) {
        int n = m.length;
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double suma = 0;
            for (int j = i + 1; j < n; j++) {
                suma += m[i][j] * x[j];
            }
            x[i] = (m[i][n] - suma) / m[i][i];
        }
        return x;
    }

    private static void intercambiarFilas(double[][] m, int a, int b) {
        if (a == b) return;
        double[] temp = m[a];
        m[a] = m[b];
        m[b] = temp;
    }
}