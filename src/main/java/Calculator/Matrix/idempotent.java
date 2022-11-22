package Calculator.Matrix;

public class idempotent
{

    power pow =new power();

    boolean isIdempotent(int[][] matrix)
    {
      int po2[][]=new int[matrix.length][matrix.length];

      po2=pow.powMat(matrix,2);


      for(int i=0;i< matrix.length;i++)
      {
          for(int j=0;j< matrix.length;j++)
          {
              if(po2[i][j]!=matrix[i][j])
                  return false;
          }
      }

      return true;
    }
}
