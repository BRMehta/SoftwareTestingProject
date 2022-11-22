package Calculator.Matrix;

public class addition
{
    public int[][] add(int[][] matrix1, int[][] matrix2 )
    {
        int row = matrix1.length;
        int col= matrix1.length;
        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
                result[i][j]=matrix1[i][j]+matrix2[i][j];

        }
        return result;
    }
}
