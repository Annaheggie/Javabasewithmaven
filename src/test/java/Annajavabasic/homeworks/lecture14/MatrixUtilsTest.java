package Annajavabasic.homeworks.lecture14;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatrixUtilsTest {

    @Test
    public void testIsSquareMatrix() {
        int[][] testMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(MatrixUtils.isSquareMatrix(testMatrix));
    }
}
