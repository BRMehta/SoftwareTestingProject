package Calculator.Matrix;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class additionTest
{
    addition add=new addition();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void matAdd()
    {
        int[][] expresponse =new int[][]{{1,2},{3,4}};
        int[][] response = add.add(new int[][]{{0,2},{2,3}}, new int[][]{{1,0},{1,1}});
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j]);
            }
        }
    }

    @Test
    void matAddNull() {
        int[][] response =add.add(new int[0][0], new int[0][0]);
        assertEquals(0,response.length);
    }

    @Test
    void matAddOnce() {
        int[][] expresponse =new int[][]{{6}};
        int[][] response =add.add(new int[][]{{5}}, new int[][]{{1}});
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                assertEquals(response[i][j],expresponse[i][j]);
            }
        }
    }
}
