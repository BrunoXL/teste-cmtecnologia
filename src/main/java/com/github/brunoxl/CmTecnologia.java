package src.main.java.com.github.brunoxl;

import java.util.Arrays;

public class CmTecnologia {

    public static int[][] invertMatrixDiagonals(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[n - i - 1][n - i - 1];
            matrix[n - i - 1][n - i - 1] = temp;

            temp = matrix[i][n - i - 1];
            matrix[i][n - i - 1] = matrix[n - i - 1][i];
            matrix[n - i - 1][i] = temp;
        }
        return matrix;
    }

    public static int numberOfMatrixInside(int[][] A, int[][] B) {
        int numberLines_a = A.length;
        int numberColumns_a = A[0].length;
        int size_a = numberLines_a * numberColumns_a;

        int numberLines_b = B.length;
        int numberColumns_b = B[0].length;
        int size_b = numberLines_b * numberColumns_b;

        if (size_a < size_b) return 0;
        if (numberLines_a == numberLines_b && numberColumns_a == numberColumns_b) return 1;
        if (numberLines_a == numberLines_b) return numberColumns_a - numberColumns_b + 1;
        if (numberColumns_a == numberColumns_b) return numberLines_a - numberLines_b + 1;

        return 0;
    }
}
