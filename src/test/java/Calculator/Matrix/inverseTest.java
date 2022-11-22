package Calculator.Matrix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class inverseTest
{
    inverse in = new inverse();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void inverse()
    {
        double[][] expresponse =new double[][]{{1,0},{0,1}};
        double[][] response =in.inv(new double[][]{{1,0},{0,1}});
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }



}
