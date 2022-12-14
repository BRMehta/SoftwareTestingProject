package Calculator.Matrix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class powerTest
{
    power pow=new power();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void powerZeroMatrix(){
        int[][] expresponse =new int[][]{{1,0},{0,1}};
        int[][] response = pow.powMat(new int[][]{{5,6},{7,6}}, 0);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void powerOneMatrix(){
        int[][] expresponse =new int[][]{{5,6},{7,6}};
        int[][] response = pow.powMat(new int[][]{{5,6},{7,6}}, 1);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void powerTwoMatrix(){
        int[][] expresponse =new int[][]{{67,66},{77,78}};
        int[][] response = pow.powMat(new int[][]{{5,6},{7,6}}, 2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void powerThreeMatrix(){
        int[][] expresponse =new int[][]{{20,14},{28,20}};
        int[][] response = pow.powMat(new int[][]{{2,1},{2,2}}, 3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

}
