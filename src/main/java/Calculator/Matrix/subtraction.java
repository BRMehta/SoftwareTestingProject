package Calculator.Matrix;

public class subtraction
{
    public int[][] subtract(int[][] matrix1, int[][] matrix2 )
    {
        int row = matrix1.length;
        int col= matrix1.length;
        int[][] ans= new int[row][col];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
                ans[i][j]=matrix1[i][j]-matrix2[i][j];

        }
        return ans;
    }
}
