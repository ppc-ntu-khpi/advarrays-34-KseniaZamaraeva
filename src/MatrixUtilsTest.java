import java.util.Arrays;

public class MatrixUtilsTest {
    public static void main(String[] args) {
        int[][] matrix = {
            {7, 5, 54},
            {12, 21, 76},
            {15, 2, 32}
        };

        System.out.println("Початкова матриця:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        int[][] result = MatrixUtils.transpose(matrix);

        System.out.println("\nМатриця після транспонування:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
