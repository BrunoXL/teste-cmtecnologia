package src.test.java.com.github.brunoxl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.java.com.github.brunoxl.CmTecnologia;

public class CmTecnologiaTest {

    @Test
    public void shouldInvert2x2MatrixDiagonals() {
        int[][] matrix = {{1, 2}, {3, 4}};

        int[][] expectedResult = {{4, 3}, {2, 1}};
        int[][] resultMatrix = CmTecnologia.invertMatrixDiagonals(matrix);

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Assertions.assertEquals(expectedResult[i][j], resultMatrix[i][j]);
            }
        }
    }

    @Test
    public void shouldInvert3x3MatrixDiagonals() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] expectedResult = {{9, 2, 7}, {4, 5, 6}, {3, 8, 1}};
        int[][] resultMatrix = CmTecnologia.invertMatrixDiagonals(matrix);

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Assertions.assertEquals(expectedResult[i][j], resultMatrix[i][j]);
            }
        }
    }

    @Test
    public void shouldInvert4x4MatrixDiagonals() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        int[][] expectedResult = {{16, 2, 3, 13}, {5, 11, 10, 8}, {9, 7, 6, 12}, {4, 14, 15, 1}};
        int[][] resultMatrix = CmTecnologia.invertMatrixDiagonals(matrix);

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Assertions.assertEquals(expectedResult[i][j], resultMatrix[i][j]);
            }
        }
    }

    @Test
    public void ShouldGetNumberOfSubMatrixWhenBLargerThanA() {
        int[][] a = {{1, 2}};
        int[][] b = {{1, 2}, {3, 4}};

        int result = CmTecnologia.numberOfMatrixInside(a, b);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void ShouldGetNumberOfSubMatrixWhenBSameSizeThanA() {
        int[][] a = {{1, 3}, {3, 5}};
        int[][] b = {{1, 2}, {3, 4}};

        int result = CmTecnologia.numberOfMatrixInside(a, b);

        Assertions.assertEquals(1, result);
    }

    @Test
    public void ShouldGetNumberOfSubMatrixNumberOfLinesIsEqual() {
        int[][] a = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int[][] b = {{1, 2}, {3, 4}, {5, 6}};
        int[][] c = {{1, 2, 0}, {3, 4, 0}, {5, 6, 0}};
        int[][] d = {{1, 2, 0, 0}, {3, 4, 0, 0}, {5, 6, 0, 0}};

        int result;

        result = CmTecnologia.numberOfMatrixInside(a, b);
        Assertions.assertEquals(4, result);

        result = CmTecnologia.numberOfMatrixInside(a, c);
        Assertions.assertEquals(3, result);

        result = CmTecnologia.numberOfMatrixInside(a, d);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void ShouldGetNumberOfSubMatrixNumberOfColumnsIsEqual() {
        int[][] a = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        int[][] b = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] c = {{1, 2}, {3, 4}, {5, 6}};
        int[][] d = {{1, 2}, {3, 4}};

        int result;

        result = CmTecnologia.numberOfMatrixInside(a, b);
        Assertions.assertEquals(2, result);

        result = CmTecnologia.numberOfMatrixInside(a, c);
        Assertions.assertEquals(3, result);

        result = CmTecnologia.numberOfMatrixInside(a, d);
        Assertions.assertEquals(4, result);
    }
}
