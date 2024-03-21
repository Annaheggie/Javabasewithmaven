package Annajavabasic.homeworks.lecture14;


public class MatrixUtils {

    public static double calculateArithmeticMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            if (row.length != matrix.length) {
                return false;
            }
        }
        return true;
    }
}

