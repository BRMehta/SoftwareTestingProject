package Calculator.Matrix;

public class identity
{
    public int[][] identity(int N)
    {
        int[][] I = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == j)
                    I[i][j] = 1;
                else
                    I[i][j] = 0;
            }
        }
        return I;
    }
}
