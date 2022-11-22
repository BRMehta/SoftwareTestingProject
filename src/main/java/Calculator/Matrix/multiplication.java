package Calculator.Matrix;

public class multiplication
{
    int[][] multiply(int[][] mat1, int[][] mat2)
    {
        int N = mat1.length;
        int[][] ans = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ans[i][j] = 0;

                for (int k = 0; k < N; k++) {
                    ans[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return ans;
    }
}
