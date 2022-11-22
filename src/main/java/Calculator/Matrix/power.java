package Calculator.Matrix;

public class power
{
    multiplication matMult = new  multiplication();
    identity id=new identity();

    public int[][] powMat(int[][] matrix, int power)
    {
        int N = matrix[0].length;
        int[][] result = new int[N][N];


        if(power == 0)
            return id.identity(N);

        else if(power == 1)
            return matrix;

        if(power % 2 == 0)
            result = powMat(matMult.multiply(matrix, matrix), power / 2);

        else
            result = matMult.multiply(powMat(matMult.multiply(matrix, matrix), power / 2), matrix);

        return result;
    }
}
