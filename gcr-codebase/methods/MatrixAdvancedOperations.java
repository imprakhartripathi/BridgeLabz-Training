/*
Program:
Perform matrix manipulation operations:
- Transpose
- Determinant (2x2 and 3x3)
- Inverse (2x2 and 3x3)

Random matrices are generated as input.
*/

public class MatrixAdvancedOperations {

    // a. Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 9) + 1; // values 1–9
            }
        }
        return matrix;
    }

    // b. Method to find transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] transposed = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // c. Determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // d. Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // e. Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);

        if (det == 0) {
            return null; // Inverse not possible
        }

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    // f. Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);

        if (det == 0) {
            return null; // Inverse not possible
        }

        double[][] adj = new double[3][3];

        adj[0][0] =  (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        adj[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        adj[0][2] =  (m[0][1] * m[1][2] - m[0][2] * m[1][1]);

        adj[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        adj[1][1] =  (m[0][0] * m[2][2] - m[0][2] * m[2][0]);
        adj[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);

        adj[2][0] =  (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        adj[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);
        adj[2][2] =  (m[0][0] * m[1][1] - m[0][1] * m[1][0]);

        // Transpose adjugate and divide by determinant
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[j][i] / det;
            }
        }
        return inverse;
    }

    // g. Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Inverse not possible (Determinant = 0)");
            return;
        }

        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println("2x2 Matrix:");
        double[][] m2 = createRandomMatrix(2, 2);
        displayMatrix(m2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(m2));

        System.out.println("\nDeterminant: " + determinant2x2(m2));

        System.out.println("\nInverse:");
        displayMatrix(inverse2x2(m2));

        System.out.println("\n-----------------------------");

        System.out.println("\n3x3 Matrix:");
        double[][] m3 = createRandomMatrix(3, 3);
        displayMatrix(m3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(m3));

        System.out.println("\nDeterminant: " + determinant3x3(m3));

        System.out.println("\nInverse:");
        displayMatrix(inverse3x3(m3));
    }
}
