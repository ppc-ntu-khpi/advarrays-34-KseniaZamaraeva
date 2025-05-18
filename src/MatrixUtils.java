import java.util.Arrays;

public class MatrixUtils {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        Arrays.setAll(result, i -> Arrays.stream(matrix).mapToInt(row -> row[i]).toArray());
        return result;
    }
}
