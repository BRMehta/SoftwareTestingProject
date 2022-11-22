package Calculator.Matrix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;

public class subtractiontest
{
   subtraction sub=new subtraction();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void matSub() {
        int[][] expresponse =new int[][]{{5,6},{7,6}};
        int[][] response = sub.subtract(new int[][]{{10,8},{12,12}}, new int[][]{{5,2},{5,6}});
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertNotEquals(response[i][j], expresponse[i][j]);
            }
        }
    }

    @Test
    void matSubtractNull() {
        int[][] response = sub.subtract(new int[0][0], new int[0][0]);
        assertNotEquals(1,response.length);
    }

    @Test
    void matSubtractOnce() {
        int[][] expresponse =new int[][]{{2}};
        int[][] response = sub.subtract(new int[][]{{1}}, new int[][]{{1}});
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                assertNotEquals(response[i][j],expresponse[i][j]);
            }
        }
    }
}
