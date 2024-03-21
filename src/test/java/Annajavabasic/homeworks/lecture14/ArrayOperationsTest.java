package Annajavabasic.homeworks.lecture14;

public class ArrayOperationsTest {

    public static void main(String[] args) {
        int[][] testMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        boolean isSquare = ArrayOperations.isSquareMatrix(testMatrix);
        System.out.println("Is the test matrix square? " + isSquare);
    }
}

